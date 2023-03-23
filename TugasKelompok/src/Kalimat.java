/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */
public class Kalimat <T> extends ChangerType<T>{
    final private String type = "KALIMAT";
    final int jumlahKata = 1000;
    private String temp;
    public Kalimat(String nama, String id, T value){
        super(nama,id,value);
    }
    public String getType() {
        return type;
    }
    public String getTemp(){
        return temp;
    }
    public void setTemp(T value){
        this.temp = String.valueOf(value);
    }
    public boolean typeError(T value){
        if (value instanceof String){
            return false;
        } else {
            System.out.printf("Tipe Variabel %s Salah",super.getNama());
            return true;
        }
    }
    public boolean constraintError(T value){
        try {
            setTemp(value);
            if (getTemp().length()>jumlahKata){
                throw new InputError(String.format("Nilai Variabel %s Salah",super.getNama()));
            }
        } catch (Exception e){
            System.out.println(e);
        } finally {
            if (getTemp().length()>jumlahKata){
                return true;
            }
            return false;
        }
    }
    public boolean checkValue(){
        if (typeError(super.getValue()) || constraintError(super.getValue())){
            System.out.println(getNama()+" error");
            return false;
        }
        return true;
    }
    public String toString(){
        return String.format("%s-Nilai dari variabel %s(%s) yaitu: %s",getType(),super.getNama(),super.getId(),super.getValue());
    }
}

