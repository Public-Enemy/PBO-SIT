/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanprequiz;

/**
 *
 * @author secondary
 */
public class Orang {
private String nama;
    private String alamat;
    private String kota;
    private int umur;
    private char jenis_kelamin;

    void setnama(String nama) {
        this.nama = nama;
    }
    void setalamat(String alamat) {
        this.alamat = alamat;
    }
    void setkota(String kota) {
        this.kota = kota;
    }
    void setumur(int umur) {
        this.umur = umur;
    }
    void setjenis_kelamin(char jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
    
    public String getNama(){return this.nama;};
    public String getAlamat(){return this.alamat;};
    public int getUmur(){return this.umur;};
    public String getKota(){return this.kota;};
    public char getjenis_kelamin(){return this.jenis_kelamin;};
    public String toString(){
    System.out.println("Nama\t:" + this.getNama() +"\nAlamat\t:"+ this.getAlamat() +"\nKota\t:"+this.getKota() +"\nUmur\t:"+ this.getUmur());
    return "";
    }
}
