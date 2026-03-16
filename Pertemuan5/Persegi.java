/*  Nama File   : Persegi.java
    Deskripsi   : berisi atribut dan method dalam class Persegi
    Pembuat     : Dehar Zaidan Dzaki Amirullah
    Tanggal     : 16 Maret 2026
*/

package Pertemuan5;

public class Persegi extends bangundatar implements iResize {
    //atribut
    private double sisi;

    //methods
    public Persegi(){
        setJmlSisi(4);
        this.sisi = 0;
    }

    public Persegi(double sisi, String warna, String border){
        super(4,warna,border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return this.sisi * this.sisi;
    }

    public double getKeliling(){
        return this.sisi * 4;
    }

    public double getDiagonal(){
        return this.sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }
}
