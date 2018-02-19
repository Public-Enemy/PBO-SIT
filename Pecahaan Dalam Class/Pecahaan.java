package pecahan;

public class Pecahaan {
    private int pembilang;
    private int penyebut;
    
    public int getPembilang(){return this.pembilang;}
    public int getPenyebut(){return this.penyebut;}
    public Pecahaan(int pembilangs , int penyebuts){this.pembilang = pembilangs;this.penyebut = penyebuts;}
    public Pecahaan tambah(Pecahaan Fractions){
        int pembilangs ; int penyebuts = this.penyebut;
        pembilangs = Fractions.getPembilang() * this.penyebut + this.pembilang * Fractions.penyebut;
        penyebuts *= Fractions.getPenyebut();
        Pecahaan Hasil = new Pecahaan(pembilangs,penyebuts);
        return Hasil;
    }
}
