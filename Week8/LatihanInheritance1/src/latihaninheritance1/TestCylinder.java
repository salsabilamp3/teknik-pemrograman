/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance1;

/**
 *
 * @author Tata
 */
public class TestCylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(); 
        System.out.println("Cylinder:" 
                + " radius=" + c1.getRadius() 
                + " height=" + c1.getHeight() 
                + " base area=" + c1.getArea() 
                + " volume=" + c1.getVolume());
        
        Cylinder c2 = new Cylinder(10.0); 
        System.out.println("Cylinder:" 
                + " radius=" + c2.getRadius() 
                + " height=" + c2.getHeight() 
                + " base area=" + c2.getArea() 
                + " volume=" + c2.getVolume());
        
        Cylinder c3 = new Cylinder(2.0, 10.0); 
        System.out.println("Cylinder:" 
                + " radius=" + c3.getRadius() 
                + " height=" + c3.getHeight() 
                + " base area=" + c3.getArea() 
                + " volume=" + c3.getVolume());
        
        System.out.println("\n" + c2.toString());
        System.out.println(c3.toString());
    }
    
}
