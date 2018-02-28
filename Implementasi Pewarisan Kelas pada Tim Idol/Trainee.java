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
public class Trainee extends Member{
    private int lamaTraining;
    
    public Trainee(String nama , int umur ,int lamaTraining){ // konstruktor kelas trainee
        super(nama,umur); // assign kelas ortu
        this.lamaTraining = lamaTraining; // assign lama training dengan argue lamaTraining
    }
    public int getLama(){
        return this.lamaTraining; // mengambil nilai dari attribute lama training
    }
    @Override
    public void display(){
        System.out.println("Nama : " + this.nama); // print nama
        System.out.println("Umur : " + this.umur); // print umur
        System.out.println("Lama Training : "+ this.lamaTraining); // print lama training
    }
}
