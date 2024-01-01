package TicketBioskop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kode = "";
        String jam = " ";
        String studio = "";
        int harga = 50000;
        Scanner input = new Scanner(System.in);
        Tiket user = new Tiket();

        System.out.println("~~~~~~~~~~~~~~~~~ PEMESANAN TIKET BIOSKOP ~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Masukkan Nama\t: ");
        String nama = input.nextLine();
        System.out.println("Masukkan No.Telepon\t: ");
        String telpon = input.nextLine();

        user.setNama(nama);
        user.setTelpon(telpon);

        // Pilih film yang akan ditonton
        System.out.println("==============================================================");
        System.out.println(">> List Film yang sedang tayang >>");
        System.out.println("1. Fast and Furious ");
        System.out.println("2. X-Man");
        System.out.println("3. The Meg");
        System.out.println("4. 172 DAYS");
        System.out.println("5. Layangan Putus");
        System.out.println("--> Masukkan Pilihan Film Anda\t: ");
        int n = input.nextInt();
        if (n >= 1 && n <= 5) {
            kode = "A00" + n;
            studio = "Studio " + n;
        } else {
            System.out.println("Pilihan film tidak valid.");
            return;
        }

        // Pilih Jam Tayang
        System.out.println("==============================================================");
        System.out.println(">> Pilih Jam Tayang");
        System.out.println("1. 11.00");
        System.out.println("2. 13.00");
        System.out.println("3. 15.00");
        System.out.println("4. 16.50");
        System.out.println("5. 19.30");
        System.out.println("--> Masukkan Pilihan Anda\t: ");
        int i = input.nextInt();
        if (i >= 1 && i <= 5) {
            jam = "" + (i < 10 ? "1" : "") + i + ".00";
        } else {
            System.out.println("Pilihan jam tayang tidak valid.");
            return;
        }


        //Pilih Kursi
        boolean[][] kursiTerpesan = new boolean[5][10];
        System.out.println("==============================================================");
        System.out.println(">> Pilih Kursi");
        System.out.print("  ");
        for (int kolom = 1; kolom <= kursiTerpesan[0].length; kolom++) {
            System.out.print(kolom + " ");
        }
        System.out.println();
        for (int baris = 0; baris < kursiTerpesan.length; baris++) {
            System.out.print((char) ('A' + baris) + " ");
            for (int kolom = 0; kolom < kursiTerpesan[baris].length; kolom++) {
                char status = kursiTerpesan[baris][kolom] ? 'X' : '_';
                System.out.print(status + " ");
            }
            System.out.println();
        }

        System.out.println("Masukkan Kursi (Baris Kolom)\t: ");
        String inputKursi = input.next().toUpperCase();
        if (inputKursi.length() != 2) {
            System.out.println("Format kursi tidak valid.");
            return;
        }

        int barisKursi = inputKursi.charAt(0) - 'A';
        int kolomKursi = Character.getNumericValue(inputKursi.charAt(1)) - 1;
        if (barisKursi >= 0 && barisKursi < kursiTerpesan.length &&
                kolomKursi >= 0 && kolomKursi < kursiTerpesan[barisKursi].length &&
                !kursiTerpesan[barisKursi][kolomKursi]) {
            kode += inputKursi;
            studio = "Studio " + (barisKursi + 1);
            kursiTerpesan[barisKursi][kolomKursi] = true;
        } else {
            System.out.println("Kursi tidak valid atau sudah terpesan.");
            return;
        }

        // Payment
        System.out.println("==============================================================");
        System.out.println("Pilih Metode Pembayaran:");
        System.out.println("1. Bank Transfer");
        System.out.println("2. QRIS");
        System.out.println("3. E-wallet Dana");
        System.out.println("--> Masukkan Pilihan Anda\t: ");
        int metodePembayaran = input.nextInt();

        switch (metodePembayaran) {
            case 1:
                System.out.println("Silakan transfer ke rekening kami.");
                // Tambahkan logika untuk bank transfer
                break;
            case 2:
                System.out.println("Silakan scan QRIS untuk pembayaran.");
                // Tambahkan logika untuk QRIS
                break;
            case 3:
                System.out.println("Silakan lakukan pembayaran melalui e-wallet Dana.");
                // Tambahkan logika untuk e-wallet Dana
                break;
            default:
                System.out.println("Metode pembayaran tidak valid.");
                return;
        }

        // Set ticket details
        user.setKode(kode);
        user.setJam(jam);
        user.setHarga(harga);

        // Display
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("==================== INVOICE PEMESANAN TIKET =================== ");
        System.out.println("Nama Pelanggan\t\t    : " + user.getNama());
        System.out.println("No. Telepon\t\t        : " + user.getTelpon());
        System.out.println("=============================================================== ");
        System.out.println("Kode Film\t\t        : " + user.getKode());
        System.out.println("Jam Tayang\t\t        : " + user.getJam());
        System.out.println("Studio\t\t\t        : " + studio);
        System.out.println("Nomor Kursi\t\t        : " + inputKursi);
        System.out.println("Harga Tiket\t\t        : " + user.getHarga());
        System.out.println("Metode Pembayaran\t\t: " + metodePembayaran);
        System.out.println("=============================================================== ");
        System.out.println("Tiket berhasil dipesan untuk " + nama);
    }
}
