public class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")

    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public T getIsi(int index) {
        if (index >= 1 && index <= banyak) {
            return ruang[index - 1];
        }
        else {
            return null;
        }
    }

    public void setIsi(int index, T isi) {
        if (index >= 1 && index <= 100) {
            ruang[index - 1] = isi;

            if (index > banyak) {
                banyak = index;
            }
        }
        else {
            System.out.println("Index di luar batas");
        }
    }

    public int getSize() {
        return banyak;
    }
}