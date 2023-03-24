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
        return (kju.getNama())
    }

    @Override
    public String toString() {
        return "KIP [kodeProv=" + kodeProv + ", kodeKab=" + kodeKab + ", kodeKec=" + kodeKec + ", kju=" + kju
                + ", noUrut=" + noUrut + "]";
    }

    

}