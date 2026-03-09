package Pertemuan4;

public class Main {
    public static void main(String[] args) {
        Persegi P1 = new Persegi();
        Lingkaran L1 = new Lingkaran();

        //Persegi
        P1.setSisi(4);
        P1.setWarna("Pink");
        P1.setBorder("Hytamm");
        System.out.println("Persegi guwa: ");
        P1.printInfo();
        System.out.println("Luas persegi: " + P1.getLuas());
        System.out.println("Keliling persegi: " + P1.getKeliling());
        System.out.println("Panjang diagonal persegi: " + P1.getDiagonal());
        System.out.println("\n");

        //Lingkaran
        L1.setJari(7);
        L1.setWarna("Pink");
        L1.setBorder("Hytamm");
        System.out.println("Lingkaran guwa: ");
        L1.printInfo();
        System.out.println("Luas lingkaran: " + L1.getLuas());
        System.out.println("Keliling lingkaran: " + L1.getKeliling());

    }
    
}
