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
public class InputOutput1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat;
        String[] kata;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ketikkan satu kalimat: ");
        kalimat = input.nextLine();
        
        kata = kalimat.split("[-+*/=,.;:'\\s]");
        System.out.println(kata.length);
        for(String w:kata){
            System.out.println(w);
        }
    }
    
}
