package TicketBioskop;

public class Tiket extends Customer implements Transaksi{
    private String kode,jam;
    private int harga;
    public void setKode(String kode){
        this.kode = kode;
    }
    public String getKode() {
        return kode;
    }
    public void setJam(String jam){
        this.jam = jam;
    }
    public String getJam(){
        return jam;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public int getHarga(){
        return harga;
    }
}
