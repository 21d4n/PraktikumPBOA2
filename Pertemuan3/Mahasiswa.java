package Pertemuan3;
import java.util.ArrayList;

public class Mahasiswa {
    //atribut
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //method
    public Mahasiswa(){
        nama = "-";
        nim = "-";
        prodi = "-";
        listMatkul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }

    public Mahasiswa(String nim, String nama, String prodi, ArrayList<MataKuliah> listMatkul, Dosen dosenWali, Kendaraan kendaraan){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = listMatkul;
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
    }

    public String getnim(){
        return nim;
    }

    public String getnama(){
        return nama;
    }

    public String getprodi(){
        return prodi;
    }

    public ArrayList<MataKuliah> getArrayList(){
        return listMatkul;
    }

    public Dosen getdosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setnama(String nama){
        this.nama = nama; 
    }

    public void setnim(String nim){
        this.nim = nim; 
    }

    public void setprodi(String prodi){
        this.prodi = prodi; 
    }

    public void addMatKul(MataKuliah newMatkul){
        listMatkul.add(newMatkul);
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    // public int getJumlahSKS(){

    // }
}
