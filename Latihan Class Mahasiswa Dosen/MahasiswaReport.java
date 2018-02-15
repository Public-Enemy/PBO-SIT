package latihanprequiz;

public class MahasiswaReport {
   private static final int A = 4; // inisialisasi attribute final sekalgius nilainya 
    private static final int B = 3; // inisialisasi attribute final sekalgius nilainya
    private static final int C = 2; // inisialisasi attribute final sekalgius nilainya
    private static final int D = 1; // inisialisasi attribute final sekalgius nilainya
    private static final int E = 0; // inisialisasi attribute final sekalgius nilainya
    private String mk1; // inisialisasi attribute mk1 ( mata kuliah ) 1
    private String mk2; // inisialisasi attribute mk2 ( mata kuliah ) 2
    private int sks1; // inisialisasi attribute sks1 ( sks ) 1
    private int sks2; // inisialisasi attribute sks2 ( sks ) 2
    private String nilai1; // inisialisasi attribute nilai1 index huruf
    private String nilai2; // inisialisasi attribute nilai2 inde huruf

    MahasiswaReport(){} // method overloading sekaligus konstruktor kelas
    MahasiswaReport(String mk1, String mk2, int sks1, int sks2, String nilai1, String nilai2) {
    }
    MahasiswaReport(MahasiswaReport sp) {
    }
    public String getmk1() { // fungsi mengambil nilai attribute nama mengunakan return keyword this
        return this.mk1;
    }
    public void setmk1(String mk1) { // prosedur untuk inisialisasi nilai pada atribut mk1
        this.mk1 = mk1;
    }
    public String getmk2() {// fungsi mengambil nilai attribute nama mengunakan return keyword this
        return this.mk2;
    }
    public void setmk2(String mk2) { // prosedur untuk inisialisasi nilai pada atribut mk2
        this.mk2 = mk2;
    }
    public int getsks1() {// fungsi mengambil nilai attribute nama mengunakan return keyword this
        return this.sks1;
    }
    public void setsks1(int sks1) { // prosedur untuk inisialisasi nilai pada atribut sks1
        this.sks1 = sks1; // inisialisasi nilai
    }
    public int getsks2() {// fungsi mengambil nilai attribute nama mengunakan return keyword this
        return this.sks2; // return nilai
    }
    public void setsks2(int sks2) { // prosedur untuk inisialisasi nilai pada atribut sks2
        this.sks2 = sks2; // inisialisasi nilai
    }
    public String getnilai1() {// fungsi mengambil nilai attribute nama mengunakan return keyword this
        return this.nilai1; // return nilai
    }
    public void setnilai1(String nilai1) { // prosedur untuk inisialisasi nilai pada atribut nilai1
        this.nilai1 = nilai1; // inisialisasi nilai
    }
    public String getnilai2() {// fungsi mengambil nilai attribute nama mengunakan return keyword this
        return this.nilai2; // return nilai
    }
    public void setnilai2(String nilai2) { // prosedur untuk inisialisasi nilai pada atribut nilai2
        this.nilai2 = nilai2; // inisialisasi nilai
    }
    public float HitungNR()
    { // this can you develop more using array for multiple sks and mk using array under object
        return ((this.sks1 * ConvertNilaiMutu(this.nilai1)) + (this.sks2 * ConvertNilaiMutu(this.nilai2)))/(this.sks1 + this,sks2); // this had mistake sorry
    }
    public float ConvertNilaiMutu(String HurufMutu){ // fungsi konversi index huruf ke index angka dengan with berdasarkan kosntanan final , mengembalikan nilai berdasarkan index huruf
        switch (HurufMutu){
            case "A":
                return A;
            case "B":
                return B;
            case "C":
                return C;
            case "D":
                return D;
            default:
                return E;
        }
    }
    public String toString() {
        System.out.println("Laporan Nilai Mahasiswa\n" +
"============================"+"\nMK1\t:"+this.mk1+"\nSKS1\t:"+this.sks1+"\nNilai1\t:"+this.nilai1+"\nMK2\t:"+this.mk2+"\nSKS2\t:"+this.sks2+"\nNilai2\t:"+this.nilai2);
        return "";
    }
    public static void main(String[] args) {
        MahasiswaReport mhsrpt = new MahasiswaReport();
        mhsrpt.setmk1("Data Mining");
        mhsrpt.setnilai1("A");
        mhsrpt.setsks1(4);
        mhsrpt.setmk2("Data Mining Lanjut");
        mhsrpt.setnilai2("B");
        mhsrpt.setsks2(4);
        System.out.println(mhsrpt.toString());
    }
}
