/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 20 April 2026
*/

public class MainMahasiswa {
    public static void main(String[] args) {

        // Konstruktor tanpa parameter
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("m1 (default):");
        System.out.println("NIM: " + m1.getNIM());
        System.out.println("Nama: " + m1.getNama());
        System.out.println("Prodi: " + m1.getProgramstudi());
        
        // Konstruktor 3 parameter
        Mahasiswa m2 = new Mahasiswa(12345, "Messi", "Informatika");
        System.out.println("\nm2 (3 parameter):");
        System.out.println("NIM: " + m2.getNIM());
        System.out.println("Nama: " + m2.getNama());
        System.out.println("Prodi: " + m2.getProgramstudi());

        // Konstruktor copy / cloning
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("\nm3 (clone m2):");
        System.out.println("NIM: " + m3.getNIM());
        System.out.println("Nama: " + m3.getNama());
        System.out.println("Prodi: " + m3.getProgramstudi());

        System.out.println("\nsetProgramStudi");

        // setter tanpa parameter
        m1.setProgramstudi();
        System.out.println("Prodi m1 setelah menggunakan varian set kosong: " + m1.getProgramstudi());

        // setter dengan parameter String
        m1.setProgramstudi("Kedokteran");
        System.out.println("Prodi m1 setelah menggunakan varian set string: " + m1.getProgramstudi());

        // setter dengan parameter objek Mahasiswa lain
        m1.setProgramstudi(m2);
        System.out.println("Prodi m1 setelah copy dari m2: " + m1.getProgramstudi());
    }
}
