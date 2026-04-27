/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 20 April 2026
*/

public class Anjing extends Anabul {
    public Anjing(String Nama) {
        super(Nama);
    }

    @Override
    public void gerak() {
        System.out.println(this.Nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(this.Nama + " bersuara guk-guk");
    }
}
