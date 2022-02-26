/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4_kasus2;

/**
 *
 * @author : Salsabila Maharani Putri
 */
public class Item {
    private String name;
    
    private Item() {
        name = "Ipin";
    }
    public Item(String name) {
        this(); // memanggil constructor item()
        System.out.println(this.name);
    }
}
