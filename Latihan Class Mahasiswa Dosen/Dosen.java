package latihanprequiz;

public class Dosen extends Orang{
   private String mk; // Attribute untuk Nama Mata Kuliah
    private String strata; // Attribute untuk Strata Dosen
    private int salary; // Attribute untuk gaji dosen

    
    public Dosen(String nama , String alamat,String kota,int umur,char jenis_kelamin,String mk, String strata , int salary){
        super.setnama(nama); // Menanggil method parent (Orang.java) : setnama()
        super.setalamat(alamat); // Menanggil method parent (Orang.java) : setalamat()
        super.setkota(kota); // Menanggil method parent (Orang.java) : setkota()
        super.setumur(umur); // Menanggil method parent (Orang.java) : setumur()
        super.setjenis_kelamin(jenis_kelamin); // Menanggil method parent (Orang.java) : setjenis_kelamin()
        this.mk = mk; // Meng-inisialisasi nilai untuk attribute mk pada kelas Dosen
        this.strata = strata; // Meng-inisialisasi nilai untuk attribute strata pada kelas Dosen
        this.salary = salary; // Meng-inisialisasi nilai untuk attribute salary pada kelas Dosen
    }
    @Override // untuk meninisialisasi ulang method modifikasi karena method ini tersedia di parent kelas ini (Orang.Java)
    public String toString(){
        System.out.println("Informasi Dosen\n" +"============================\n"+"Nama\t:" + super.getNama() +"\nAlamat\t:"+ super.getAlamat() +"\nKota\t:"+super.getKota() +"\nUmur\t:"+ super.getUmur()+"\nMK\t:"+this.mk +"\nStrata\t:" + this.strata + "\nSalary\t:" + this.salary); // untuk menampilkan laporan dari method ini
        return "";
    }
}
