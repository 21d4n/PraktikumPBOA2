/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 20 April 2026
*/

public class Mahasiswa2 extends Civitasakademika {
    private String NIM;
    private Dosen dosenWali;

    public Mahasiswa2(String nama, String NIM) {
        super(nama);
        this.NIM = NIM;
    }

    @Override
    public String getNomor() {
        return NIM;
    }

    public void setWali(Dosen d) {
        this.dosenWali = d;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "-"));
        System.out.println();
    }
}
