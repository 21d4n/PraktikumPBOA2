/*  Nama File   : Titik.java
    Deskripsi   : berisi atribut dan method dalam class Titik
    Pembuat     : Dehar Zaidan Dzaki Amirullah
    Tanggal     : 23 Februari 2025
*/

public class Titik {
    /**********ATRIBUT*********/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /**********METHOD*********/
    //konstruktor untuk membuat titik (0,0)
    // Titik(){
    //     absis = 0;
    //     ordinat = 0;
    //     counterTitik++;
    // }

    //konstruktor dengan masukan nilai
    public Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0,0);
    }

    //mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    //mengembalikan nilai countertitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan kuadran titik
    public int getKuadran(){
        if(this.absis > 0 && this.ordinat > 0){
            return 1;
        }
        else if(this.absis < 0 && this.ordinat > 0){
            return 2;
        }
        else if(this.absis < 0 && this.ordinat < 0){
            return 3;
        }
        else{
            return 4;
        }
    }

    //mengembalikan jarak titik ke pusat
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    //mengembalikan jarak titik ke titik lain
    public double getJarak(Titik Seblak){
        return Math.sqrt(Math.pow(Seblak.getAbsis() - this.absis, 2) + Math.pow(Seblak.getOrdinat() - this.ordinat, 2));
    }

    //refleksi titik dengan sumbu X
    

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //mencetak counter titik
    public void printCounterTitik(){
        System.out.println(counterTitik);
    }

} //end class Titik
