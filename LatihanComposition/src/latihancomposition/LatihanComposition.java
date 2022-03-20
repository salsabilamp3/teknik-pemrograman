/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihancomposition;

/**
 *
 * @author Tata
 */
public class LatihanComposition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Laptop lepi = new Laptop("Asus", 11000000);
        
        lepi.komponen(new CPU("Intel Core i7"), new VGA("NVidia"));
        
        System.out.println("Laptp "+ lepi.getMerk()+" dengan CPU "
                +lepi.getNamaCPU()+" dan VGA "+lepi.getNamaVGA()+" seharga Rp"+lepi.getHarga());
    }
    
}
