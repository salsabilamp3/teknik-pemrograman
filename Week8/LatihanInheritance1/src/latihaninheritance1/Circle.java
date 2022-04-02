/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance1;

/**
 *
 * @author Salsabila Maharani Putri
 */
public class Circle {
    //private instance variable, not accessible from outside this class
    private double radius;
    private String color;
    
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    
    public  Circle(double r){
        radius = r;
        color = "red";
    }
    
    public Circle(double r, String c){
        radius = r;
        color = c;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Circle[radius = " + radius + " color = " + color + ']';
    }
}
