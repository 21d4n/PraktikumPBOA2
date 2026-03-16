/*  Nama File   : Main.java
    Deskripsi   : File main dari class bangundatar dan subclassnya
    Pembuat     : Dehar Zaidan Dzaki Amirullah
    Tanggal     : 16 Maret 2026
*/

package Pertemuan5;

public class Main {
    public static void main(String[] args) {
        // Persegi P1 = new Persegi();
        // Lingkaran L1 = new Lingkaran();

        //Persegi
        // P1.setSisi(4);
        // P1.setWarna("Pink");
        // P1.setBorder("Hytamm");
        // System.out.println("Persegi guwa: ");
        // P1.printInfo();
        // System.out.println("Luas persegi: " + P1.getLuas());
        // System.out.println("Keliling persegi: " + P1.getKeliling());
        // System.out.println("Panjang diagonal persegi: " + P1.getDiagonal());
        // System.out.println("\n");

        // //Lingkaran
        // L1.setJari(7);
        // L1.setWarna("Pink");
        // L1.setBorder("Hytamm");
        // System.out.println("Lingkaran guwa: ");
        // L1.printInfo();
        // System.out.println("Luas lingkaran: " + L1.getLuas());
        // System.out.println("Keliling lingkaran: " + L1.getKeliling());

        // PERTEMUAN 5
        // BangunDatar B1 = new BangunDatar(); 
        bangundatar P1 = new Persegi(5,"pink","pink"); 
        Persegi P2 = new Persegi(10,"pink","pink"); 
        // bangundatar L1 = new Lingkaran(7,"pink","pink"); 
        // Lingkaran L2 = new Lingkaran (14,"pink","pink");

        System.out.println("Apakah luasnya sama? " + P1.isEqualLuas(P2));
        
        P2.zoomIn();
        System.out.println("Luas Persegi P2 setelah ZoomIn: " + P2.getLuas());
        P2.zoomOut();
        System.out.println("Luas Persegi P2 setelah ZoomOut: " + P2.getLuas());
        P2.zoom(90);
        System.out.println("Luas Persegi P2 setelah Zoom 90%: " + P2.getLuas());
    }
    
}
