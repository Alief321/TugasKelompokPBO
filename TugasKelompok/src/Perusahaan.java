/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */
public class Perusahaan {
    private int noUrut;
    private KIP kodeIdentitas;
    private Kalimat namaPerusahaan;
    private Kalimat alamat;
    private Kalimat telp;
    private Kalimat fax;
    private Kode BBH;
    private Subsektor subsektor;
    private DPP dpp;
    private String JUU;

    public Perusahaan() {
    }
    
    public Perusahaan(int noUrut, KIP kodeIdentitas, Kalimat namaPerusahaan, Kalimat alamat, Kalimat telp, Kalimat fax, Kode BBH, Subsektor subsektor, DPP dpp, String JUU) {
        if (validate(namaPerusahaan, alamat, telp, fax, BBH)) {
            this.noUrut = noUrut;
            this.kodeIdentitas = kodeIdentitas;
            this.namaPerusahaan = namaPerusahaan;
            this.alamat = alamat;
            this.telp = telp;
            this.fax = fax;
            this.BBH = BBH;
            this.subsektor = subsektor;
            this.dpp = dpp;
            this.JUU = JUU;
        }
    }

    public Kalimat getAlamat() {
        return alamat;
    }

    public Kode getBBH() {
        return BBH;
    }

    public DPP getDpp() {
        return dpp;
    }

    public Kalimat getFax() {
        return fax;
    }

    public String getJUU() {
        return JUU;
    }

    public KIP getKodeIdentitas() {
        return kodeIdentitas;
    }

    public Kalimat getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public int getNoUrut() {
        return noUrut;
    }

    public Subsektor getSubsektor() {
        return subsektor;
    }

    public Kalimat getTelp() {
        return telp;
    }

     public boolean validate(Kalimat namaPerusahaan, Kalimat alamat, Kalimat telp, Kalimat fax, Kode BBH ){
        if(namaPerusahaan.checkValue()&& alamat.checkValue() && telp.checkValue()&&telp.validatenomer((String)telp.getValue(), (String)fax.getValue()) && fax.checkValue() && BBH.checkValue()){
            System.out.println("Validasi Sukses! Object Perusahaan Akan Dibuat!");
            return true;
        }
        else{
            Object[] obj = {namaPerusahaan,alamat,telp,fax,BBH};
            System.out.println("Validasi Gagal! Harap Ulang Input Data Object Perusahaan!");
            deletePerusahaan(obj);
            return false;
        }
     }
     
     public void delete(Object obj){
         obj = new Object();
         obj = null;
     }
      public void deletePerusahaan(Object[] objs){
        for (Object obj:objs){
            delete(obj);
        }
        System.out.println("Input Sebelumnya Sudah Berhasil Dihapus");
    }
    @Override
    public String toString() {
       return "===== Daftar Direktori Perusahaan Pertanian Berbadan Hukum ====="
               +"\nNo Urut dalam Kabupaten    = "+noUrut+
               "\nNama Perusahaan            = "+namaPerusahaan.getValue()+
               "\nProvinsi                   = "+kodeIdentitas.getKodeProv().getNamaProv()+
               "\nKabupaten                  = "+kodeIdentitas.getKodeKab().getNamaKab()+
               "\nId Kecamatan               = "+kodeIdentitas.getKodeKec().getValue()+
               "\nAlamat Perushaan Pertanian = "+alamat.getValue()+
               "\nNomor Telphone             = "+telp.getValue()+
               "\nNomor Faksimili            = "+fax.getValue()+
               "\nJenis Usaha Utama          = "+JUU+"\n"; 
    }
    
}
