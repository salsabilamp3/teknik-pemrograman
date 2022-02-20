/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Tata
 */
public class BigNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger A, B;
        BigInteger sum , multiply;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("A : ");
        A = in.nextBigInteger();
        System.out.print("B : ");
        B = in.nextBigInteger();
        
        sum = A.add(B);
        multiply = A.multiply(B);
        
        System.out.println("\n" + A + " + " + B + " = " + sum);
        System.out.println(A + " x " + B + " = " + multiply);
    }
    
}
