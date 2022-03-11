/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w5_anime;

/**
 *
 * <h1>Inheritance</h1>
 * Kasus ini bertujuan untuk memahami
 * bagaimana inheritance pada class bekerja
 * beserta urutan prioritasnya.
 * 
 * @author Salsabila Maharani Putri
 */
public class NarutoAnime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sasuke s = new Sasuke();
        s.printDojutsu();
        Itachi i = new Sasuke();
        i.printKekkeiGenkai();
    }
    
}
