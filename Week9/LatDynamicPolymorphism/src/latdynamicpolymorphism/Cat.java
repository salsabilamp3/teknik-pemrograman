/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latdynamicpolymorphism;

/**
 *
 * @author Tata
 */
public class Cat extends Animal {
    @Override
    public void sound(){
        System.out.println("Meow");
    }
    
    public static void main(String args[]){
        Animal obj = new Cat();
        obj.sound();
    }
}
