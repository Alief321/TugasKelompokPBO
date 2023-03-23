import java.util.HashMap;
/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */
public class Kode <T> extends ChangerType<T>{
    final private String type = "Kode";
    private String temp;
    private HashMap<String,String> daftarKode;
    private int length;
    public Kode(String nama, String id, T value, int length){
        super(nama,id,value);
        this.length = length;
    }
    public Kode(String nama, String id, T value, HashMap<String,String> daftarKode, int length){
        super(nama,id,value);
        this.daftarKode = daftarKode;
        this.length = length;
    }
    public String getType() {
        return type;
    }
    public String getTemp(){
        return temp;
    }
    public void setTemp(T value){
        this.temp = (String) getValue();
    }
    public HashMap<String,String> getKamusKode(){
        return daftarKode;
    }
    public int getLength(){
        return length;
    }
    public boolean typeError(T value){
        if (value instanceof String){
            return false;
        } else {
            System.out.printf("Tipe Variabel %s Salah",super.getNama());
            return true;
        }
    }
    public boolean constraintError(T value,int length){
        try {
            setTemp(value);
            if (getTemp().length()>length){
                throw new KodeError(String.format("Nilai Variabel %s Salah",super.getNama()));
            }
        } catch (KodeError e){
            System.out.println(e);
        } finally {
            if (getTemp().length()<=length){
                return false;
            }
            return true;
        }
    }
    public boolean constraintError(T value,HashMap<String,String> daftarKode,int length){
        try {
            setTemp(value);
            if (!daftarKode.containsKey(getTemp())){
                throw new InputError(String.format("Nilai Variabel %s Salah",super.getNama()));
            }
            if (getTemp().length()>length){
                throw new KodeError(String.format("Nilai Variabel %s Salah",super.getNama()));
            }
        } catch (InputError e){
            System.out.println(e);
        } catch (KodeError e){
            System.out.println(e);
        } finally {
            if (daftarKode.containsKey(getTemp()) && getTemp().length()<=length){
                return false;
            } else {
                return true;
            }
        }
    }
    public boolean checkValue(boolean identifier){
        if (typeError(super.getValue()) || constraintError(super.getValue(),getLength())){
            System.out.println(getNama()+" error");
            return false;
        }
        return true;
    }
    public boolean checkValue(){
        if (typeError(super.getValue()) || constraintError(super.getValue(),getKamusKode(),getLength())){
            return false;
        }
        return true;
    }
    public String getValueKode(){
        return daftarKode.get(super.getValue());
    }

    public String toString(boolean identifier){
        return String.format("%s-Nilai dari variabel %s(%s) yaitu: '%s'",getType(),super.getNama(),super.getId(),super.getValue());
    }

    public String toString(){
        return String.format("%s-Nilai dari variabel %s(%s) yaitu: [Kode: '%s', Label: '%s']",getType(),super.getNama(),super.getId(),super.getValue(),getValueKode());
    }
}
class KodeError extends Exception {
    public KodeError(String message){
        super(message);
    }
}