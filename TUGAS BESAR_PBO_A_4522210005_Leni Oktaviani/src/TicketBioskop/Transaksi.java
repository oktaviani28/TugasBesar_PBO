package TicketBioskop;

public interface Transaksi {
        void setNama(String nama);
        void setTelpon(String telpon);
        void setKode(String kode);
        void setJam(String jam);
        void setHarga(int harga);

        String getNama();
        String getTelpon();
        String getKode();
        String getJam();
        int getHarga();
}