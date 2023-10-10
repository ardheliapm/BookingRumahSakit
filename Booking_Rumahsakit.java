import java.util.Scanner;

public class Booking_Rumahsakit {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

        // Deklarasi Variabel
        String NamaPasien, Tempat, TanggalLahir, alamat, NomorTelepon, JenisPemeriksaan, GejalaPasien, TipeKamar;
        long NomorIdentitas;
        boolean penyakitParah = false;
        
        

        // Isi Variabel
        //String BiayaRawatInap = "250000";

        System.out.print("Nama Pasien :");
        NamaPasien = sc.nextLine();
        System.out.print("Tempat :");
        Tempat = sc.next();
        System.out.print("Tanggal Lahir (format : dd/mm/yyyy): ");
        String rawTanggalLahir = sc.next();
        // Validasi Tanggal Lahir 
        if (rawTanggalLahir.matches("\\d{2}/\\d{2}/\\d{4}")) {
            TanggalLahir = rawTanggalLahir;
        } else {
            System.out.println("Format tanggal lahir tidak valid.");
        }

        sc.nextLine();

        System.out.print("Alamat :");
        alamat = sc.nextLine();
        System.out.print("Nomor Telepon :");
        NomorTelepon = sc.nextLine();
        
        System.out.print("Nomor Identitas : ");
        NomorIdentitas = sc.nextLong();
        sc.nextLine(); //Membersihkan karakter new line
        System.out.print("Jenis Pemeriksaan :");
        JenisPemeriksaan = sc.next();
        System.out.print("Gejala Pasien :");
        GejalaPasien = sc.next();
        System.out.print("Apakah penyakit parah? (ya/tidak): ");
        String penyakitParahInput = sc.next();
        penyakitParah = penyakitParahInput.equalsIgnoreCase("ya");

        //Pemilihan tipe kamar
        if (penyakitParah) {
            System.out.print("Penyakit dianggap parah. Pilih tipe kamar yang tersedia (VIP/Kelas1/Kelas2) : ");
            TipeKamar = sc.next();
        } else {
            System.out.print("Penyakit tidak dianggap parah. Silahkan ambil obat di apotik. ");
           TipeKamar = "Tidak Ada"; //Pemilihan kamar tifak berlaku jika penyait tidak parah 
        }
        
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
     System.out.println("Nama: " + NamaPasien);
     System.out.println("Nomor Identitas: " + NomorIdentitas);
     System.out.println("Alamat: " + alamat);
     System.out.println("Nomor Telepon: " + NomorTelepon);
     System.out.println("Tempat : " + Tempat);
     System.out.println("Tanggal Lahir :" + rawTanggalLahir);
     System.out.println("Gejala Pasien: " + GejalaPasien);
     if (penyakitParah) {
        System.out.println("Apakah penyakit parah? Ya");
        System.out.println("Tipe Kamar: " + TipeKamar);
     } else {
        System.out.println("Apakah penyakit parah? Tidak");
     }
     
// Perhitungan biaya rawat inap
int biayaPerHari;
if (TipeKamar.equalsIgnoreCase("Kelas1")) {
biayaPerHari = 300000;
} else if (TipeKamar.equalsIgnoreCase("Kelas2")) {
    biayaPerHari = 250000;
} else if (TipeKamar.equalsIgnoreCase("Kelas3")) {
    biayaPerHari = 100000;
} else {
    biayaPerHari = 100000; //Default biaya jika tipe kamar tidak valid
}



     //int biaya1hari, lamarawatinap, totalpembayaran;
     //biaya1hari= 200000;
     
int lamaRawatInap, totalPembayaran;
System.out.print("Masukkan lama rawat inap (Hari): ");
lamaRawatInap = sc.nextInt();

     //System.out.println("masukkan lama rawat inap : ");
     //lamarawatinap= sc.nextInt();

     totalPembayaran= biayaPerHari*lamaRawatInap;

     System.out.println("**************************");
     System.out.println("Total Biaya Rumah Sakit :  " + totalPembayaran);
     
    }
}
    
       
        



