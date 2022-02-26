/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4_kasus3;

/**
 * <h1>Add Stok</h1>
 * Kasus ini bertujuan untuk mempelajari tentang 
 * urutan pengeksekusian blok di java.
 * terdapat 2 blok yang diutamakan di sini
 * yaitu static block dan instance block
 * ketika dijalankan, maka static block akan dieksekusi
 * terlebih dahulu dan kemudian instance block.
 * Namun, instance block sendiri baru bisa dijalankan
 * jika sudah membuat objeknya, dan akan dijalankan sebanyak objek,
 * sedangkan static hanya akan dijalankan sekali meskipun objek
 * dari class tersebut lebih dari satu.
 * 
 * @author : Salsabila Maharani Putri
 */
public class KelasDua {

    {
        /*Instance method*/
        System.out.println(5);
    }
    
    public static void main(String[] args) {
        System.out.println(6);
        KelasSatu satu = new KelasSatu();
        KelasSatu dua = new KelasSatu(10);
        //KelasDua tiga = new KelasDua();
    }
    
    
}
