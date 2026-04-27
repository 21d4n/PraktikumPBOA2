/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 20 April 2026
*/

public abstract class Civitasakademika {
    protected String Nama;

    public Civitasakademika(String Nama) {
        this.Nama = Nama;
    }

    public String getNama(){
        return Nama;
    }

    public abstract String getNomor();
}
