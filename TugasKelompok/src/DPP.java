/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */
public class DPP{
    private Kode kunjungan;
    private Kode aktif;

    public DPP(Kode kunjungan, Kode aktif) {
        this.kunjungan = kunjungan;
        this.aktif = aktif;
    }

    public Kode getAktif() {
        return aktif;
    }

    public Kode getKunjungan() {
        return kunjungan;
    }

    public void setAktif(Kode aktif) {
        this.aktif = aktif;
    }

    public void setKunjungan(Kode kunjungan) {
        this.kunjungan = kunjungan;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
