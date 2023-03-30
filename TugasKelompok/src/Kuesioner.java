
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

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setKodeProv(KodeProv kodeProv) {
        this.kodeProv = kodeProv;
    }

    public KodeProv getKodeProv() {
        return kodeProv;
    }

    public void setKodeKab(KodeKab kodeKab) {
        this.kodeKab = kodeKab;
    }

    public KodeKab getKodeKab() {
        return kodeKab;
    }

    public void setPeriodeData(int PeriodeData) {
        this.PeriodeData = PeriodeData;
    }

    public int getPeriodeData() {
        return PeriodeData;
    }
    
    public void setListAllPerusahaan(ArrayList<Perusahaan> listAllPerusahaan) {
        this.listAllPerusahaan = listAllPerusahaan;
    }

    public String getListAllPerusahaan() {
        String kata="";
        for (Perusahaan perusahaan : listAllPerusahaan) {
            kata += perusahaan.toString();
        }
        return kata;
    }

    public static int getCountPerusahaan() {
        return countPerusahaan;
    }

    
    @Override
    public String toString() {
        return "\n===== Informasi Perusahaan ====="+
                "\nId               = "+id+
                "\nKode Provinsi    = "+kodeProv.getValue()+
                "\nKode Kabupaten   = "+kodeKab.getValue()+
                "\nPeriode Data     = "+PeriodeData+"\n";
    }
    
    
}
