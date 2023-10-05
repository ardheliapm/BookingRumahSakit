import java.util.Scanner;

public class Booking_Rumahsakit {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

        // Deklarasi Variabel
        String NamaPasien, Tempat, TanggalLahir,  alamat, NomorTelepon, JenisPemeriksaan, GejalaPasien;
        long NomorIdentitas;
        
        

        // Isi Variabel
        String BiayaRawatInap = "250000";

        System.out.print("Nama Pasien :");
        NamaPasien = sc.next();
        System.out.print("Tempat :");
        Tempat = sc.next();
        System.out.print("Tanggal Lahir :");
        TanggalLahir = sc.next();
        System.out.print("Alamat :");
        alamat = sc.next();
        System.out.print("Nomor Telepon :");
        NomorTelepon = sc.next();
        System.out.print("Nomor Identitas : ");
        NomorIdentitas = sc.nextInt();
        System.out.print("Jenis Pemeriksaan :");
        JenisPemeriksaan = sc.next();
        System.out.print("Gejala Pasien :");
        GejalaPasien = sc.next();
          System.out.println("");
          System.out.println("");
          System.out.println("*****************");

     // Proses pemberian nomor antrian berdasarkan jumlah pasien yang mendaftar sebelumnya
     // Contoh sederhana: nomor_antrian = jumlah_pasien_sebelumnya + 1
     int jumlahPasienSebelumnya = 1;
     int nomorAntrian = jumlahPasienSebelumnya + 1;

     //Output nomor antrian dan data pasien yang terdaftar
     System.out.println("\n=== DETAIL PEMESANAN ===\n");
     System.out.println("Nomor Antrian: " + nomorAntrian);
     System.out.println("Data Pasien:");
     System.out.println("nama: " + NamaPasien);
     System.out.println("Nomor Identitas: " + NomorIdentitas);
     System.out.println("Alamat: " + alamat);
     System.out.println("Nomor Telepon: " + NomorTelepon);
     System.out.println("Tempat : " + Tempat);
     System.out.println("Tanggal Lahir :" + TanggalLahir);
     System.out.println("Gejala Pasien: " + GejalaPasien);
     
//aritmaatika

     int biaya1hari, lamarawatinap, totalpembayaran;
     biaya1hari= 200000;
     

     System.out.println("masukkan lama rawat inap : ");
     lamarawatinap= sc.nextInt();

     totalpembayaran= biaya1hari*lamarawatinap;

     System.out.println("**************************");
     System.out.println("Total Biaya Rumah Sakit :  " + totalpembayaran);
     
    }
}
    
       
        



