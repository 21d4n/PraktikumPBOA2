/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 04 Mei 2026
*/

public class Kucing extends Anabul {
    private double bobot;

    public Kucing(String Nama, double bobot) {
        super(Nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void gerak() {
        System.out.println(this.Nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(this.Nama + " berbunyi meong");
    }
}
