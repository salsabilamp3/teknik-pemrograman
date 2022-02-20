/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

import java.util.Scanner;

/**
 *
 * @author Tata
 */
public class GajiAgent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int penjualan, totalGaji = 0;
        final int gajiPokok = 500000;
        final int hargaItem = 50000;
                
        Scanner in = new Scanner(System.in);
        
        System.out.print("Total Penjualan : ");
        penjualan = in.nextInt();
        
        if(penjualan < 15){
            totalGaji = gajiPokok - (((15 - penjualan) * hargaItem) * 15/100);
        }
        else if(penjualan >= 40 && penjualan <= 80){
            totalGaji = gajiPokok + ((penjualan * hargaItem) * 25/100);
        }
        else if(penjualan >= 80){
            totalGaji = gajiPokok + ((penjualan * hargaItem) * 35/100);
        }
        else{
            totalGaji = gajiPokok + ((hargaItem * 10/100) * penjualan);
        }
        
        System.out.println("Gaji yang diterima : " + totalGaji);
    }
    
}
