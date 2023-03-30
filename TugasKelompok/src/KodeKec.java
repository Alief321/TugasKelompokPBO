/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */
import java.util.ArrayList;

public class KodeKec <T> extends Kode <T> {
    private ArrayList<String> daftarNama = new ArrayList<>();
    
    public KodeKec(T value) {
        super("Kode Kecamatan","DP.03",value,2);
    }
    
    
    public static boolean validateKecamatan(int value){
        if(value<39 && value>0){
            System.out.println("Validasi Sukses! Object Kecamatan Akan Dibuat!");
            return true;
        }
        else{
            Object obj = value;
            System.out.println("Validasi Gagal! Harap Ulang Input Data Object Kecamatan!");
            obj = null;
            return false;
        }
    }
    @Override
    public String toString(){
        return "\nKode Kecamatan = "+getValue();
    }  
    
}
