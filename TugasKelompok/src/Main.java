/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String kodeKab = "", kodeProv="",kodeKec="",alamat="",namaPerusahaan="",telp="",fax="",input = "",namaprov="", namakab="";
        KodeProv<String> provinsi=null;
        KodeKab<String> kabupaten=null;
        KodeKec<String> kecamatan=null;
        Kode<String> dpp=null, bbh=null ,jju=null;
        Kuesioner kuesioner = null;
        int periodeData = 0, idKues = 0 ,i=0;
        boolean loop = true;
        
//        Kode BBH
        HashMap<String,String> kodeBBH = new HashMap<>(){{
            put("01", "Perusahaan Negara (PN)");
            put("02", "Perusahaan Daerah (PD)");
            put("03", "Persero");
            put("04", "Perum");
            put("05", "Perseroan Terbatas (PT)");
            put("06", "Naamloze Vennootschap (NV)");
            put("07", " Commanditaire Venootschap (CV)");
            put("08", "Firma");
            put("09", "Koperasi/KUD");
            put("10", "Yayasan");
        }};
        
//        Kode Jenis Usaha Utama
        HashMap<String,String> kodeJJU = new HashMap<>(){{
            put("1", "Padi/Palawija");
            put("2","Hortikultura");
            put("3a","Perkebunan Kakao/cokelat");
            put("3b","Perkebunan Kare");
            put("3c","Perkebunan Kelapa sawit");
            put("3d","Perkebunan Kopi");
            put("3e","Perkebunan Teh");
            put("3f","Perkebunan Tebu");
            put("3g","Perkebunan Tembakau");
            put("3h","Perkebunan Cengkeh");
            put("3i","Perkebunan Kelapa");
            put("3j","Perkebunan Lada");
            put("3k","Tanaman Perkebunan Lainnya");
            put("4","HPH/IUPHHK-HA");
            put("5","HPHT/IUPHHK-HT/Perhutani/Kehutanan lainnya");
            put("6","Penangkaran STL");
            put("7a","Budidaya Udang");
            put("7b","Budidaya Bandeng");
            put("7c","Budidaya Ikan lainnya di tambak");
            put("7d","Budidaya Ikan di laut");
            put("7e","Budidaya Ikan di air tawar");
            put("7f","Budidaya Pembenihan");
            put("8","Penangkapan Ikan");
            put("9","Ternak Besar/Kecil");
            put("10","Unggas");
            put("11","Ternak Sapi Perah");
        }};
        
        System.out.println("Program Validasi Kuesioner PPBH\n");
        
        //              Input Kkuesioner
        try {
            System.out.println("Input Kuesioner Details");
            System.out.println("Kode Provinsi : ");
            kodeProv = userInput.nextLine();
            System.out.println("Nama Provinsi : ");
            namaprov = userInput.nextLine();
            System.out.println("Kode Kabupaten: ");
            kodeKab = userInput.nextLine();
            System.out.println("Nama Kabupaten: ");
            namakab= userInput.nextLine();
            System.out.println("Periode data: ");
            periodeData = userInput.nextInt();
        } catch (Exception e) {
            System.out.println("Proses Input Error");
        }
//            Membuat Variabel Kuesioner
        try {
            System.out.println("Membuat Kuesioner");        
            System.out.println("Memuat Variabel...");
            idKues++;
            provinsi = new KodeProv<>(kodeProv,namaprov);
            kabupaten = new KodeKab<>(kodeKab, namakab);
            kuesioner = new Kuesioner(idKues, provinsi, kabupaten, periodeData);
            System.out.println(kuesioner);
        }catch (Exception e) {
            System.out.println("Input Kuesioner error harap ulangi input");
            System.out.println(e);
        }

        while (loop= true){
            System.out.println("1. Input Perusahaan");
            System.out.println("2. Lihat List Perusahaan");
            System.out.println("3. Exit");
            System.out.println("\nSilahkan Input Nilai : ");
//          Mengatasi input loop pertama keskip
            if (i==0){
               input = userInput.nextLine();
               input = userInput.nextLine();
            }else{
                input = userInput.nextLine();
            }
            i++;
            switch (input) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    System.exit(0);
                    loop = false;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        

    }
}
