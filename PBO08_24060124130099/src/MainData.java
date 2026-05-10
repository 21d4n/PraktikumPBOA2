/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 27 April 2026
*/

public class MainData {
     public static void main(String[] args) {
        Kucing k1 = new Kucing("Upin", 4.5);
        Kucing k2 = new Kucing("Ipin", 3.2);
        Anjing a1 = new Anjing("Joni", 9.2);
        Burung b1 = new Burung("Elang", 1.2);

        Data<Anabul> data = new Data<>();

        data.setIsi(1, k1);
        data.setIsi(2, k2);
        data.setIsi(3, a1);
        data.setIsi(4, b1);

        System.out.println("DATA ANABUL");

        for (int i = 1; i <= data.getSize(); i++) {
            Anabul x = data.getIsi(i);

            System.out.println("Index ke-" + i);
            x.gerak();
            x.bersuara();
            System.out.println();
        }

        System.out.println("Total elemen: " + data.getSize());
    }
}
