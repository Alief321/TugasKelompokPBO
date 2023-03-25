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
import java.util.Map;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String kodeKab = "", kodeProv="",kodeKju="" ,kodeKec="",alamat="",namaPerusahaan="",telp="",fax="",input = "",namaprov="", namakab="" ,kodeBBH="";
        KIP kip = null;
        DPP dpp = null;
        Subsektor subsektor = null;
        KodeProv<String> provinsi=null;
        KodeKab<String> kabupaten=null;
        KodeKec<String> kecamatan=null;
        Kode<String> bbh=null ,kju=null;
        Kalimat<String> namaPerusahaanFix = null,telpFix= null, faxFix = null, alamatFix=null;
        Kuesioner kuesioner = null;
        int periodeData = 0, idKues = 0 ,i=0, noUrut=0;
        boolean loop = true;
        
//        Kode BBH
        HashMap<String,String> BBHList = new HashMap<>(){{
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
        
//       Kode Ada tidak ada
        HashMap<String,String> umum = new HashMap<>(){{
            put("0", "tidak ada");
            put("1", "ada");
        }};
        
//       Kode Aktiv
        HashMap<String,String> active = new HashMap<>(){{
            put("1", "Aktif");
            put("2", "Tutup Sementara/ Tidak Ada Kegiatan");
            put("3", "Belum Berproduksi");
            put("4", "Tidak Bersedia Diwawancarai");
            put("5", "Alih Usaha ke Non Pertanian");
            put("6", "Tutup");
            put("7", "Tidak Ditemukan");
            put("8", "Baru");
            put("9", "Ganda");
        }};
        
//       Kode Perkebunan
        HashMap<String,String> kebun = new HashMap<>(){{
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
            put("0", "tidak ada");
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
            System.out.println("Proses Input Kuesioner Error");
            System.exit(0);
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
            System.exit(0);
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
//                  Input KIP
                    try {
                        System.out.println("Input KIP\n");
                        System.out.println("Kode Provinsi");
                        kodeProv = userInput.nextLine();
                        if (!kodeProv.equalsIgnoreCase(provinsi.getValue())) {
                            System.out.println("Kesalahan input kode Provinsi");
                            throw new Exception("Kode Provinsi kuesioner dan perusahaan harus sama");
                        }
                        System.out.println("Kode Kabupaten");
                        kodeKab = userInput.nextLine();
                        if (!kodeKab.equalsIgnoreCase(kabupaten.getValue())) {
                            System.out.println("Kesalahan input kode Kabupaten");
                            throw new Exception("Kode Kabupaten kuesioner dan perusahaan harus sama");
                        }
                        System.out.println("Kode Kecamatan");
                        kodeKec = userInput.nextLine();
                        System.out.println("\nDaftar KJU");
                        for (Map.Entry<String, String> entry : kodeJJU.entrySet()) {
                            Object key = entry.getKey();
                            Object val = entry.getValue();
                            System.out.println(key+" "+val);
                        }
                        System.out.println("Kode KJU "+ ANSI_YELLOW+"(angkanya saja) :"+ANSI_RESET);
                        kodeKju= userInput.nextLine();
                        if (kodeJJU.containsValue(kodeKju)==false) {
                            System.out.println("Kesalahan input KJU");
                            throw new Exception("Kode KJU tidak ada dalam Kriteria BPS");
                        }
                    } catch (Exception e) {
                        System.out.println("Process Input KIP error");
                        System.out.println(e);
                        System.exit(0);
                    }
                    
//                    Membuat variabel KIP
                    try {
                        System.out.println("Membuat KIP");
                        System.out.println("Memuat variabel ...");
                        kecamatan = new KodeKec<>(kodeKec);
                        kju = new Kode<>("KodeKju","DP.04",kodeKju,kodeJJU,2);
                        noUrut++;
                        kip = new KIP(provinsi, kabupaten, kecamatan, kju, noUrut);
                        System.out.println(kip);
                    } catch (Exception e) {
                        System.out.println("Input KIP error harap ulangi input");
                        System.out.println(e);
                        System.exit(0);
                    }
                    
//                    Input Informasi Umum
                    try {
                        System.out.println("Input Informasi Umum Perusahaan\n");
                        System.out.println("Nama Perusahaan : ");
                        namaPerusahaan = userInput.nextLine();
                        System.out.println("Alamat: ");
                        alamat = userInput.nextLine();
                        System.out.println("Nomor Telephone: ");
                        telp = userInput.nextLine();
                        System.out.println("Nomor Faksimili: ");
                        fax = userInput.nextLine();
                        System.out.println("\nDaftar BBH");
                        for (Map.Entry<String, String> entry : BBHList.entrySet()) {
                            Object key = entry.getKey();
                            Object val = entry.getValue();
                            System.out.println(key+" "+val);
                        }
                        System.out.println("Bentuk Badan Hukum "+ANSI_YELLOW+"(angkanya saja) : "+ANSI_RESET);
                        kodeBBH = userInput.nextLine();
                    } catch (Exception e) {
                        System.out.println("Process Input Informasi umum error");
                    }
//                    Input DPP
                    try {
                        System.out.println("Input Pencacahan dengan Kuesioner Rutin/DPP\n");
                        System.out.println("Kunjungan: ");
                        System.out.println("Aktiv: ");
                    } catch (Exception e) {
                        System.out.println("Process Input DPP error");
                    }
                    
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
