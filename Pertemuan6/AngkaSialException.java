/*  Nama File   : AngkaSialException.java
    Deskripsi   : Exception untuk Angka Sial
    Pembuat     : Dehar Zaidan Dzaki Amirullah
    Tanggal     : 26 Maret 2026
*/

package Pertemuan6;

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
