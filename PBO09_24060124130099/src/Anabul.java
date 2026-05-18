/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 04 Mei 2026
*/

public abstract class Anabul {
    protected String Nama;

    public Anabul(String Nama){
        this.Nama = Nama;
    }

    public String getNama(){
        return Nama;
    }

    public abstract void gerak();
    public abstract void bersuara();
}
