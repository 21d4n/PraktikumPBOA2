/*  NIM     : 24060124130099
    Nama    : Dehar Zaidan Dzaki Amirullah
    Tanggal : 20 April 2026
*/

class Mahasiswa {
    private int NIM;
    private String Nama;
    private String Programstudi;

    // 2a
    public int getNIM(){
        return NIM;
    }

    public String getNama(){
        return Nama;
    }

    public String getProgramstudi(){
        return Programstudi;
    }

    public void setNIM(int NIM){
        this.NIM = NIM;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public void setProgramstudi(){
        this.Programstudi = "Kosong";
    }

    public void setProgramstudi(String prodi){
        this.Programstudi = prodi;
    }

    public void setProgramstudi(Mahasiswa mhs){
        this.Programstudi = mhs.getProgramstudi(); 
    }

    // 2c
    public Mahasiswa(){
        this.NIM = -999;
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    //2d
    public Mahasiswa(int NIM, String Nama, String Prodi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Prodi;
    }

    //2e
    public Mahasiswa(Mahasiswa mhs){
        this.NIM = mhs.getNIM();
        this.Nama = mhs.getNama();
        this.Programstudi = mhs.getProgramstudi();
    }
}