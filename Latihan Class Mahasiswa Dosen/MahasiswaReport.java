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
public class MahasiswaReport {
   private static final int A = 4;
    private static final int B = 3;
    private static final int C = 2;
    private static final int D = 1;
    private static final int E = 0;
    private String mk1;
    private String mk2;
    private int sks1;
    private int sks2;
    private String nilai1;
    private String nilai2;

    MahasiswaReport(){}
    MahasiswaReport(String mk1, String mk2, int sks1, int sks2, String nilai1, String nilai2) {
    }
    MahasiswaReport(MahasiswaReport sp) {
    }
    public String getmk1() {
        return this.mk1;
    }
    public void setmk1(String mk1) {
        this.mk1 = mk1;
    }
    public String getmk2() {
        return this.mk2;
    }
    public void setmk2(String mk2) {
        this.mk2 = mk2;
    }
    public int getsks1() {
        return this.sks1;
    }
    public void setsks1(int sks1) {
        this.sks1 = sks1;
    }
    public int getsks2() {
        return this.sks2;
    }
    public void setsks2(int sks2) {
        this.sks2 = sks2;
    }
    public String getnilai1() {
        return this.nilai1;
    }
    public void setnilai1(String nilai1) {
        this.nilai1 = nilai1;
    }
    public String getnilai2() {
        return this.nilai2;
    }
    public void setnilai2(String nilai2) {
        this.nilai2 = nilai2;
    }
    public float HitungNR()
    {
        return ((this.sks1 * ConvertNilaiMutu(this.nilai1)) + (this.sks2 * ConvertNilaiMutu(this.nilai2)))/2;
    }
    public float ConvertNilaiMutu(String HurufMutu){
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
