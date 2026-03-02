public class Garis {
    /**********ATRIBUT*********/
    private Titik titikawal; 
    private Titik titikakhir;
    private static int countergaris = 0;

    /**********METHOD*********/
    //konstruktor untuk membuat titik (0,0)
    public Garis(){
        this(new Titik(0,0), new Titik(1,1));
    }

    public Garis(Titik titikawal, Titik titikakhir){
        this.titikawal = titikawal;
        this.titikakhir = titikakhir;
        countergaris++;
    }

    public Titik getTitikawal(){
        return titikawal;
    }

    public Titik getTitikakhir(){
        return titikakhir;
    }

    public int getcountergais(){
        return countergaris;
    }
}
