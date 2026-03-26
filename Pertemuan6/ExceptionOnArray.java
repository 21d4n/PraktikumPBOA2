/*  Nama File   : ExceptionOnArray.java
    Deskripsi   : Program untuk menunjukkan Exception pada Array
    Pembuat     : Dehar Zaidan Dzaki Amirullah
    Tanggal     : 26 Maret 2026
*/

package Pertemuan6;

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally{
            System.out.println("clean up code...");
        }
    }
}
