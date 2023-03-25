import java.util.Scanner;
import java.util.HashMap;

/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String kodeProv,kodeKab,kodeKec,alamat,namaPerusahaan,telp,fax,Input;
        System.out.println("Program Validasi Kuesioner PPBH");
        System.out.println("1. Input Kuesioner");
        System.out.println("2. LIhat List Perusahaan");
        System.out.println("3. Exit");
        Input = userInput.nextLine();
        switch (Input) {
            case "1":
                try {
                
            } catch (Exception e) {
            } finally{
                    
                }
                break;
            case "2":
                break;
            case "3":
                System.exit(0);
                break;
            default:
                throw new AssertionError();
        }
        
    }
}
