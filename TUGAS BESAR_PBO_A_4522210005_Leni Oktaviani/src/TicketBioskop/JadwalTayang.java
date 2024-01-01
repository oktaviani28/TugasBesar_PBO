package TicketBioskop;
import java.util.ArrayList;

    public class JadwalTayang {
        private ArrayList<String> daftarJamTayang;
        private ArrayList<String> daftarstudio;

        public JadwalTayang() {
            this.daftarJamTayang = new ArrayList<>();
            this.daftarstudio = new ArrayList<>();
            inisialisasiJadwalTayang();
        }

        private void inisialisasiJadwalTayang() {
            daftarJamTayang.add(" 11.00 ");
            daftarJamTayang.add(" 13.00 ");
            daftarJamTayang.add(" 15.00 ");
            daftarJamTayang.add(" 16.50 ");
            daftarJamTayang.add(" 19.30 ");

            daftarstudio.add("Studio 1");
            daftarstudio.add("Studio 2");
            daftarstudio.add("Studio 3");
            daftarstudio.add("Studio 4");
            daftarstudio.add("Studio 5");
        }


        public ArrayList<String> getDaftarJamTayang() {
            return daftarJamTayang;
        }
        public ArrayList<String> getDaftarstudio() {
            return daftarstudio;
        }
    }

