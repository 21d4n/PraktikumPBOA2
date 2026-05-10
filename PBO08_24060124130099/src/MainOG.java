/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 27 April 2026
*/

public class MainOG {
    public static void main(String[] args) {
        // Sesama Integer
        Datum<Integer> a = new Datum<>();
        Datum<Integer> b = new Datum<>();
        a.setIsi(3);
        b.setIsi(6);
        System.out.println("=== Sesama Integer ===");
        System.out.println("Sebelum tukar:");
        System.out.println("a = " + a.getIsi());
        System.out.println("b = " + b.getIsi());
        OperatorGenerik.tukar(a, b);
        System.out.println("Sesudah tukar:");
        System.out.println("a = " + a.getIsi());
        System.out.println("b = " + b.getIsi());

        // Sesama String
        Datum<String> juara1 = new Datum<>();
        Datum<String> runnerup = new Datum<>();
        juara1.setIsi("Arsenal");
        runnerup.setIsi("City");
        System.out.println("\n=== Sesama String ===");
        System.out.println("Sebelum tukar:");
        System.out.println("Juara 1 = " + juara1.getIsi());
        System.out.println("Runner up = " + runnerup.getIsi());
        OperatorGenerik.tukar(juara1, runnerup);
        System.out.println("Sesudah tukar:");
        System.out.println("Juara 1 = " + juara1.getIsi());
        System.out.println("Runner up = " + runnerup.getIsi());

        // Sesama Keluarga Anabul
        Datum<Anabul> h1 = new Datum<>();
        Datum<Anabul> h2 = new Datum<>();
        h1.setIsi(new Anggora("Khambali", 4.5));
        h2.setIsi(new Kembangtelon("Roziqin", 3.2));
        System.out.println("\n=== Sesama Keluarga Anabul ===");
        System.out.println("Sebelum tukar:");
        System.out.println("h1 = " + h1.getIsi().getNama());
        System.out.println("h2 = " + h2.getIsi().getNama());
        OperatorGenerik.tukar(h1, h2);
        System.out.println("Sesudah tukar:");
        System.out.println("h1 = " + h1.getIsi().getNama());
        System.out.println("h2 = " + h2.getIsi().getNama());

        // Bobot2
        Anggora k1 = new Anggora("Subchan", 4.0);
        Kembangtelon k2 = new Kembangtelon("Bambang", 3.5);
        double total = OperatorGenerik.Bobot2(k1, k2);
        System.out.println("\n=== Bobot2 ===");
        System.out.println("k1 = " + k1.getNama() + ", " + k1.getBobot());
        System.out.println("k2 = " + k2.getNama() + ", " + k2.getBobot());
        System.out.println("Total bobot = " + total + " kg");
    }
}
