/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 04 Mei 2026
*/

public class MainTeman {
    public static void main(String[] args) {
        Teman bestie = new Teman();

        bestie.addNama("kak nicho");
        System.out.println("Menambahkan kak nicho menjadi bestie");
        bestie.addNama("pak rektor");
        System.out.println("Menambahkan pak rektor menjadi bestie");
        bestie.addNama("ibu kantin");
        System.out.println("Menambahkan ibu kantin menjadi bestie");
        bestie.addNama("bu bambang");
        System.out.println("Menambahkan bu bambang menjadi bestie");
        bestie.addNama("bang yb");
        System.out.println("Menambahkan bang yb menjadi bestie");

        System.out.println("\nJumlah teman: " + bestie.getNbelm());

        bestie.delNama("bu bambang");
        System.out.println("\nMenghapus bu bambang dari bestie");

        System.out.println("\nApakah kak nicho bestie gua? " + bestie.isMember("kak nicho"));

        bestie.gantiNama("ibu kantin", "bapak kantin");
        System.out.println("\nmengganti ibu kantin menjadi bapak kantin");

        System.out.println("\nada berapa pak rektor di list bestie? " + bestie.countNama("pak rektor"));

        System.out.println("\ndaftar bestie gua:");
        bestie.showTeman();

    }
}
