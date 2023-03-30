/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String kodeKab = "", kodeProv="",kodeKju="" ,kodeKec="",alamat="",namaPerusahaan="",telp="",fax="",input = "",namaprov="", namakab="" ,kodeBBH="",kodeKunj="",kodeActive="",kodeTanPang="", kodeHortikultura="", kodePerkebunan="", kodeKehutanan="", kodePerikanan="", kodePeternakan="",descJUU="";
        KIP kip = null;
        DPP dpp = null;
        Subsektor subsektor = null;
        KodeProv<String> provinsi=null;
        KodeKab<String> kabupaten=null;
        KodeKec<String> kecamatan=null;
        Kode<String> bbh=null ,kju=null, tanPang=null, hortikultura=null ,perkebunan=null, kehutanan=null, perikanan=null , peternakan=null, kunjungan = null, aktif=null;
        Kalimat<String> namaPerusahaanFix = null,telpFix= null, faxFix = null, alamatFix=null;
        Kuesioner kuesioner = null;
        Perusahaan perusahaan = null;
        ArrayList<Perusahaan> listAllPerusahaan = new ArrayList<>();
        int periodeData = 0, idKues = 0 ,i=0, noUrut=0;
        boolean loop = true;
        
//        Kode BBH
        HashMap<String,String> BBHList = new HashMap<String,String>(){{
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
        LinkedHashMap<String,String> kodeJUU = new LinkedHashMap<String,String>(){{
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
        LinkedHashMap<String,String> umum = new LinkedHashMap<String,String>(){{
            put("0", "tidak ada");
            put("1", "ada");
        }};
        
//       Kode Aktiv
        LinkedHashMap<String,String> active = new LinkedHashMap<String,String>(){{
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
        LinkedHashMap<String,String> kebun = new LinkedHashMap<String,String>(){{
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
            System.out.println("Kode Provinsi "+ANSI_YELLOW+"(1/2/3/4/5,..)"+ANSI_RESET+": ");
            kodeProv = userInput.nextLine();
            System.out.println("Nama Provinsi "+ANSI_YELLOW+"(Jawa Tengah/DKI Jakarta/...)"+ ANSI_RESET+": ");
            namaprov = userInput.nextLine();
            System.out.println("Kode Kabupaten "+ANSI_YELLOW+"(1/2/3/4/5,..)"+ANSI_RESET+": ");
            kodeKab = userInput.nextLine();
            System.out.println("Nama Kabupaten "+ANSI_YELLOW+"(Jombang/Madiun/...)"+ANSI_RESET+": ");
            namakab= userInput.nextLine();
            System.out.println("Periode data "+ANSI_YELLOW+"(Tahun misal: 2019)"+ANSI_RESET+": ");
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
                        System.out.println("Kode Provinsi "+ANSI_YELLOW+"(harus sama dengan Kode Provinsi Kuesioner)"+ANSI_RESET+" :");
                        kodeProv = userInput.nextLine();
                        if (!kodeProv.equalsIgnoreCase(provinsi.getValue())) {
                            System.out.println("Kesalahan input kode Provinsi");
                            throw new Exception("Kode Provinsi kuesioner dan perusahaan harus sama");
                        }
                        System.out.println("Kode Kabupaten "+ANSI_YELLOW+"(harus sama dengan Kode Kabupaten Kuesioner)"+ANSI_RESET+" :");
                        kodeKab = userInput.nextLine();
                        if (!kodeKab.equalsIgnoreCase(kabupaten.getValue())) {
                            System.out.println("Kesalahan input kode Kabupaten");
                            throw new Exception("Kode Kabupaten kuesioner dan perusahaan harus sama");
                        }
                        System.out.println("Kode Kecamatan"+ANSI_YELLOW+"(harus angka)"+ANSI_RESET+" :");
                        kodeKec = userInput.nextLine();
                        if(!KodeKec.validateKecamatan(Integer.parseInt(kodeKec))){
                            System.out.println("Kesalahan input kode Kecamatan");
                            throw new Exception("Kode Kecamatan harus angka diantara 1-38");
                        }
                        System.out.println("\nDaftar KJU");
                        for (Map.Entry<String, String> entry : kodeJUU.entrySet()) {
                            Object key = entry.getKey();
                            Object val = entry.getValue();
                            System.out.println(key+" "+val);
                        }
                        System.out.println("Kode KJU "+ ANSI_YELLOW+"(angkanya saja) :"+ANSI_RESET);
                        kodeKju= userInput.nextLine();
                        if (kodeJUU.containsKey(kodeKju)==false) {
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
                        kju = new Kode<>("KodeKju","DP.04",kodeKju,kodeJUU,2);
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
                        System.out.println("Nomor Telephone "+ANSI_YELLOW+"(awali dengan +62 atau + kode negara lain)"+ANSI_RESET+" :");
                        telp = userInput.nextLine();
                        System.out.println("Nomor Faksimili "+ANSI_YELLOW+"(awali dengan kode wilayah misal (021) )"+ANSI_RESET+" :");
                        fax = userInput.nextLine();
                        System.out.println("\nDaftar BBH");
                        for (Map.Entry<String, String> entry : BBHList.entrySet()) {
                            Object key = entry.getKey();
                            Object val = entry.getValue();
                            System.out.println(key+" "+val);
                        }
                        System.out.println("Bentuk Badan Hukum "+ANSI_YELLOW+"(angkanya saja) : "+ANSI_RESET);
                        kodeBBH = userInput.nextLine();
                         if (BBHList.containsKey(kodeBBH)==false) {
                            System.out.println("Kesalahan input BBH");
                            throw new Exception("Kode BBH tidak ada dalam Kriteria BPS");
                         }
                    } catch (Exception e) {
                        System.out.println("Process Input Informasi umum error");
                        System.out.println(e);
                        System.exit(0);
                    }
//                    Input DPP
                    try {
                        System.out.println("Input Pencacahan dengan Kuesioner Rutin/DPP\n");
                        System.out.println("Daftar Kunjungan\n");
                        for (Map.Entry<String, String> entry : umum.entrySet()) {
                            Object key = entry.getKey();
                            Object val = entry.getValue();
                            System.out.println(key+" "+val);
                        }
                        System.out.println("Kunjungan: "+ANSI_YELLOW+"(angkanya saja) : "+ANSI_RESET);
                        kodeKunj = userInput.nextLine();
                        if (umum.containsKey(kodeKunj)==false) {
                            System.out.println("Kesalahan input Kunjungan");
                            throw new Exception("Kode kunjungan tidak ada dalam Kriteria BPS");
                         }
                        System.out.println("Daftar Kategori Aktif\n");
                        for (Map.Entry<String, String> entry : active.entrySet()) {
                            Object key = entry.getKey();
                            Object val = entry.getValue();
                            System.out.println(key+" "+val);
                        }
                        System.out.println("Aktiv: "+ANSI_YELLOW+"(angkanya saja) : "+ANSI_RESET);
                        kodeActive = userInput.nextLine();
                        if (active.containsKey(kodeActive)==false) {
                            System.out.println("Kesalahan input kodeActive");
                            throw new Exception("Kode Aktif tidak ada dalam Kriteria BPS");
                         }
                    } catch (Exception e) {
                        System.out.println("Process Input DPP error");
                        System.out.println(e);
                        System.exit(0);
                    }
                    
//                    Generate Subsektor dan JUU
                    try {
                        System.out.println("Generate Subsektor dan JUU");
                        System.out.println("Memuat...");
                        if(kodeKju.equals("1")){
                            kodeTanPang = "1";
                        }else{
                            kodeTanPang = "0";
                        }
                        
                        if (kodeKju.equals("2")) {
                            kodeHortikultura = "1";
                        } else {
                            kodeHortikultura = "0";
                        }
                        
                        if (kodeKju.equals("9")||kodeKju.equals("10")||kodeKju.equals("11")) {
                            kodePeternakan = "1";
                        } else {
                            kodePeternakan = "0";
                        }
                        
                        if (kodeKju.equals("4")||kodeKju.equals("5")||kodeKju.equals("6")) {
                            kodeKehutanan = "1";
                        } else {
                            kodeKehutanan = "0";
                        }
                        
                        if (kodeKju.matches("^7")||kodeKju.equals("8")) {
                            kodePerikanan = "1";
                        } else {
                            kodePerikanan = "0";
                        }
                        
                        if (kodeKju.matches("^3")){
                            kodePerkebunan = kodeKju;
                        } else{
                            kodePerkebunan = "0";
                        }
                        
                        tanPang = new Kode<>("KodeTanpang","DPP.14",kodeTanPang,2);
                        hortikultura = new Kode<>("KodeHortikultura","DP.15",kodeHortikultura,2);
                        perkebunan = new Kode<>("KodePerkebunan","DPP.16",kodePerkebunan,2);
                        peternakan = new Kode<>("KodePeternakan","DPP.17",kodePeternakan,2);
                        kehutanan = new Kode<>("KodeKehutanan","DPP.18",kodeKehutanan,2);
                        perikanan = new Kode<>("KodePerikanan","DPP.19",kodePerikanan,2);
                        
                        subsektor = new Subsektor(tanPang, hortikultura, perkebunan, kehutanan, peternakan, perikanan);
                        descJUU = kodeJUU.get(kodeKju);
                    } catch (Exception e) {
                        System.out.println("Generate JUU & Subsektor error");
                        System.out.println(e);
                        System.exit(0);
                    }
                    
//                    Membuat Variabel Perusahaan
                    try {
                        System.out.println("Membuat variabel perusahaan");
                        System.out.println("Memuat variabel...");
                        namaPerusahaanFix = new Kalimat<>("NamaPerusahaan", "DPP.07", namaPerusahaan);
                        alamatFix = new Kalimat<>("AlamatPerusahaan", "DPP.08", alamat);
                        telpFix = new Kalimat<>("Telephone", "DPP.09", telp);
                        faxFix = new Kalimat<>("Fax", "DPP.10", fax);
                        bbh = new Kode<>("BBH", "DPP.11", kodeBBH,BBHList,2);
                        kunjungan = new Kode<>("kunjungan", "DPP.12", kodeKunj,umum, 2);
                        aktif = new Kode<>("aktif", "DPP.13", kodeActive,active, 2);
                        dpp = new DPP(kunjungan, aktif);
                        perusahaan = new Perusahaan(noUrut, kip, namaPerusahaanFix, alamatFix, telpFix, faxFix, bbh, subsektor, dpp, descJUU);
                        listAllPerusahaan.add(perusahaan);
                        kuesioner.setListAllPerusahaan(listAllPerusahaan);
                    } catch (Exception e) {
                        System.out.println("Membuat Variabel Perusahaan gagal");
                        System.out.println(e);
                        System.exit(0);
                    }
                    break;
                case "2":
                    if (kuesioner.getListAllPerusahaan().isEmpty()){
                        System.out.println("Belum ada perusahaan yang didata\n");
                    } else{
                        System.out.println(kuesioner.getListAllPerusahaan()+"\n");
                    }
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
