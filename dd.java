import java.util.Scanner;

public class dd{
    // ...

    private static void inputDataPasien(Scanner sc) {
        System.out.println("Input Data Pasien");

        System.out.print("Masukkan Jumlah Pasien Hari Ini : ");
        int jmlPasien = sc.nextInt();
        sc.nextLine();

        String[][] dataPasien = new String[jmlPasien][12];
        int[][] biayaTot = new int[jmlPasien][1];

        for (int i = 0; i < jmlPasien; i++) {
            System.out.println("Masukkan Data Pasien Ke - " + (i + 1));

            // ... (other data input)

            System.out.println("Masukkan Jenis Pelayanan ");
            dataPasien[i][6] = jenisPelayanan(sc);

            // ... (continue with other data input)

            // ... (continue with other data input)

            System.out.println("Masukkan Gejala Pasien : ");
            // Assuming gejalaPasien is a String variable, you can modify accordingly
            String gejalaPasien = sc.next();
            dataPasien[i][7] = gejalaPasien;

            // ... (continue with other data input)

            System.out.println("Apakah Penyakit Parah ? (ya / tidak) : ");
            dataPasien[i][8] = sc.next();

            int hargaSatuHari = 0;
            if (dataPasien[i][8].equalsIgnoreCase("ya")) {
                // ... (continue with other data input)
            } else {
                System.out.println("Anda Tidak Perlu Rawat Inap, Silahkan Menuju Apotek untuk mengambil obat");
            }
        }

        // ... (continue with the rest of your code)
    }

    private static String jenisPelayanan(Scanner sc) {
        System.out.println("Pilih jenis pelayanan");
        System.out.println("1. Asuransi kesehatan swasta");
        System.out.println("2. Asuransi kesehatan pemerintah");

        int pilihan = sc.nextInt();
        sc.nextLine(); // consume the newline character

        String jenisPelayanan = "";
        if (pilihan == 1) {
            jenisPelayanan = "Asuransi Kesehatan Swasta";
        } else if (pilihan == 2) {
            jenisPelayanan = "Asuransi Kesehatan Pemerintah";
        } else {
            System.out.println("Pilihan tidak valid. Silahkan coba lagi,");
            jenisPelayanan = jenisPelayanan(sc); // recursively call itself
        }

        return jenisPelayanan;
    }

    // ...
}
