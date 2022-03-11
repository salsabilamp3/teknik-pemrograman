/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W5_Restaurant;

/**
 *
 * <h1>Analisis OOP</h1>
 * Kasus ini bertujuan untuk
 * menganalisis dan memahami bagaimana
 * membuat design class yang sesuai
 * dengan konsep OOP.
 * 
 * @author Salsabila Maharani Putri
 */
public class RestaurantMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        
        menu.kurangStok(2, 3);
        menu.tampilMenuMakanan();
    }
    
}
