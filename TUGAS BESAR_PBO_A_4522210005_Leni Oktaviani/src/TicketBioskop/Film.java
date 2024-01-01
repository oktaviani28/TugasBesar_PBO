package TicketBioskop;

public class Film {
    private String kode;
    private String judul;
    private String jamTayang;
    private JadwalTayang jadwalTayang;

    public Film(String kode, String judul, String jamTayang, JadwalTayang jadwalTayang) {
        this.kode = kode;
        this.judul = judul;
        this.jamTayang = jamTayang;
        this.jadwalTayang = jadwalTayang;
    }

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public String getJamTayang() {
        return jamTayang;
    }

    public JadwalTayang getJadwalTayang() {
        return jadwalTayang;
    }
}
