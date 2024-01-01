package TicketBioskop;

public class Customer {
    protected String nama;
    protected String telpon;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }
    public String getTelpon(){
        return telpon;
    }
}
