/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_pbo_rc;

/**
 *
 * @author secondary
 */
public class generateDeret {
    private int nilaiAwal; // attribute private nilaiAwal
    private int rasioDeret; // attribute private rasioDeret
    private int banyakDeret; // attribute private banyakDeret
    
    public void setnilaiAwal(int nilaiMasuk){this.nilaiAwal = nilaiMasuk;} // ini prosedure untuk mematok nilai pada attribute private nilaiAwal
    public void setrasioDeret(int nilaiDeret){this.rasioDeret = nilaiDeret;} // ini prosedure untuk mematok nilai pada attribute private rasioDeret
    public void setbanyakDeret(int nilaiBanyak){this.banyakDeret = nilaiBanyak;} // ini prosedure untuk mematok nilai pada attribute private banyakDeret
    public void tampilkanDeret(){ 
        int tampilan,s; // sebagai modifier penyimpan hasil akumulasi dan index iterasi
        tampilan = this.nilaiAwal; // modifier tampilan ditambah nilaiAwal sebagai patokan awal deret
        for(s = 1;s <= this.banyakDeret;s++){ // pengulangan untuk banyak sesuai deret
            tampilan += this.rasioDeret; // akumulasi nilai sebelumnya dengan rasio
            System.out.println(tampilan); // mencetak tampilan nilai
        }
    }
}
