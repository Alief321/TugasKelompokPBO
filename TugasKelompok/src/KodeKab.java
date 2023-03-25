import java.util.ArrayList;
/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */
public class KodeKab <T> extends Kode <T> {
    private ArrayList<String> daftarNama = new ArrayList<>();
    private String namaKab;
    
    public KodeKab(T value ,String namaKab) {
        super("KodeKab","DPP.02",value,2);
        this.namaKab=namaKab;
        validate();
    }
   
    public void addKecamatan(KodeKec kodeKec){
        this.daftarNama.add(kodeKec.getNama());
    }
    
    public ArrayList getKecamatanList(){
        return daftarNama;
    }
    
    public boolean validate(){
        if(this.checkValue(true)){
            System.out.println("Validasi Sukses! Object Kabupaten Akan Dibuat!");
            return true;
        }
        else{
            Object obj = this;
            System.out.println("Validasi Gagal! Harap Ulang Input Data Object Kabupaten!");
            delete(obj);
            System.exit(0);
            return false;
        }
    }

    public String getNamaKab() {
        return namaKab;
    }
    
    @Override
    public String toString(){
        return "Kode Kab = "+getValue()+", nama Kabupaten = "+namaKab;
    }  
}