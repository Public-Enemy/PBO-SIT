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
public class Mahasiswa extends Orang{
    
    private String NIM;
    private String kelas;
    private int semester;
    private MahasiswaReport report;

    public Mahasiswa(String nama, String alamat, String kota, int umur, char jenis_kelamin, String NIM, String kelas, int semester, MahasiswaReport Report)
    {
        super.setnama(nama);
        super.setalamat(alamat);
        super.setkota(kota);
        super.setumur(umur);
        super.setjenis_kelamin(jenis_kelamin);
        this.NIM = NIM;
        this.kelas = kelas;
        this.semester = semester;
        this.report = Report;
    }
    @Override
    public String toString() {
        System.out.println("Informasi Mahasiswa\n" +
"============================");
        super.toString();
        System.out.println("NIM\t:" + this.NIM + "\nSemester\t:" + this.kelas + "\n");
        return "";
    }
}
