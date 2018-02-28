/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timun;

/**
 *
 * @author secondary
 */
public class Tim{
    private String nama;
    private Member[] m = new Member[10]; // set batasan member untuk klas
    
    public void setMember(Member Aku){
        int lop =0;
        for ( lop = 0 ; lop < 10; ++lop){
            System.out.println(lop); // menghitung perulangan
            if (m[lop] == null){ // mementukan element kosong atau tidak
                m[lop] = Aku; // jika kosong assigne dengan object Member Aku
                break; // keluar perulangan
            }
        }
    }
    
    public void displayFullMember(){
        for (int lop = 0 ; lop < 10 ; lop++) {
            if ( m[lop] != null){ // cek kosong atau tidak
            if ("Member".equals(m[lop].getClass().getSimpleName())) { // untuk melihat apakah jenis kelas dari objek m[lop]
                m[lop].display(); // summon display
            }
            }
        }
    }
    
    public void displayTrainee(){
        for (Member m1 : m) { // loop via objek
            if (m1 != null){ // cek kosong atau tidak
                if ("Trainee".equals(m1.getClass().getSimpleName())) { // untuk melihat apakah jenis kelas dari objek m1
                m1.display(); // summon display
                }
            }
        }
    }
    public void setNama(String nama){
        this.nama = nama; // set nama tim
    }
    public String getNama(){
        return this.nama; // get nama tim
    }    
}
