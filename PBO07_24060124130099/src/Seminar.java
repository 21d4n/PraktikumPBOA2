/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 20 April 2026
*/

public class Seminar {
    private Civitasakademika[] pesertas = new Civitasakademika[100];
    private int banyakPeserta;

    public Seminar() {
        banyakPeserta = 0;
    }

    public int countPeserta() {
        return banyakPeserta;
    }

    public void registrasi(Civitasakademika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = c;
            banyakPeserta++;
        }
        else {
            System.out.println("Peserta penuh!");
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }

    public void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " - " + pesertas[i].getNama());
        }
    }
}