/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 20 April 2026
*/

public class coersion {
    public static void main(String[] args) {
        // 1a
        String str = "123";

        int angka = Integer.parseInt(str);

        double dbl = Double.parseDouble(str);

        String balik = Integer.toString(angka);

        System.out.println("Nomor 1a");
        System.out.println("Parse Int: " + angka);
        System.out.println("Parse Double: " + dbl);
        System.out.println("To String: " + balik);

        // 1b
        int nilaiAwal = 65;

        double nilaiReal = (double) nilaiAwal;

        int nilaiBalik = (int) nilaiReal;

        System.out.println("\nNomor 1b");
        System.out.println("Nilai awal: " + nilaiAwal);
        System.out.println("Nilai double: " + nilaiReal);
        System.out.println("Nilai Int: " + nilaiBalik);

        // 1c
        String X = "1234";
        
        String Y = "5678";

        String S = X.concat(Y);

        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("\nNomor 1c");
        System.out.println("String X: " + X);
        System.out.println("String Y: " + Y);
        System.out.println("String S: " + S);
        System.out.println("Integer Z: " + Z);

        //1d
        String P = "12.34";
        
        String Q = "56.78";

        String R = P.concat(Q);

        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("\nNomor 1d");
        System.out.println("String P: " + P);
        System.out.println("String Q: " + Q);
        System.out.println("String R: " + R);
        System.out.println("Double D: " + D);

        // 1e
        int A = Integer.parseInt(S);

        System.out.println("\nNomor 1e");
        System.out.println("Integer A: " + A);

        // 1f
        String T = Integer.toString(A);

        System.out.println("\nNomor 1f");
        System.out.println("String T: " + T);
    }
}
