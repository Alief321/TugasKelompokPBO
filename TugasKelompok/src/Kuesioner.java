
import java.util.ArrayList;

/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */
public class Kuesioner {
    private int id;
    private KodeProv kodeProv;
    private KodeKab kodeKab;
    private int PeriodeData;
    private static int countPerusahaan=0;
    private ArrayList<Perusahaan> listAllPerusahaan = new ArrayList<>();
    
    public Kuesioner(int id, KodeProv kodeProv, KodeKab kodeKab, int PeriodeData) {
        this.id = id;
        this.kodeProv = kodeProv;
        this.kodeKab = kodeKab;
        this.PeriodeData = PeriodeData;
    }

    
    
    public void setListAllPerusahaan(ArrayList<Perusahaan> listAllPerusahaan) {
        this.listAllPerusahaan = listAllPerusahaan;
    }

    public ArrayList<Perusahaan> getListAllPerusahaan() {
        return listAllPerusahaan;
    }

    public static int getCountPerusahaan() {
        return countPerusahaan;
    }

    @Override
    public String toString() {
        return "Kuesioner[id= "+id+", kodeProv= "+kodeProv.getValue()+", kodeKab = "+kodeKab.getValue()+", periode data="+PeriodeData+" ]";
    }
    
    
}
