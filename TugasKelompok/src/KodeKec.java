/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */
import java.util.ArrayList;

public class KodeKec <T> extends Kode <T> {
    private ArrayList<String> daftarNama = new ArrayList<>();
    
    public KodeKec(T value) {
        super("Kode Kecamatan","DP.03",value,3);
    }
    
    
    public boolean validate() throws InputError, NumberFormatException {
    if (checkValue(true)) {
        try {
            int value = Integer.parseInt((String)this.getValue());
            if (value<999 && value>0) {
                System.out.println(Main.ANSI_GREEN + "Validasi Sukses! Object Kecamatan Akan Dibuat!" + Main.ANSI_RESET);
                return true;
            } else {
                Object obj = this;
                delete(obj);
                throw new InputError(String.format("Nilai Variabel %s Salah", getNama()));
            }
        } catch (NumberFormatException e) {
            throw new InputError(String.format("Nilai Variabel %s Harus Berupa Angka", getNama()));
        }
    }
    return true;
}

    
    @Override
    public String toString(){
        return "\nKode Kecamatan = "+getValue();
    }  
    
}
