import java.util.ArrayList;
/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */
public class KodeProv <T> extends Kode <T>{
    private ArrayList<String> daftarNama = new ArrayList<>();
    private String namaProv;

    public KodeProv(T value, String namaProv) {
        super("KodeProv","DPP.02",value,2);
        this.namaProv =namaProv;
    }
    
    public void addKabupaten(KodeKab kodeKab){
        this.daftarNama.add(kodeKab.getNama());
    }
    public ArrayList getKabupatenList(){
        return daftarNama;
    }

    public String getNamaProv() {
        return namaProv;
    }
    
    public boolean validate() throws InputError, NumberFormatException {
    if(checkValue(true)){
        try {
            int value = Integer.parseInt((String)this.getValue());
            if(value<39 && value>0){
                if (namaProv.isEmpty()) {
                    throw new InputError("Nama Provinsi tidak boleh kosong!");
                } else if (!namaProv.matches("(?i)^[a-z]+(?:\\s[a-z]+)*$")) {
                    throw new InputError("Nama Provinsi tidak valid! Silakan input ulang.");
                }
                System.out.println(Main.ANSI_GREEN+"Validasi Sukses! Object Provinsi Akan Dibuat!"+Main.ANSI_RESET);
                return true;
            } else {
                throw new InputError(String.format("Nilai Variabel %s Salah", getNama()));
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException(String.format("Nilai Variabel %s Harus Berupa Angka", getNama()));
        }
    } else{
        return false;
    }
}


    @Override
    
    public String toString(){
        return "\nKode Provinsi = "+getValue()+
               "\nNama Provinsi = "+namaProv;
    }
    
}
