/*  Nama File   : Lingkaran.java
    Deskripsi   : berisi atribut dan method dalam class Lingkaran
    Pembuat     : Dehar Zaidan Dzaki Amirullah
    Tanggal     : 16 Maret 2026
*/

package Pertemuan5;

public class Lingkaran extends bangundatar implements iResize {
    //atribut
    private double jari;

    //methods
    public Lingkaran(){
        setJmlSisi(1);
        this.jari = 0;
    }

    public Lingkaran(double diameter, String warna, String border){
        super(1,warna,border);
        this.jari = diameter / 2;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * Math.pow(jari, 2);
    }

    public double getKeliling(){
        return 2 * Math.PI * this.jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }
}
