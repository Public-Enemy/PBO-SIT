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
public class TimJKT48w32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tim JKT48 = new Tim();
        JKT48.setNama("Tim T"); // set nama tim
        Member m1 = new Member("Melody",23); // konstruk member m1
        Member m2 = new Member("Haruka",19); // konstruk member m2
        Member m3 = new Member("Kinal",23); // konstruk member m3
        Trainee t1 = new Trainee("Alicia",17,3); // konstruk trainee t1
        Trainee t2 = new Trainee("Indah",17,5); // konstruk trainee t2
        JKT48.setMember(m1); // menambahkan objek ke dalam objek
        JKT48.setMember(t1); // menambahkan objek ke dalam objek
        JKT48.setMember(m2); // menambahkan objek ke dalam objek 
        JKT48.setMember(t2); // menambahkan objek ke dalam objek
        JKT48.setMember(m3); // menambahkan objek ke dalam objek
        System.out.println("Full Member : ");  // verbositas
        JKT48.displayFullMember(); // memangil method untuk menampilkan member
        System.out.println("Trainee : "); // verbositas
        JKT48.displayTrainee(); // memangil method untuk menampilkan trainee
    }
    
}
