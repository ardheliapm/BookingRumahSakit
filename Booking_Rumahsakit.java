import java.util.Scanner;

public class Booking_Rumahsakit {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

System.out.print("Masukkan Jumlah Pasien Hari Ini : ");
int jmlPasien = sc.nextInt();

//int[] dataPasien = new int [jmlPasien];
String[] namaPasien = new String[jmlPasien];
String[] tempatLahir = new String[jmlPasien];
String[] tanggalLahir = new String[jmlPasien];
String[] alamat = new String [jmlPasien];
String [] noTelepon = new String[jmlPasien];
String [] noIdentitas = new String[jmlPasien];
String [] jenisPemeriksaan = new String[jmlPasien];
String [] gejalaPasien = new String[jmlPasien];
String [] penyakitParah = new String [jmlPasien];
String [] tipeKamar = new String[jmlPasien];
int[] lamaRawat = new int[jmlPasien];
int [] biayaTot = new int [jmlPasien];
//int hargaSatuHari;

for (int i = 0; i < jmlPasien; i++) {
    System.out.println("Masukkan Data Pasien Ke - " + (i+1) );

    System.out.print("Masukkan Nama Pasien : ");
    namaPasien[i] = sc.next();

    System.out.print("Masukkan Tempat Lahir Pasien : ");
    tempatLahir[i] = sc.next();

    System.out.print("Masukkan Tanggal Lahir ( Contoh : 12 November 2004 ) : ");
    tanggalLahir [i] = sc.next();
    sc.nextLine();

    System.out.print("Masukkan Alamat : ");
    alamat [i]= sc.nextLine();

    System.out.println("Masukkan Nomor Telepon : ");
    noTelepon[i] = sc.nextLine();

    System.out.println("Masukkan No KTP  : ");
    noIdentitas[i] = sc.next();

    System.out.println("Masukkan Jenis Pemeriksaan ");
    jenisPemeriksaan [i] = sc.next();

    System.out.println("Masukkan Gejala Pasien : ");
    gejalaPasien[i] = sc.next();
    

    System.out.println("Apakah Penyakit Parah ? (ya / tidak) : ");
    penyakitParah[i] = sc.next();
    int hargaSatuHari = 0;
  

    if (penyakitParah[i].equalsIgnoreCase("ya")) {
        System.out.print("Pilih Tipe Kamar (Kelas 1 / Kelas 2 / VIP) : ");
        tipeKamar[i] = sc.next();
        System.out.println("Masukkan Lama Rawat Inap");
        lamaRawat[i] = sc.nextInt();

        

        if (tipeKamar[i].equalsIgnoreCase("Kelas 1")) {
            hargaSatuHari = 300000;
        } else if (tipeKamar[i].equalsIgnoreCase("Kelas 2")) {
            hargaSatuHari = 250000;
        } else if (tipeKamar[i].equalsIgnoreCase("VIP")) {
            hargaSatuHari = 500000;
        }

       // int biayaTot = 0;
 biayaTot [i] =  lamaRawat [i]  * hargaSatuHari;
System.out.println("Total Biaya Menginap Sebesar : " + biayaTot);
} else {
    System.out.println("Anda Tidak Perlu Rawat Inap, Silahkan Menuju Apotek untuk mengambil obat");
}
}

System.out.println("======= Data Pasien RS ======= ");
for (int j = 0; j < lamaRawat.length; j++) {
    System.out.println("Data Pasien Ke - " + (j+1) + " : ");
    System.out.println("=====================4==========");
    System.out.println("Nama Pasien : " + namaPasien[j]);
    System.out.println("Tempat Lahir : " + tempatLahir[j]);
    System.out.println("Tanggal Lahir : " + tanggalLahir[j]);
    System.out.println("Alamat : " + alamat[j]);
    System.out.println("Nomor Telepon " + noTelepon[j]);
    System.out.println("No KTP : " + noIdentitas[j]);
    System.out.println("Jenis Pemeriksaan : " + jenisPemeriksaan[j]);
    System.out.println("Gejala Pasien : " + gejalaPasien[j]);
    System.out.println("Penyakit Parah : " + penyakitParah[j]);
   
  

 
    if (penyakitParah[j].equalsIgnoreCase("ya")) {
        System.out.println("Total Biaya : " + biayaTot [j] ); }

    System.out.println("Terimakasih, Semoga Lekas Sembuh..");
    System.out.println(""); 
    
   }
  
   int choice = 0;

   do {
       System.out.println("========== Menu ========");
       System.out.println("1. Input Data Pasien");
       System.out.println("2. View Data Pasien");
       System.out.println("3. Exit");
       System.out.print("Pilih menu (1-3): ");

       // Check if the next input is an integer
       if (sc.hasNextInt()) {
           choice = sc.nextInt();

           switch (choice) {
               case 1:
                   inputDataPasien(sc);
                   break;
               case 2:
                   viewDataPasien();
                   break;
               case 3:
                   System.out.println("Terima kasih. Program selesai.");
                   break;
               default:
                   System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                   break;
           }
       } else {
           System.out.println("Input tidak valid. Masukkan pilihan angka (1-3).");
           sc.next(); // Consume the non-integer input
       }

   } while (choice != 3);

   sc.close();
}

private static void inputDataPasien(Scanner sc) {
   // Your code for inputting data
   System.out.println("Input Data Pasien");
}

private static void viewDataPasien() {
   // Your code for viewing data
   System.out.println("View Data Pasien");
}



       
    }



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


    
    

    
       
        



