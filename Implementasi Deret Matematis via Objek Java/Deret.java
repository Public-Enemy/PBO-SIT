import java.util.Scanner;

public class Tugas_PBO_RC {
    public static void main(String[] args) {
        generateDeret Deret1 = new generateDeret(); // Konstruktor generateDeret dengan Objek Deret1
        System.out.println("Masukan Nilai Awal : "); // menampilkan teks instruksi ke user
        Scanner NilaiAwal = new Scanner(System.in); // mengambil inputan user
        Deret1.setnilaiAwal(NilaiAwal.nextInt()); // meng-inisialisasikan nilai awal dari inputan user sebagai Integer ( nextInt() )
        System.out.println("Masukan Nilai Deret : "); // menampilkan teks instruksi ke user
        Scanner NilaiDeret= new Scanner(System.in); // mengambil inputan user
        Deret1.setrasioDeret(NilaiDeret.nextInt()); // meng-inisialisasikan nilai deret dari inputan user sebagai Integer ( nextInt() )
        System.out.println("Masukan Banyak Deret : "); // menampilkan teks instruksi ke user
        Scanner BanyakDeret = new Scanner(System.in); // mengambil inputan user
        Deret1.setbanyakDeret(BanyakDeret.nextInt()); // meng-inisialisasikan banyak deret dari inputan user sebagai Integer ( nextInt() )
        Deret1.tampilkanDeret(); // methid menampilkan deret
    }
    
}
