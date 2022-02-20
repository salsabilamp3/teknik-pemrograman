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
public class InputOutput2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] kata;
        int[] angka;
        int iterasi;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Jumlah perulangan: ");
        iterasi = in.nextInt();
        
        kata = new String[iterasi];
        angka = new int[iterasi];
        
        for(int i=0; i<iterasi; i++){
            kata[i] = in.next();
            angka[i] = in.nextInt();
        }
        
        System.out.println("\n================================");
        for(int i=0; i<iterasi; i++){
            System.out.printf("%-15s%03d%n",kata[i], angka[i]);
        }
        System.out.println("================================");
    }
    
}
