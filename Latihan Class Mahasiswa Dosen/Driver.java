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
public class Driver {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Ahmad Luky Ramdani", "jl.ra.Basyid", "Bandar Lampung", 28,'L',"PBO","S1", 30000000);
        System.out.println(dosen.toString());

        MahasiswaReport mhsrpt = new MahasiswaReport();
        mhsrpt.setmk1("Data Mining");
        mhsrpt.setnilai1("A");
        mhsrpt.setsks1(4);
        mhsrpt.setmk2("Data Mining Lanjut");
        mhsrpt.setnilai2("B");
        mhsrpt.setsks2(4);
        System.out.println(mhsrpt.toString());

        Mahasiswa hs = new Mahasiswa("Barak Obama", "Way Hui", "Bandar Lampung", 21,'L', "14117001", "RC", 4, new MahasiswaReport("PBO","PBO Lanjut",3, 3, "A", "B"));
        System.out.println(hs.toString());
    }
}
