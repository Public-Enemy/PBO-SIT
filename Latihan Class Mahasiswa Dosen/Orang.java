package latihanprequiz;

public class Orang {
private String nama; // deklrasi atribute nama
    private String alamat; // deklrasi atribute alamat
    private String kota; // deklarasi atribute kota
    private int umur; // // deklrasi atribute umut
    private char jenis_kelamin; // deklrasi atribute jenis kelamin

    void setnama(String nama) { // prosedur untuk inisialisasi nilai pada atribut nama
        this.nama = nama; // inisialisasi nilai
    }
    void setalamat(String alamat) { // prosedur untuk inisialisasi nilai pada atribut alamat
        this.alamat = alamat; // inisialisasi nilai
    }
    void setkota(String kota) { // prosedur untuk inisialisasi nilai pada atribut kota
        this.kota = kota; // inisialisasi nilai
    }
    void setumur(int umur) { // prosedur untuk inisialisasi nilai pada atribut umur 
        this.umur = umur;  // inisialisasi nilai
    }
    void setjenis_kelamin(char jenis_kelamin) { // prosedur untuk inisialisasi nilai pada atribut jenis kelamin
        this.jenis_kelamin = jenis_kelamin; // inisialisasi nilai
    }
    
    public String getNama(){return this.nama;}; // fungsi mengambil nilai attribute nama mengunakan return keyword this
    public String getAlamat(){return this.alamat;};  // fungsi mengambil nilai attribute alamat mengunakan return keyword this
    public int getUmur(){return this.umur;};  // fungsi mengambil nilai attribute umur mengunakan return keyword this
    public String getKota(){return this.kota;};  // fungsi mengambil nilai attribute kota mengunakan return keyword this
    public char getjenis_kelamin(){return this.jenis_kelamin;};  // fungsi mengambil nilai jenis_kelamin nama mengunakan return keyword this
    public String toString(){
    System.out.println("Nama\t:" + this.getNama() +"\nAlamat\t:"+ this.getAlamat() +"\nKota\t:"+this.getKota() +"\nUmur\t:"+ this.getUmur());
    return "";
    }
}
