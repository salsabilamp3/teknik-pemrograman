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
public class BukaTutupJalan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int kurangi = 999999;
        String input;
        String[] part;
        long plat;
        long hasil;
        
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        
        part = input.split("\\s");
        input = part[0].concat(part[1]).concat(part[2]).concat(part[3]);
        plat = Long.parseLong(input);
        hasil = plat - kurangi;
        hasil = hasil % 5;
        
        if(hasil == 0){
         System.out.println("berhenti");   
        }
        else{
            System.out.println("jalan");
        }
    }
    
}
