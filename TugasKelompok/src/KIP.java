/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */
public class KIP {
    private KodeProv kodeProv;
    private KodeKab kodeKab;
    private KodeKec kodeKec;
    private Kode kju;
    private int noUrut;
    
    
    public KIP(KodeProv kodeProv, KodeKab kodeKab, KodeKec kodeKec, Kode kju, int noUrut) {
        this.kodeProv = kodeProv;
        this.kodeKab = kodeKab;
        this.kodeKec = kodeKec;
        this.kju = kju;
        this.noUrut = noUrut;
    }
    
    public int getNoUrut() {
        return noUrut;
    }
    
    public String getdescKJU(Kode kju){
        return (String) kju.<String>getValue();
    }

    @Override
    public String toString() {
        return "KIP [kodeProv=" + kodeProv + ", kodeKab=" + kodeKab + ", kodeKec=" + kodeKec + ", kju=" + kju
                + ", noUrut=" + noUrut + "]";
    }

    

}