/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 20 April 2026
*/

public class Burung extends Anabul {
    public Burung(String Nama) {
        super(Nama);
    }

    @Override
    public void gerak() {
        System.out.println(this.Nama + " bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(this.Nama + " berbunyi cuit");
    }
}
