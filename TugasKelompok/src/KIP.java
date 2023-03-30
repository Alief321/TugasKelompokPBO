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
       if(validate(kodeProv, kodeKab, kodeKec, kju)){
        this.kodeProv = kodeProv;
        this.kodeKab = kodeKab;
        this.kodeKec = kodeKec;
        this.kju = kju;
        this.noUrut = noUrut;
       }
    }
    
    public int getNoUrut() {
        return noUrut;
    }

    public Kode getKju() {
        return kju;
    }

    public KodeKab getKodeKab() {
        return kodeKab;
    }

    public KodeKec getKodeKec() {
        return kodeKec;
    }

    public KodeProv getKodeProv() {
        return kodeProv;
    }
    
    
    public boolean validate(KodeProv kodeProv, KodeKab kodeKab, KodeKec kodeKec, Kode kju ){
        if(kodeProv.checkValue(true)&& kodeKab.checkValue(true) && kodeKec.checkValue(true) && kju.checkValue()){
            System.out.println("Validasi Sukses! Object KIP Akan Dibuat!");
            return true;
        }
        else{
            Object[] obj = {kodeProv,kodeKab,kodeKec,kju};
            System.out.println("Validasi Gagal! Harap Ulang Input Data Object Kecamatan!");
            deleteKIP(obj);
            return false;
        }
     }
     
     public void delete(Object obj){
        obj = null;
     }
      public void deleteKIP(Object[] objs){
        for (Object obj:objs){
            delete(obj);
        }
        System.out.println("Input Sebelumnya Sudah Berhasil Dihapus");
    }

    @Override
    public String toString() {
        return "KIP\n"+
                "\nProvinsi" + kodeProv + 
                "\nKabupaten=" + kodeKab + 
                "\nKecamatan=" + kodeKec + 
                "\nKJU=" + kju
                + "\nnoUrut=" + noUrut;
    }

    

}