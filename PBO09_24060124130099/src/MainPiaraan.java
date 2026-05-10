/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 04 Mei 2026
*/

public class MainPiaraan {
    public static void main(String[] args) {

        Piaraan p = new Piaraan();

        Anggora k1 = new Anggora("Subchan", 4.5);
        Kembangtelon k2 = new Kembangtelon("Cat", 3.2);
        Anjing a1 = new Anjing("Asep", 6.7);
        Burung b1 = new Burung("Rio", 1.1);

        p.enqueueAnabul(k1);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(a1);
        p.enqueueAnabul(b1);

        System.out.println("Isi antrean:");
        p.showAnabul();

        System.out.println("\nJumlah elemen:");
        System.out.println(p.getNbelm());

        System.out.println("\nApakah Subchan member dari list Anabul?\n" + p.isMember(k1));

        System.out.println("\nAnabul pertama:");
        System.out.println(p.getAnabul().getNama());

        System.out.println("\nJumlah kucing:");
        System.out.println(p.countKucing());

        System.out.println("\nTotal bobot kucing:");
        System.out.println(p.bobotKucing());

        System.out.println("\nJenis anabul:");
        p.showJenisAnabul();

        System.out.println("\nDequeue:");
        System.out.println(p.dequeueAnabul().getNama());

        System.out.println("\nIsi antrean sekarang:");
        p.showAnabul();
    }
}
