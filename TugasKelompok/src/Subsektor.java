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

    public Subsektor(Kode tanamanPangan, Kode holtikultura, Kode perkebunan, Kode kehutanan, Kode peternakan, Kode perikanan) throws InputError {
        if (validate(tanamanPangan, holtikultura, perkebunan, kehutanan, peternakan, perikanan)) {
            this.tanamanPangan = tanamanPangan;
            this.holtikultura = holtikultura;
            this.perkebunan = perkebunan;
            this.kehutanan = kehutanan;
            this.peternakan = peternakan;
            this.perikanan = perikanan;
        }

    }

    public boolean validate(Kode tanamanPangan, Kode holtikultura, Kode perkebunan, Kode kehutanan, Kode peternakan, Kode perikanan ) throws InputError{
        if(tanamanPangan.checkValue(true)&& holtikultura.checkValue(true) && perkebunan.checkValue(true) && kehutanan.checkValue(true) && perikanan.checkValue(true)){
            System.out.println(Main.ANSI_GREEN+"Validasi Sukses! Object Subsektor Akan Dibuat!"+Main.ANSI_RESET);
            return true;
        }
        else{
            Object[] obj = {tanamanPangan,peternakan,perkebunan,perikanan,kehutanan,holtikultura};
            System.out.println(Main.ANSI_RED+"Validasi Gagal! Harap Ulang Periksa Kembali Data Object Subsektor"+Main.ANSI_RESET);
            deleteSubSektor(obj);
            return false;
        }
     }
     
    public void delete(Object obj){
        obj = null;
    }
    
    public void deleteSubSektor(Object[] objs){
        for (Object obj:objs){
            delete(obj);
        }
        System.out.println("Input Sebelumnya Sudah Berhasil Dihapus");
    } 

    @Override
    public String toString() {
        return  "\nTanaman Pangan [" + tanamanPangan.getValue()+"]"+
                "\nHoltikultura   [" + holtikultura.getValue()+"]"+
                "\nPerkebunan     [" + perkebunan.getValue()+"]"+
                "\nKehutanan      [" + kehutanan.getValue()+"]"+
                "\nPeternakan     [" + peternakan.getValue()+"]"+
                "\nPerikanan      [" + perikanan.getValue()+"]";
    }
}
