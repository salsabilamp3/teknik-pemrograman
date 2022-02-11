/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.util.Scanner;

/**
 *
 * @author Tata
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String A;
        String B;
        int length, compare;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input String A: ");
        A = in.nextLine();
        System.out.print("Input String B: ");
        B = in.nextLine();
        
        A = A.toLowerCase();
        B = B.toLowerCase();
        length = A.length() + B.length();
        compare = A.compareTo(B);
        A = A.substring(0,1).toUpperCase()+A.substring(1, A.length());
        B = B.substring(0,1).toUpperCase()+B.substring(1, B.length());
        
        System.out.println(length);
        if(compare>0){
            System.out.println("Yes");
        }
        else if(compare<0){
            System.out.println("No");
        }
        else{
            System.out.println("Equal");
        }
        System.out.println(A+" "+B);
    }
    
}
