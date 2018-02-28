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
public class Member {
    protected String nama; // deklarasi atribute nama
    protected int umur;  // deklarasi atribute umur
    
    public Member(String nama , int umur){
        this.nama = nama; // assign atribute nama
        this.umur = umur; // assign atribute umur
    }
    
    public void setUmur(int umur){
        this.umur = umur; // assign atribute umur
    }
    public void display(){
        System.out.println("Nama : " + this.nama); // cetak nama
        System.out.println("Umur : " + this.umur); // cetak umur
    }
}
