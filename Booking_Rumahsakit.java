import java.util.Scanner;

public class Booking_Rumahsakit {
   
    private static Scanner sc = new Scanner (System.in);
    private static String [][] dataPasien;
    private static int [][] biayaTot;
    private static int jmlPasien = 0; 
    private static boolean [][] kamarTerisi = new boolean[][]{
        new boolean[20],
        new boolean[20],
        new boolean [10] };
    
    private static double diskon = 0.1;
    private static String kodeVoucher = "NOVOUCHER";
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        boolean programRunning = true;
        while (programRunning) { 
            System.out.println("|==================================================|");
            System.out.println("|                    Menu Utama                    |");
            System.out.println("|==================================================|");
            System.out.println("|          1. Login sebagai Admin                  |");
            System.out.println("|          2. Login sebagai Pasien                 |");
            System.out.println("|          3. Exit                                 |");
            System.out.println("|==================================================|");

            System.out.print(  " Pilih opsi :  ");
            int menuUtamaChoice = sc.nextInt();
            System.out.println("|==================================================|");
            switch (menuUtamaChoice) {
                case 1:
                    Admin();
                    break;
                case 2:
                    Pasien();
                    break;
                case 3:
                    programRunning = false;
                    break;
                default:
                    System.out.println("                                                    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("       Pilihan tidak valid. Silakan pilih lagi.");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                                                    ");
                    break;
            }
        }    
 }

 private static void Admin() {
    int pilihan;

    do {
        System.out.println("|==================================================|");
        System.out.println("|===================MENU ADMIN=====================|");
        System.out.println("|               Pilihan Menu :                     |");
        System.out.println("|               1. Laporan Harian                  |");
        System.out.println("|               2. Cek Ketersediaan Kamar          |");
        System.out.println("|               3. Set Diskon / Voucher            |");
        System.out.println("|               4. Keluar                          |");
        System.out.println("|               Masukkan No Menu (1/2/3/4) :       |");
        System.out.println("|==================================================|");

        Scanner sc = new Scanner(System.in);
        pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                laporanHarian();
                break;
            case 2:
                cekKetersediaanKamar();
                break;
            case 3:
                aturDiskon();
                break;
            case 4:
                System.out.println("Terimakasih  untuk Laporan Hari Ini");
                break;
            default:
                System.out.println("Invalid");
        }
    } while (pilihan != 4);
}

    private static void aturDiskon() {
     Scanner sc = new Scanner(System.in);
    
     System.out.print("Masukkan Kode Voucher Baru : ");
     String voucherBaru = sc.next();

     System.out.print("Masukkan Persentase diskon (misal 0.1 untuk 10 %) : ");
     double diskonBaru = sc.nextDouble();

        kodeVoucher = voucherBaru;
        diskon = diskonBaru;
     System.out.println("Voucher Kode Berhasil Ditambahkan ");

     System.out.println("1. Kembali ke Menu Admin ");
     System.out.println("2. Keluar ");
     System.out.print("Pilih Opsi :");
     int choice = sc.nextInt();
switch (choice) {
    case 1:
        Admin();
        break;
    case 2:
     Pasien();
   
    default:
        break;
}
   
    }

    private static void Pasien(){
        int pilihan;
        Scanner sc = new Scanner(System.in);
String[][] dataPasien = null;
int [][] biayaTot = null;
        do {
            System.out.println("|==================================================|");
            System.out.println("|=======Selamat Datang di Rumah sakit Polinema=====|");
            System.out.println("|               Pilihan Menu :                     |");         
            System.out.println("|        1. Jadwal Dokter                          |");
            System.out.println("|        2. Booking Rumah Sakit                    |");
            System.out.println("|        3. Keluar                                 |");
            System.out.println("|        Masukkan Pilihan (1/2/3) :                |");
            System.out.println("|==================================================|");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                jadwalDokter();    
                    break;
                case 2:
                inputDataPasien();
                    break;
                case 3:
                System.out.println("Terimakasih ! Semoga Lekas Sembuh ");
                return; 
            
                default:
                System.out.println(" Invalid ");
                    break;
            }
        } while ( pilihan != 3);
    }

    private static void jadwalDokter(){
           String noDokter ;
           char jwb;
           boolean menuJadwal = true;
           while(menuJadwal){
                System.out.println("|=============================|");
                System.out.println("|        Jadwal Dokter        |"); 
                System.out.println("|      Pilih Jenis Dokter     |");
                System.out.println("|    1. Dokter-Umum           |");
                System.out.println("|    2. Dokter-Mata           |");
                System.out.println("|    3. Dokter-Gigi           |");
                System.out.println("|    4. Dokter-SPPK           |");
                System.out.println("|    5. Keluar                |");
                System.out.println("|=============================|");
                System.out.print("   Masukkan Dokter (1-2-3-4-5) :  ");
                noDokter = sc.next();
            
            if (noDokter.equalsIgnoreCase("1")) {
                System.out.println("Senin : 08.00 - 12.00");
                System.out.println("Rabu : 10.00 - 14.00");
                System.out.println("Jumat 13.00 - 17.00");
                System.out.println("=======================");
                System.out.println("Apakah ingin melihat jadwal lainnya? Y/N");
                jwb = sc.next().charAt(0);
                if (jwb == 'Y') {
                    continue;
                } else if (jwb == 'N'){
                    return;
                } else {System.out.println("Salah!");}

                
            } else if (noDokter.equalsIgnoreCase("2")) {
                System.out.println("Senin :  16.00 - 18.00 / 19.00 - 20.00  ");
                System.out.println("Rabu  : 18.00 - 21.00");
                System.out.println("Sabtu : 14.00 - 16.00 / 18.00 - 19. 00 ");
                System.out.println("=======================");
                System.out.println("Apakah ingin melihat jadwal lainnya? Y/N");
                jwb = sc.next().charAt(0);
                if (jwb == 'Y') {
                    continue;
                } else if (jwb == 'N'){
                    return;
                } else {System.out.println("Salah!");}


            } else if  (noDokter.equalsIgnoreCase("3")){
                System.out.println("Senin :  16.00 - 17.00 / 19.00 - 21.00  ");
                System.out.println("Rabu  : 18.00 - 21.00");
                System.out.println("Jumat : 14.00 - 16.00 / 18.00 - 19. 00 ");
                System.out.println("=======================");
                System.out.println("Apakah ingin melihat jadwal lainnya? Y/N");
                jwb = sc.next().charAt(0);
                if (jwb == 'Y') {
                    continue;
                } else if (jwb == 'N'){
                    return;
                } else {System.out.println("Salah!");}


            } else if (noDokter.equalsIgnoreCase("4")){
                System.out.println("Selasa : 07.00 - 09.00 / 13.00 - 14.00 ");
                System.out.println("Rabu : 08.00 - 11.00 / 16.00 - 18.00 ");
                System.out.println("Jumat : 08.00 - 10.00");
                System.out.println("=======================");
                System.out.println("Apakah ingin melihat jadwal lainnya? Y/N");
                jwb = sc.next().charAt(0);
                if (jwb == 'Y') {
                    continue;
                } else if (jwb == 'N'){
                    return;
                } else {System.out.println("Salah!");}

            } else if (noDokter.equalsIgnoreCase("5")){
                menuJadwal = false;
                System.out.println("Keluar dari menu jadwal dokter");
            } else {System.out.println("input salah!");}
            

           }
    }

    private static void inputDataPasien(){
        Scanner pasien1 = new Scanner(System.in);
        Scanner pasien2 = new Scanner(System.in);
        Scanner pasien3 = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Pasien Hari Ini : ");
        jmlPasien = sc.nextInt();
        sc.nextLine();
            

         dataPasien = new String[jmlPasien][16];
         biayaTot = new int[jmlPasien][1];

        /*  kamarTerisi = new boolean[][]{
        new boolean[20],
        new boolean[20],
        new boolean [10] }; */
         int hargaSatuHari = 0;

         for (int i = 0; i < jmlPasien; i++) {
                    System.out.println("Masukkan Data Pasien Ke - " + (i+1) );

                        System.out.print("Masukkan Nama Pasien : ");
                        dataPasien[i][0] = pasien1.nextLine();

                        System.out.print("Masukkan Tempat Lahir Pasien : ");
                        dataPasien[i][1] = pasien1.nextLine();

                        System.out.print("Masukkan Tanggal Lahir ( Contoh : 12 November 2004 ) : ");
                        dataPasien[i][2] = pasien2.next();
                        pasien2.nextLine();

                        System.out.print("Masukkan Alamat : ");
                        dataPasien [i][3]= pasien2.next();
                        pasien2.nextLine();

                        System.out.print("Masukkan Nomor Telepon : ");
                        dataPasien[i][4] = pasien1.nextLine();

                        System.out.print("Masukkan No KTP  : ");
                        dataPasien[i][5] = pasien3.next();

                        

                        System.out.println("====================================");
                        System.out.println("========Pilih jenis pelayanan=======");
                        System.out.println("   1. Asuransi kesehatan swasta     ");
                        System.out.println("   2. Asuransi kesehatan pemerintah ");
                        System.out.print(  "   Masukkan Jenis Pelayanan  :      ");
                        int pilihan =sc.nextInt();

                        
                    if (pilihan == 1) {
                        System.out.println("Anda memilih Asuransi Kesehatan Swasta");
                    } else if (pilihan == 2) {
                            System.out.println("Anda memilih Asuransi kesehatan pemerintahan");
                        } else {
                            System.out.println("Pilihan tidak valid. Silahkan coba lagi");
                        }


                    

                        System.out.print("Masukkan Gejala Pasien : ");
                        dataPasien[i][6] = sc.next();
    
                        System.out.print("Masukan Dokter yang anda pilih  : ");
                        dataPasien[i][10] = sc.next();
                        sc.nextLine();

                        System.out.print("Masukan Jam Dokter yang anda pilih : ");
                        dataPasien[i][11] = sc.next();
                        

                        System.out.print("Apakah ingin rawat inap (ya/tidak) : ");
                        dataPasien[i][7] = sc.next();
                        
                        System.out.print("Masukkan Kode Voucher (Jika ada, Jika tidak, maka ketik NOVOUCHER) : ");
                        String voucherCode = sc.next();

                      
   

    
     if (dataPasien[i][7].equalsIgnoreCase("ya")) {
        System.out.println("|============================|");
        System.out.println("|   Pilih Kelas Kamar:       |");
        System.out.println("|   1. Kelas 1               |");
        System.out.println("|   2. Kelas 2               |");
        System.out.println("|   3. VIP                   |");
        System.out.println("|   Masukkan Pilihan (1/2/3):|");
        System.out.println("|============================|");
        int pilihanKelas = sc.nextInt();
        if (pilihanKelas < 1 || pilihanKelas > kamarTerisi.length) {
            System.out.println("Pilihan Kelas Tidak Valid");
            return;
        }
        System.out.println("Ketersediaan kamar untuk kelas " + pilihanKelas + " : ");
        for (int nomorKamar = 0; nomorKamar < kamarTerisi[pilihanKelas - 1].length ; nomorKamar++) {
            String status = kamarTerisi[pilihanKelas - 1][nomorKamar] ? "Terisi" : "Kosong";
            System.out.println("Kamar " + (nomorKamar + 1) + " : " + status);
        }
        System.out.println("Masukkan Lama Rawat Inap");
        dataPasien[i][9] = Integer.toString(sc.nextInt());

        System.out.print("Masukkan Nomor Kamar (1-" + kamarTerisi[pilihanKelas - 1].length + "): ");
        int nomorKamar = sc.nextInt();

        dataPasien[i][13] = Integer.toString(nomorKamar); 
        if (kamarTerisi[pilihanKelas - 1][nomorKamar - 1]) {
            System.out.println("Kamar telah terisi. Pilih kamar lain.");
        
            // Tambahkan loop untuk meminta input ulang nomor kamar
            while (kamarTerisi[pilihanKelas - 1][nomorKamar - 1]) {
                System.out.print("Masukkan Nomor Kamar (1-" + kamarTerisi[pilihanKelas - 1].length + "): ");
                nomorKamar = sc.nextInt();
        
                if (nomorKamar < 1 || nomorKamar > kamarTerisi[pilihanKelas - 1].length) {
                    System.out.println("Nomor Kamar Tidak Valid");
                } else if (kamarTerisi[pilihanKelas - 1][nomorKamar - 1]) {
                    System.out.println("Kamar telah terisi. Pilih kamar lain.");
                } else {
                    break; // Keluar dari loop jika nomor kamar sudah valid dan tidak terisi
                }
            }
        
            // Kembalikan iterasi untuk menginput ulang data pasien
            i--;
    } else {
            kamarTerisi[pilihanKelas - 1][nomorKamar - 1] = true;
            dataPasien[i][12] = Integer.toString(nomorKamar);
        
        
            if (pilihanKelas == 1) {
                hargaSatuHari = 250000;
            } else if (pilihanKelas == 2) {
                hargaSatuHari = 350000;
            } else if (pilihanKelas == 3) {
                hargaSatuHari = 500000;
            }
        }
        
       
   
            
    double totalBiaya = hitungBiayaTanpaVoucher(i,hargaSatuHari);

                        biayaTot[i][0] = (int) totalBiaya;

                      

                        if (!voucherCode.equalsIgnoreCase("NOVOUCHER") && voucherCode.contains(voucherCode)) {
                            totalBiaya = setelahVoucherDiskon (totalBiaya);
                        }
                        System.out.println("Total Biaya Menginap Sebesar : " + totalBiaya);
                 tampilkanStruk(i);


                    }else {
                        System.out.println("Anda tidak perlu rawat inap, silahkan menuju apotek");
                    }

                  //  tampilkanSemuaStruk();

     
        }
    }
    
private static double hitungBiayaTanpaVoucher(int index, int hargaSatuHari){
   
  if (dataPasien[index][9] != null) {
    int jumlahHari = Integer.parseInt(dataPasien[index][9]);
    int biayaSebelumDiskon = hargaSatuHari * jumlahHari;
    return biayaSebelumDiskon;
  } else {
    return 0;
  }
}

private static double setelahVoucherDiskon(double totalBiaya) { 
    totalBiaya -= totalBiaya * diskon;
    System.out.println("Diskon " + (diskon * 100) + "% berhasil diterapkan ");
    return totalBiaya;
}
    
   
           
    
    private static void laporanHarian(){
       System.out.println("============================");
       System.out.println("       Laporan Harian       "); 
       System.out.println("============================");

       if (jmlPasien == 0 ) {
        System.out.println("Tidak Ada Pasien Hari Ini");
        return;
       }
       for (int i = 0; i < jmlPasien; i++) {
        System.out.println("|==============================================================|");
        System.out.println("  Data Pasien Ke -" + (i + 1));
        System.out.println("Nama: " + dataPasien[i][0]);
        System.out.println("Tempat Lahir: " + dataPasien[i][1]);
        System.out.println("Tanggal Lahir: " + dataPasien[i][2]);
        System.out.println("Alamat: " + dataPasien[i][3]);
        System.out.println("Nomor Telepon: " + dataPasien[i][4]);
        System.out.println("No KTP: " + dataPasien[i][5]);
        System.out.println("Jenis Pelayanan: " + (dataPasien[i][7].equalsIgnoreCase("ya") ? "Rawat Inap" : "Rawat Jalan"));
        System.out.println("Gejala: " + dataPasien[i][6]);
        System.out.println("Dokter: " + dataPasien[i][10]);
        System.out.println("Jam Dokter: " + dataPasien[i][11]);
        System.out.println("Penyakit Parah: " + dataPasien[i][7]);

        if (dataPasien[i][7].equalsIgnoreCase("ya")) {
            System.out.println("Tipe Kamar : " + dataPasien[i][8]);
            System.out.println("Lama Rawat Inap : " + dataPasien[i][9]);
            System.out.println("Nomor Kamar: " + dataPasien[i][12]);
            System.out.println("Total Biaya Menginap : " + biayaTot[i][0]);
             System.out.println("|==============================================================|");
        }

        }
       System.out.println("======================");
       return;
    }

        private static void tampilkanKetersediaanKamar(){
            System.out.println("|================================|");
            System.out.println("|=====Cek Ketersediaan Kamar=====|");
            System.out.println("|     1. Kelas 1                 |");
            System.out.println("|     2. Kelas 2                 |");
            System.out.println("|     3. VIP                     |");
            System.out.println("|     Masukkan Pilihan (1/2/3) : |");
            System.out.println("|================================|");
            int pilihanKelas = sc.nextInt();

            if (pilihanKelas < 1 || pilihanKelas > kamarTerisi.length) {
                System.out.println("Pilihan kelas tidak valid.");
                return;
            
            }
            System.out.println("|==================================================|");
            System.out.println("  Ketersediaan Kamar untuk Kelas " + pilihanKelas + ":");
            System.out.println("|==================================================|");
        

            for (int nomorKamar = 0; nomorKamar < kamarTerisi[pilihanKelas - 1].length; nomorKamar++) {
                String status = kamarTerisi[pilihanKelas - 1][nomorKamar] ? "Terisi" : "Kosong";
                System.out.println("Kamar " + (nomorKamar + 1) + ": " + status);

              
            }
        }

private static void cekKetersediaanKamar() {
    boolean adaKamarTerisi = false;

    for (int i = 0; i < kamarTerisi.length; i++) {
        for (int j = 0; j < kamarTerisi[i].length; j++) {
            if (kamarTerisi[i][j]) {
                adaKamarTerisi = true;
                break;
            }
        }
        if (adaKamarTerisi) {
        break;
    }
}
if (adaKamarTerisi) {
    tampilkanKetersediaanKamar();
}else {
    System.out.println("Belum ada kamar yang terisi untuk hari ini ");
}
}
    

private static void tampilkanStruk(int index) {
    System.out.println("|=============================|");
    System.out.println("|           Struk             |");
    System.out.println("|=============================|");
    System.out.println("Nama: " + dataPasien[index][0]);
    System.out.println("No Telepom : " + dataPasien[index][4]);

    if (dataPasien[index][7] != null) {
        System.out.println("Jenis Pelayanan : " + (dataPasien[index][7].equalsIgnoreCase("ya") ? "Rawat Inap " : "Rawat Jalan"));

    }else {
        System.out.println("Jenis Pelayanan : - ");
    }


    System.out.println("Dokter: " + dataPasien[index][10]);
    System.out.println("Jam Dokter: " + dataPasien[index][11]);

    if (dataPasien[index][7] != null && dataPasien[index][7].equalsIgnoreCase("ya")) {
        System.out.println("Tipe Kamar : " + dataPasien[index][9]);
        System.out.println("Nomor Kamar: " + dataPasien[index][12]);
        System.out.println("Total Biaya Menginap : " + biayaTot[index][0]);
    } else {
        System.out.println("Biaya Rawat Jalan: " + hitungBiayaTanpaVoucher(index, 0));
    }

    System.out.println("|=============================|");
}

private static void tampilkanSemuaStruk(){
    System.out.println("========================");
    System.out.println("        Semua Struk     ");
    System.out.println("========================");

    if (jmlPasien == 0) {
        System.out.println("Tidak Pasien Hari Ini");
        return;
    }
    for (int i = 0; i < dataPasien.length; i++) {
            System.out.println("========================");
            System.out.println("        Semua Struk");
            System.out.println("========================");
            System.out.println("|=============================|");
            System.out.println("|           Struk             |");
            System.out.println("|=============================|");
            System.out.println("Nama: " + dataPasien[i][0]);
            System.out.println("No Telepon : " + dataPasien[i][5]);
            System.out.println("Jenis Pelayanan : " + dataPasien[i][6]);
            System.out.println("Dokter: " + dataPasien[i][7]);
            System.out.println("Jam Dokter: " + dataPasien[i][11]);
            System.out.println("Tipe Kamar : " + dataPasien[i][8]);
            System.out.println("Nomor Kamar: " + dataPasien[i][12]);
            System.out.println("Total Biaya Menginap : " + biayaTot[i][0]);
            System.out.println("|========================================|");
    }
    System.out.println("|=============================|");
}

/* 
int choice = 0;
int jmlPasien = 0;
String[][] dataPasien = null;
int [][] biayaTot = null;



   do {
       System.out.println("========== Menu ========");
       System.out.println("1. Input Data Pasien");
       System.out.println("2. View Data Pasien");
       System.out.println("3. Jadwal Dokter");
       System.out.println("4. Exit");
       System.out.print("Pilih menu (1-4): ");

       // Check if the next input is an integer
        if (sc.hasNextInt()) {
           choice = sc.nextInt();

           switch (choice) {
               case 1:
                 System.out.println("MENU 1 : INPUT DATA PASIEN");


                        System.out.print("Masukkan Jumlah Pasien Hari Ini : ");
                        jmlPasien = sc.nextInt();
                        sc.nextLine();

                        dataPasien = new String[jmlPasien][16];
                        biayaTot = new int[jmlPasien][1];

                //String [][]  dataPasien = new String[jmlPasien][13];
                //int [][]biayaTot = new int[jmlPasien][1];

                    for (int i = 0; i < jmlPasien; i++) {
                    System.out.println("Masukkan Data Pasien Ke - " + (i+1) );

                        System.out.print("Masukkan Nama Pasien : ");
                        dataPasien[i][0] = sc.nextLine();

                        System.out.print("Masukkan Tempat Lahir Pasien : ");
                        dataPasien[i][1] = sc.nextLine();

                        System.out.print("Masukkan Tanggal Lahir ( Contoh : 12 November 2004 ) : ");
                        dataPasien[i][2] = sc.next();
                        sc.nextLine();

                        System.out.print("Masukkan Alamat : ");
                        dataPasien [i][3]= sc.nextLine();

                        System.out.println("Masukkan Nomor Telepon : ");
                        dataPasien[i][4] = sc.nextLine();

                        System.out.println("Masukkan No KTP  : ");
                        dataPasien[i][5] = sc.next();

                        

                    
                        System.out.println("Pilih jenis pelayanan");
                        System.out.println("1. Asuransi kesehatan swasta");
                        System.out.println("2. Asuransi kesehatan pemerintah");
                        System.out.print("Masukkan Jenis Pelayanan  : ");
                        int pilihan =sc.nextInt();

                        
                    if (pilihan == 1) {
                        System.out.println("Anda memilih Asuransi Kesehatan Swasta");
                    } else if (pilihan == 2) {
                            System.out.println("Anda memilih Asuransi kesehatan pemerintahan");
                        } else {
                            System.out.println("Pilihan tidak valid. Silahkan coba lagi");
                        }


                    

                        System.out.println("Masukkan Gejala Pasien : ");
                        dataPasien[i][6] = sc.next();
    
                        System.out.println("Masukan Dokter yang anda pilih  : ");
                        dataPasien[i][10] = sc.next();

                        System.out.println("Masukan Jam Dokter yang anda pilih : ");
                        dataPasien[i][11] = sc.next();
                        sc.next();

                        System.out.println("Apakah Penyakit Parah ? (ya / tidak) : ");
                        dataPasien[i][7] = sc.next();
                        
   

    
     if (dataPasien[i][7].equalsIgnoreCase("ya")) {
        System.out.print("Pilih Tipe Kamar (Kelas 1 / Kelas 2 / VIP) : ");
        dataPasien[i][8] = sc.next();
        sc.nextLine();
        System.out.println("Masukkan Lama Rawat Inap");
        dataPasien[i][9] = Integer.toString(sc.nextInt());

        
       

int hargaSatuHari = 0;
        if (dataPasien[i][8].equalsIgnoreCase("Kelas-1")) {
            hargaSatuHari = 300000;
        } else if (dataPasien[i][8].equalsIgnoreCase("Kelas-2")) {
            hargaSatuHari = 250000;
        } else if (dataPasien[i][8].equalsIgnoreCase("VIP")) {
           hargaSatuHari = 500000;
        }

       int jumlahHari = Integer.parseInt(dataPasien[i][9]);
biayaTot[i][0]  =  hargaSatuHari * jumlahHari;
System.out.println("Total Biaya Menginap Sebesar : " + biayaTot[i][0]);

} else {
    System.out.println("Anda Tidak Perlu Rawat Inap, Silahkan Menuju Apotek untuk mengambil obat");
    }
}
break;
            case 2:
                System.out.println("VIEW DATA PASIEN");
                    for (int j = 0; j < jmlPasien; j++) {
                    System.out.println("Data Pasien Ke - : " + (j+1) + " : ");
                        for (int k = 0; k < 11; k++) {
                        System.out.println(" : " + dataPasien[j][k]); 
                    } if (dataPasien[j][10].equalsIgnoreCase("ya")) {
                        System.out.println("Total Biaya :  " + biayaTot[j][0]);
                    }System.out.println("Terimakasih, Semoga Lekas Sembuh");
                    }
                   break;
            case 3:
                String noDokter ;
                System.out.println("=====Jadwal Dokter====="); 
                System.out.println("======Pilih Jenis Dokter=====");
                System.out.println("1. Dokter-Umum");
                System.out.println("2. Dokter-Mata");
                System.out.println("3. Dokter-Gigi");
                System.out.println("4. Dokter-SPPK");
                System.out.print("Masukkan  Dokter ( Contoh : Dokter-Umum ) : ");
                noDokter = sc.next();
            if (noDokter.equalsIgnoreCase("Dokter-Umum")) {
                System.out.println("Senin : 08.00 - 12.00");
                System.out.println("Rabu : 10.00 - 14.00");
                System.out.println("Jumat 13.00 - 17.00");
            } else if (noDokter.equalsIgnoreCase("Dokter-Mata")) {
                    System.out.println("Senin :  16.00 - 18.00 / 19.00 - 20.00  ");
                    System.out.println("Rabu  : 18.00 - 21.00");
                    System.out.println("Sabtu : 14.00 - 16.00 / 18.00 - 19. 00 ");
            } else if  (noDokter.equalsIgnoreCase("Dokter-SPKK")){
                    System.out.println("Senin :  16.00 - 17.00 / 19.00 - 21.00  ");
                    System.out.println("Rabu  : 18.00 - 21.00");
                    System.out.println("Jumat : 14.00 - 16.00 / 18.00 - 19. 00 ");
            } else if (noDokter.equalsIgnoreCase("Dokter-Gigi")){
                    System.out.println("Selasa : 07.00 - 09.00 / 13.00 - 14.00 ");
                    System.out.println("Rabu : 08.00 - 11.00 / 16.00 - 18.00 ");
                    System.out.println("Jumat : 08.00 - 10.00");
            }
               break;
               /*String[] jadwalDokter = {
                "Senin: 08.00 - 16.00, Rabu: 10.00 - 18.00",
                "Selasa: 09.00 - 17.00, Kamis: 11.00 - 19.00",
                "Senin: 10.00 - 18.00, Rabu: 08.00 - 16.00"
            };
    
            // Menampilkan daftar dokter
            System.out.println("Daftar Dokter:");
            for (int i = 0; i < jadwalDokter.length; i++) {
                System.out.println((i + 1) + ". Dokter " + (char)('A' + i));
            }
    
            // Meminta pengguna memilih nomor dokter
            Scanner scanner = new Scanner(System.in);
            System.out.print("Pilih nomor dokter (1-" + jadwalDokter.length + "): ");
            
            // Menggunakan nomor dokter sebagai indeks array
            int nomorDokter = scanner.nextInt();
            
            // Mengecek apakah nomor dokter valid
            if (nomorDokter >= 1 && nomorDokter <= jadwalDokter.length) {
                // Menampilkan jadwal dokter yang dipilih
                System.out.println("Jadwal Dokter " + (char)('A' + nomorDokter - 1) + ": " + jadwalDokter[nomorDokter - 1]);
            } else {
                System.out.println("Nomor dokter tidak valid.");
            }
            

                   //break;
               case 4:
                   System.out.println("Terima kasih. Program selesai.");
               default:
                   System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                   break;
           }
       } else {
           System.out.println("Input tidak valid. Masukkan pilihan angka (1-3).");
           sc.next(); // Consume the non-integer input
       }

   } while (choice != 4);

   /* */
   
}






    
    //pemilihan pelayanan
 
    
    
    
        

   
    



    
   






//int[] dataPasien = new int [jmlPasien];


/*String[] namaPasien = new String[jmlPasien];
String[] tempatLahir = new String[jmlPasien];
String[] tanggalLahir = new String[jmlPasien];
String[] alamat = new String [jmlPasien];
String [] noTelepon = new String[jmlPasien];
String [] noIdentitas = new String[jmlPasien];
String [] jenisPelayanan = new String[jmlPasien];
String [] gejalaPasien = new String[jmlPasien];
String [] penyakitParah = new String [jmlPasien];
String [] tipeKamar = new String[jmlPasien];
int[] lamaRawat = new int[jmlPasien];
//int [] biayaTot = new int [jmlPasien];
//int hargaSatuHari;
*/
/*for (int i = 0; i < jmlPasien; i++) {
    System.out.println("Masukkan Data Pasien Ke - " + (i+1) );

    System.out.print("Masukkan Nama Pasien : ");
    dataPasien[i][0] = sc.nextLine();

    System.out.print("Masukkan Tempat Lahir Pasien : ");
    dataPasien[i][1] = sc.nextLine();

    System.out.print("Masukkan Tanggal Lahir ( Contoh : 12 November 2004 ) : ");
    dataPasien[i][2] = sc.next();
    sc.nextLine();

    System.out.print("Masukkan Alamat : ");
    dataPasien [i][3]= sc.nextLine();

    System.out.println("Masukkan Nomor Telepon : ");
    dataPasien[i][4] = sc.nextLine();

    System.out.println("Masukkan No KTP  : ");
    dataPasien[i][5] = sc.next();

    System.out.println("Masukkan Jenis Pelayanan ");
    jenisPelayanan [i] = sc.next();
    
    //pemilihan pelayanan
    public static jenisPelayanan(); { 
    System.out.println("Pilih jenis pelayanan");
    System.out.println("Asuransi kesehatan swasta");
    System.out.println("Asuransi kesehatan pemerintah");

    Scanner sc = new Scanner(System.in);
    int pilihan = scanner.nextInt();

    if (pilihan == 1){
        System.out.println("Anda memilih Asuransi Kesehatan Swasta");
    }else if (pilihan == 2){
        System.out.println("Anda memilih Asuransi kesehatan pemerintah");
    }else {
        System.out.println("Pilihan tidak valid. Silahkan coba lagi,");
    }
    }

    public static String[] args; {
        Scanner sc = new Scanner(System.in);
    }
        System.out.println("Masukkan Gejala Pasien : ");
    gejalaPasien[i][5] = sc.next();

    System.out.println("Masukkan Jenis Pemeriksaan ");
    dataPasien [i][6] = sc.next();

    System.out.println("Masukkan Gejala Pasien : ");
    dataPasien[i][7] = sc.next();
    

    System.out.println("Apakah Penyakit Parah ? (ya / tidak) : ");
    dataPasien[i][8] = sc.next();
    int hargaSatuHari = 0;
  

    if (dataPasien[i][8].equalsIgnoreCase("ya")) {
        System.out.print("Pilih Tipe Kamar (Kelas 1 / Kelas 2 / VIP) : ");
        dataPasien[i][9] = sc.next();
        System.out.println("Masukkan Lama Rawat Inap");
        dataPasien[i][10] = Integer.toString(sc.nextInt());

        

        if (dataPasien[i][9].equalsIgnoreCase("Kelas 1")) {
            hargaSatuHari = 300000;
        } else if (dataPasien[i][9].equalsIgnoreCase("Kelas 2")) {
            hargaSatuHari = 250000;
        } else if (dataPasien[i][9].equalsIgnoreCase("VIP")) {
            hargaSatuHari = 500000;
        }

       // int biayaTot = 0;
 biayaTot [i][0] =  Integer.parseInt(dataPasien[i][10])  * hargaSatuHari;
System.out.println("Total Biaya Menginap Sebesar : " + biayaTot[i][0]);
} else {
    System.out.println("Anda Tidak Perlu Rawat Inap, Silahkan Menuju Apotek untuk mengambil obat");
}
}
*/

  /*for (int j = 0; j < jmlPasien; j++) {
    System.out.println("Data Pasien Ke - : " + (j+1) + " : ");
    for (int k = 0; k < 11; k++) {
        System.out.println(" : " + dataPasien[j][k]);
    }
    if (dataPasien[j][8].equalsIgnoreCase("ya")) {
        System.out.println("Total Biaya :  " + biayaTot[j][0]);
    }
    System.out.println("Terimakasih, Semoha Lekas Sembuh");
  }
*/
 
   /*  if (penyakitParah[j].equalsIgnoreCase("ya")) {
        System.out.println("Total Biaya : " + biayaTot [j] ); }

    System.out.println("Terimakasih, Semoga Lekas Sembuh..");
    System.out.println(""); 
    */

  


       
    



        // Deklarasi Variabel
        /*String NamaPasien, Tempat, TanggalLahir, NomorTelepon, JenisPemeriksaan, GejalaPasien, TipeKamar;
        long NomorIdentitas;
     

        System.out.print("Nama Pasien :");
        NamaPasien = sc.nextLine();
        System.out.print("Masukkan Tempat Lahir :");
        Tempat = sc.next();
        System.out.print("Tanggal Lahir (format : dd/mm/yyyy): ");
        TanggalLahir = sc.nextLine();
      //??????????
        /*System.out.print("Alamat :");
        alamat = sc.nextLine(); /* */
        /*System.out.print("Nomor Telepon :");
        NomorTelepon = sc.nextLine();
        
        System.out.print("Nomor Identitas : ");
        NomorIdentitas = sc.nextLong();
        sc.nextLine(); //Membersihkan karakter new line
        System.out.print("Jenis Pemeriksaan :");
        JenisPemeriksaan = sc.next();
        System.out.print("Gejala Pasien :");
        GejalaPasien = sc.nextLine();
    
        System.out.print("Apakah penyakit parah? (ya/tidak) ? : ");
        String penyakitParahInput = sc.next();


       // penyakitParah = penyakitParahInput.equalsIgnoreCase("ya");

        //Pemilihan tipe kamar
        /*if (penyakitParah) {
            System.out.print("Penyakit dianggap parah. Pilih tipe kamar yang tersedia (Kelas 1 / Kelas 2 / VIP ) : ");
            TipeKamar = sc.next();
        } else {
            System.out.print("Penyakit tidak dianggap parah. Silahkan ambil obat di apotik. ");
           TipeKamar = "Tidak Ada"; //Pemilihan kamar tidak berlaku jika penyait tidak parah 
        } /* */
        
         /* */ //System.out.println("");
         // System.out.println("");
         // System.out.println("*****************");
         // System.out.println("*****************");

     

     //System.out.println("\n=== DETAIL PEMESANAN ===\n");
     //System.out.println("\n=======Data Pasien:=====\n");
     //System.out.println("Nama: " + NamaPasien);
     /*System.out.println("Nomor Identitas: " + NomorIdentitas);
     System.out.println("Alamat: " + alamat);
     System.out.println("Nomor Telepon: " + NomorTelepon);
     System.out.println("Tempat : " + Tempat);
     System.out.println("Tanggal Lahir :" );
     System.out.println("Gejala Pasien: " + GejalaPasien);
     
  /* */  /* if (penyakitParah) {
        System.out.println("Apakah penyakit parah? Ya");
        System.out.println("Tipe Kamar: " + TipeKamar);
     } else {
        System.out.println("Apakah penyakit parah? Tidak");
     } 
     /* */
     
// Perhitungan biaya rawat inap
/*int totalPembayaran = 0;
if (penyakitParah) {
    int biayaPerHari;
    if (TipeKamar.equalsIgnoreCase("Kelas 1")) {
        biayaPerHari = 300000;
    } else if (TipeKamar.equalsIgnoreCase("Kelas 2")) {
        biayaPerHari = 250000;
    } else if (TipeKamar.equalsIgnoreCase("VIP")) {
        biayaPerHari = 500000;
    } else {
        biayaPerHari = 0; 
    }
System.out.println("Masukkan lama rawat inap(Hari)");
int lamaRawatInap = sc.nextInt();
totalPembayaran = biayaPerHari * lamaRawatInap;
}
 /* */

     

/*System.out.println("*******************************");
if (penyakitParah) {
    System.out.println(" Total Biaya Rumah Sakit : " + totalPembayaran);
} else {
    System.out.println("Pasien tidak perlu membayar rawat inap karena penyakit tidak parah, maka langsung menuju bagian apotik.");
}
*/


    
    

    
       
        



