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
        GejalaPasien = sc.nextLine();
        sc.nextLine();
        System.out.print("Apakah penyakit parah? (ya/tidak): ");
        String penyakitParahInput = sc.next();
        penyakitParah = penyakitParahInput.equalsIgnoreCase("ya");

        //Pemilihan tipe kamar
        if (penyakitParah) {
            System.out.print("Penyakit dianggap parah. Pilih tipe kamar yang tersedia (Kelas 1 / Kelas 2 / VIP ) : ");
            TipeKamar = sc.next();
        } else {
            System.out.print("Penyakit tidak dianggap parah. Silahkan ambil obat di apotik. ");
           TipeKamar = "Tidak Ada"; //Pemilihan kamar tidak berlaku jika penyait tidak parah 
        }
        
          System.out.println("");
          System.out.println("");
          System.out.println("*****************");

     // Proses pemberian nomor antrian berdasarkan jumlah pasien yang mendaftar sebelumnya
     // Contoh sederhana: nomor_antrian = jumlah_pasien_sebelumnya + 1
     //int jumlahPasienSebelumnya = 1;
     //int nomorAntrian = jumlahPasienSebelumnya + 1;

     //Output nomor antrian dan data pasien yang terdaftar
     System.out.println("\n=== DETAIL PEMESANAN ===\n");
     //System.out.println("Nomor Antrian: " + nomorAntrian);
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
int totalPembayaran = 0;
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



     

System.out.println("*******************************");
if (penyakitParah) {
    System.out.println(" Total Biaya Rumah Sakit : " + totalPembayaran);
} else {
    System.out.println("Pasien tidak perlu membayar rawat inap karena penyakit tidak parah, maka langsung menuju bagian apotik.");
}



    
    }
}
    
       
        



