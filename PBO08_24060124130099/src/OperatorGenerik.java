/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 27 April 2026
*/

public class OperatorGenerik {
    public static <T> void tukar(Datum<T> datum1, Datum<T> datum2) {
        T temp = datum1.getIsi();
        datum1.setIsi(datum2.getIsi());
        datum2.setIsi(temp);
    }

    public static <T extends Kucing> double Bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}