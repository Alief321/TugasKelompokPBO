import java.util.ArrayList;
/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */
public class KodeProv <T> extends Kode <T>{
    private ArrayList<String> daftarNama = new ArrayList<>();
    private String namaProv;

    public KodeProv(T value, String namaProv) {
        super("KodeProv","DPP.02",value,2);
        this.namaProv =namaProv;
        validate();
    }
    
    public void addKabupaten(KodeKab kodeKab){
        this.daftarNama.add(kodeKab.getNama());
    }
    public ArrayList getKabupatenList(){
        return daftarNama;
    }

    public String getNamaProv() {
        return namaProv;
    }
    
    public boolean validate(){
        int value = Integer.parseInt((String)this.getValue());
        if(value<39 && value>0){
            if(checkValue(true)){
               System.out.println("Validasi Sukses! Object Provinsi Akan Dibuat!");
               return true;
            }
            return false;
        }
        else{
            Object obj = this;
            System.out.println("Validasi Gagal! Harap Ulang Input Data Object Provinsi!");
            delete(obj);
            System.exit(0);
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "\nKode Prov = "+getValue()+"\nnama Provinsi = "+namaProv;
    }
    
}
