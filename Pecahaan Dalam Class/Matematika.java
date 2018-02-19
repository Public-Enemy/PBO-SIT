/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pecahan;

/**
 *
 * @author secondary
 */
public class Matematika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pecahaan Frac1 = new Pecahaan(2,3);
        Pecahaan Frac2 = new Pecahaan(2,3);
        Frac2 = Frac1.tambah(Frac2);
        System.err.println(Frac2.getPembilang() + "/" + Frac2.getPenyebut());
    }
    
}
