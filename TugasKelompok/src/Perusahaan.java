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

     public boolean validate(Kalimat namaPerusahaan, Kalimat alamat, Kalimat telp, Kalimat fax, Kode BBH ){
        if(namaPerusahaan.checkValue()&& alamat.checkValue() && telp.checkValue() && fax.checkValue() && BBH.checkValue()){
            System.out.println("Validasi Sukses! Object Kecamatan Akan Dibuat!");
            return true;
        }
        else{
            Object[] obj = {namaPerusahaan,alamat,telp,fax,BBH};
            System.out.println("Validasi Gagal! Harap Ulang Input Data Object Kecamatan!");
            deletePerusahaan(obj);
            return false;
        }
     }
     
     public void delete(Object obj){
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
       return "Perusahaan[no Urut dalam Kabupaten = "+noUrut+"]"; 
    }
    
}
