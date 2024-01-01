package TicketBioskop;
import java.util.ArrayList;

    public class PetugasBioskop {
        private ArrayList<Tiket> daftarTiket;

        public PetugasBioskop() {
            this.daftarTiket = new ArrayList<>();
        }

        public void pesanTiket(String nama, String telpon, String kodeFilm, String jamTayang, int harga) {
            Tiket tiket = new Tiket();
            tiket.setNama(nama);
            tiket.setTelpon(telpon);
            tiket.setKode(kodeFilm);
            tiket.setJam(jamTayang);
            tiket.setHarga(harga);

            daftarTiket.add(tiket);

            System.out.println("Tiket berhasil dipesan untuk " + nama);
        }
    }

