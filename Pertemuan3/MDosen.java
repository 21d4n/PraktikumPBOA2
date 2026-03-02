package Pertemuan3;

public class MDosen {
    public static void main(String[] args) {
        Dosen D1 = new Dosen();
        D1.setNIP("087829321236");
        D1.setNama("Dr. Eng. Ameng S.Kom M.Kom");
        D1.setProdi("Informatika");
        System.out.println("NIP Dosen: " + D1.getNIP());
        System.out.println("Nama Dosen: " + D1.getNama());
        System.out.println("Prodi Dosen: " + D1.getProdi());
    }
    
}
