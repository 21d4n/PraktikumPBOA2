/*  Nama File   : iResize.java
    Deskripsi   : berisi method dalam interface iResize
    Pembuat     : Dehar Zaidan Dzaki Amirullah
    Tanggal     : 13 Maret 2026
*/

package Pertemuan5;

public interface iResize {
    //menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    //menambah ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}
