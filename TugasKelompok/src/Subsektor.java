/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */
public class Subsektor {
    private Kode tanamanPangan;
    private Kode holtikultura;
    private Kode perkebunan;
    private Kode kehutanan;
    private Kode peternakan;
    private Kode perikanan;

    public Subsektor(Kode tanamanPangan, Kode holtikultura, Kode perkebunan, Kode kehutanan, Kode peternakan, Kode perikanan) {
        this.tanamanPangan = tanamanPangan;
        this.holtikultura = holtikultura;
        this.perkebunan = perkebunan;
        this.kehutanan = kehutanan;
        this.peternakan = peternakan;
        this.perikanan = perikanan;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
