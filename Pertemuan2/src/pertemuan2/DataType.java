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
public class DataType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int testCase, i=0;
        int j;
        long tampung;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah case : ");
        testCase = in.nextInt();
        
        for(i=0; i<testCase; i++){
            try{
                tampung = 0;
                j = i+1;
                System.out.print("Case ke-"+j+": ");
                tampung = in.nextLong();
                System.out.println("Can be fit in:");
                if(tampung>=Byte.MIN_VALUE && tampung<=Byte.MAX_VALUE){
                    System.out.println("byte");
                }
                if(tampung >= Short.MIN_VALUE && tampung <= Short.MAX_VALUE){
                    System.out.println("short");
                }
                if(tampung >= Integer.MIN_VALUE && tampung <= Integer.MAX_VALUE){
                    System.out.println("int");
                }
                if(tampung >= Long.MIN_VALUE && tampung <= Long.MAX_VALUE){
                    System.out.println("long");
                }
            }catch(Exception salah){
                System.out.println("Can't be fit anywhere.");
                in.nextLine();
            }
        }
    }
    
}
