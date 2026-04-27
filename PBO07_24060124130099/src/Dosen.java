/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 20 April 2026
*/

public class Dosen extends Civitasakademika {
    private String NIP;

    public Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return NIP;
    }
}
