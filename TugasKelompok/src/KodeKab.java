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
    
    public KodeKab(String nama, String id, T value, int length) {
        super(nama,id,value,length);
    }
   
    public void addKecamatan(KodeKec kodeKec){
        this.daftarNama.add(kodeKec.getNama());
    }
    
    public ArrayList getKecamatanList(){
        return daftarNama;
    }
    
    @Override
    public String toString(){
        return "Kode Kec = "+getNama();
    }  
}