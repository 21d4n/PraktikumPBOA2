/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 20 April 2026
*/

public class MainAnabul {
    public static void main(String[] args) {
        Anabul k = new Kucing("Apin");
        Anabul a = new Anjing("Jeki");
        Anabul b = new Burung("Liverpool");

        System.out.println("KUCING");
        k.gerak();
        k.bersuara();

        System.out.println("\nANJING");
        a.gerak();
        a.bersuara();

        System.out.println("\nBURUNG");
        b.gerak();
        b.bersuara();
    }
}
