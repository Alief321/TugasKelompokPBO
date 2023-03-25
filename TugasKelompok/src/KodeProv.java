/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */
import java.util.ArrayList;
public class KodeProv <T> extends Kode <T>{
    private ArrayList<String> daftarNama = new ArrayList<>();

    public KodeProv(String nama, String id, T value, int length) {
        super(nama,id,value,length);
    }
    public void addKabupaten(KodeKab kodeKab){
        this.daftarNama.add(kodeKab.getNama());
    }
    public ArrayList getKabupatenList(){
        return daftarNama;
    }
    
    @Override
    public String toString(){
        return "Kode Kab = "+getNama();
    }  
}
