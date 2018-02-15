package latihanprequiz;

public class Mahasiswa extends Orang{ // Extends menandakan Turunan dari class Orang
    
    private String NIM; // deklrasi atribute nim bertipe data string
    private String kelas; // deklrasi atribute kelas bertipe data string
    private int semester; // deklrasi atribute semester bertipe data integer
    private MahasiswaReport report; // deklrasi atribute nim bertipe data MahasiswaReport ( Tipe Data Objek )

    public Mahasiswa(String nama, String alamat, String kota, int umur, char jenis_kelamin, String NIM, String kelas, int semester, MahasiswaReport Report)
    {
        super.setnama(nama); // Menanggil method parent (Orang.java) : setnama()
        super.setalamat(alamat); // Menanggil method parent (Orang.java) : setalamat()
        super.setkota(kota); // Menanggil method parent (Orang.java) : setkota()
        super.setumur(umur); // Menanggil method parent (Orang.java) : setumur()
        super.setjenis_kelamin(jenis_kelamin); // Menanggil method parent (Orang.java) : setjenis_kelamin()
        this.NIM = NIM; // Meng-inisialisasi nilai untuk attribute NIM pada kelas ini
        this.kelas = kelas; // Meng-inisialisasi nilai untuk attribute kelas pada kelas ini
        this.semester = semester; // Meng-inisialisasi nilai untuk attribute semester pada kelas ini
        this.report = Report; // Meng-inisialisasi nilai untuk attribute report pada kelas ini
    }
    @Override
    public String toString() {
        System.out.println("Informasi Mahasiswa\n" +"============================"); // menapilkan judul laporan
        super.toString(); // menampilkan isi laporan dari parent class
        System.out.println("NIM\t:" + this.NIM + "\nSemester\t:" + this.kelas + "\n"); // Menampilkan laporan dari kelas ini
        return "";
    }
}
