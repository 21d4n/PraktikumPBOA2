/*  Nama File   : bangundatar.java
    Deskripsi   : berisi atribut dan method dalam class bangundatar
    Pembuat     : Dehar Zaidan Dzaki Amirullah
    Tanggal     : 13 Maret 2026
*/

package Pertemuan5;

public abstract class bangundatar {
    //atribut
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    //methods
    public bangundatar(){
        this(0,"","");
        counterBangunDatar++;
    }

    public bangundatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(bangundatar X){ 
        return this.getLuas() == X.getLuas(); 
    }
}
