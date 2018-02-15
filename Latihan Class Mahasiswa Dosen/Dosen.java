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
public class Dosen extends Orang{
   private String mk;
    private String strata;
    private int salary;

    
    public Dosen(String nama , String alamat,String kota,int umur,char jenis_kelamin,String mk, String strata , int salary){
        super.setnama(nama);
        super.setalamat(alamat);
        super.setkota(kota);
        super.setumur(umur);
        super.setjenis_kelamin(jenis_kelamin);
        this.mk = mk;
        this.strata = strata;
        this.salary = salary;
    }
    @Override
    public String toString(){
        System.out.println("    Informasi Dosen\n" +
"    ============================\n"+"Nama\t:" + super.getNama() +"\nAlamat\t:"+ super.getAlamat() +"\nKota\t:"+super.getKota() +"\nUmur\t:"+ super.getUmur()+"\nMK\t:"+this.mk +"\nStrata\t:" + this.strata + "\nSalary\t:" + this.salary);
        return "";
    }
}
