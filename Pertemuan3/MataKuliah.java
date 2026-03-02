package Pertemuan3;

public class MataKuliah {
    //Atribut
    private String idMatKul;
    private String nama;
    private int sks;

    //Method
    public MataKuliah(){
        this("-","-",0);
    }

    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getidMatKul(){
        return idMatKul;
    }

    public String getnama(){
        return nama;
    }

    public int getsks(){
        return sks;
    }

    public void setidMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setsks(int sks){
        this.sks = sks;
    }
}
