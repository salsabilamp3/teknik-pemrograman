/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihandependence;

/**
 *
 * @author Tata
 */
public class LatihanDependence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Film A = new Film("Red Notice", 118);
        Film B = new Film("Gekijō-ban Jujutsu Kaisen 0", 105);
        Tiket tiket = new Tiket();
        
        tiket.setHarga(40000);
        tiket.printTiket(A);
        
        tiket.setHarga(50000);
        tiket.printTiket(B);
    }
    
}
