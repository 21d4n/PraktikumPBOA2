package Pertemuan3;

public class Kendaraan {
    //atribut
    private String noPlat;
    private String jenis;

    //method
    public Kendaraan(){
        this("-","-");
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getnoPlat(){
        return noPlat;
    }

    public String getjenis(){
        return jenis;
    }

    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setjenis(String jenis){
        this.jenis = jenis;
    }
}
