/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 04 Mei 2026
*/

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul a) {
        Lanabul.add(a);
        nbelm++;
    }

    public boolean isMember(Anabul a) {
        return Lanabul.contains(a);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            nbelm--;
        }
        return Lanabul.poll();
    }

    public void showAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;

        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double total = 0;

        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing)a).getBobot();
            }
        }
        return total;
    }

    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama() + " - " + a.getClass().getName());
        }
    }
}
