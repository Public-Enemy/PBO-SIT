package latihanprequiz;

public class Driver { // main initialisasi eksekusi dari package latihanprequiz
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Ahmad Luky Ramdani", "jl.ra.Basyid", "Bandar Lampung", 28,'L',"PBO","S2", 30000000); // konstrusktor objeck dengan parameter kelas konstruktor dosen
        System.out.println(dosen.toString()); // mencetak string hasi dari method toString dari class Dosen

        MahasiswaReport mhsrpt = new MahasiswaReport(); // konstruktor objek dari kelas MahasiswaReport(MahasiswaReport.java)
        mhsrpt.setmk1("Data Mining"); // inisialisasi nilai atribute mk1 pada objek mhsrpt dengan method setmk1
        mhsrpt.setnilai1("A"); // inisialisasi nilai atribute nilai1 pada objek mhsrpt dengan method setnilai1
        mhsrpt.setsks1(4); // inisialisasi nilai atribute sks1 pada objek mhsrpt dengan method setsks1
        mhsrpt.setmk2("Data Mining Lanjut"); // inisialisasi nilai atribute mk1 pada objek mhsrpt method setmk2
        mhsrpt.setnilai2("B"); // inisialisasi nilai atribute nilai1 pada objek mhsrpt dengan method setnilai2
        mhsrpt.setsks2(4); // inisialisasi nilai atribute sks1 pada objek mhsrpt dengan method setsks2
        System.out.println(mhsrpt.toString()); // mencetak string hasi dari method toString dari class MahasiswaReport

        Mahasiswa hs = new Mahasiswa("Barak Obama", "Way Hui", "Bandar Lampung", 21,'L', "14117001", "RC", 4, new MahasiswaReport("PBO","PBO Lanjut",3, 3, "A", "B")); // konstrusktor objeck dengan parameter kelas konstruktor mahasiswa
        System.out.println(hs.toString()); // mencetak string hasi dari method toString dari class Mahasiswa
    }
}
