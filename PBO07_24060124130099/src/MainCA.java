public class MainCA {
    public static void main(String[] args) {

        // DOSEN (2 orang)
        Dosen d1 = new Dosen("Pak Edy", "D001");
        Dosen d2 = new Dosen("Bu Beta", "D002");

        // MAHASISWA (5 orang)
        Mahasiswa2 m1 = new Mahasiswa2("Dehar", "24060124130099");
        Mahasiswa2 m2 = new Mahasiswa2("Galang", "24060124130101");
        Mahasiswa2 m3 = new Mahasiswa2("Dzaki", "24060124130103");
        Mahasiswa2 m4 = new Mahasiswa2("Dewa", "24060124130118");
        Mahasiswa2 m5 = new Mahasiswa2("Devano", "24060124140149");

        // SET DOSEN WALI
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        // SEMINAR
        Seminar s = new Seminar();

        // REGISTRASI (7 peserta)
        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        // TAMPIL PESERTA
        System.out.println("DAFTAR PESERTA SEMINAR");
        s.tampilPeserta();

        // COUNT
        System.out.println("\nTotal peserta: " + s.countPeserta());
        System.out.println("Jumlah mahasiswa: " + s.countMahasiswa());

        // DATA MAHASISWA
        System.out.println("\nDATA MAHASISWA");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}
