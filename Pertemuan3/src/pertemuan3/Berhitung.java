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
public class Berhitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        String[] pisah;
        pisah = new String[3];
        int a, b, hasil = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan input (A + B): ");
        input = in.nextLine();
        
        pisah = input.split("\\s");
        a = Integer.parseInt(pisah[0]);
        b = Integer.parseInt(pisah[2]);
        
        if(pisah[1].equals("+")){
            hasil = a + b;
        }
        else if(pisah[1].equals("-")){
            hasil = a - b;
        }
        else if(pisah[1].equals("*")){
            hasil = a * b;
        }
        else if(pisah[1].equals("/")){
            hasil = a / b;
        }
        else if(pisah[1].equals("%")){
            hasil = a % b;
        }else{
            System.out.println("\nOperator tidak valid.");
        }
        
        System.out.println("\n" + input + " = " + hasil);
    }
    
}
