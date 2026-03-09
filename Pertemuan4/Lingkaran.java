package Pertemuan4;

public class Lingkaran extends bangundatar {
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
}
