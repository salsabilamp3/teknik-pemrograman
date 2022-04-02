/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance2;

/**
 *
 * @author Salsabila Maharani Putri
 */
public class TestShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println("Shape: "
                + " color = " + s1.getColor()
                + " filled = " + s1.isFilled());
        System.out.println(s1.toString());
        
        Shape s2 = new Shape("blue", false);
        System.out.println("Shape: "
                + " color = " + s1.getColor()
                + " filled = " + s1.isFilled());
        System.out.println(s2.toString());
        
        Circle c1 = new Circle();
        System.out.println("\nCircle: "
                + " radius = " + c1.getRadius()
                + " area = " + c1.getArea()
                + " perimeter = " + c1.getPerimeter());
        System.out.println(c1.toString());
        
        Circle c2 = new Circle(2);
        System.out.println("Circle: "
                + " radius = " + c2.getRadius()
                + " area = " + c2.getArea()
                + " perimeter = " + c2.getPerimeter());
        System.out.println(c2.toString());
        
        Circle c3 = new Circle(3, "yellow", false);
        System.out.println("Circle: "
                + " radius = " + c3.getRadius()
                + " area = " + c3.getArea()
                + " perimeter = " + c3.getPerimeter());
        System.out.println(c3.toString());
        
        Rectangle r1 = new Rectangle();
        System.out.println("\nRectangle: "
                + " width = " + r1.getWidth()
                + " width = " + r1.getLength()
                + " area = " + r1.getArea()
                + " perimeter = " + r1.getPerimeter());
        System.out.println(r1.toString());
        
        Rectangle r2 = new Rectangle(3, 5);
        System.out.println("Rectangle: "
                + " width = " + r2.getWidth()
                + " width = " + r2.getLength()
                + " area = " + r2.getArea()
                + " perimeter = " + r2.getPerimeter());
        System.out.println(r2.toString());
        
        Rectangle r3 = new Rectangle(4, 7, "black", true);
        System.out.println("Rectangle: "
                + " width = " + r3.getWidth()
                + " width = " + r3.getLength()
                + " area = " + r3.getArea()
                + " perimeter = " + r3.getPerimeter());
        System.out.println(r3.toString());
        
        Square sq1 = new Square();
        System.out.println("\nSquare: "
                + " side = " + sq1.getSide()
                + " area = " + sq1.getArea()
                + " perimeter = " + sq1.getPerimeter());
        System.out.println(sq1.toString());
        
        Square sq2 = new Square(3);
        System.out.println("Square: "
                + " side = " + sq2.getSide()
                + " area = " + sq2.getArea()
                + " perimeter = " + sq2.getPerimeter());
        System.out.println(sq2.toString());
        
        Square sq3 = new Square(6, "pink", false);
        System.out.println("Square: "
                + " side = " + sq3.getSide()
                + " area = " + sq3.getArea()
                + " perimeter = " + sq3.getPerimeter());
        System.out.println(sq3.toString());
    }
    
}
