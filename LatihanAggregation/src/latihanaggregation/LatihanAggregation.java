/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanaggregation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tata
 */
public class LatihanAggregation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Film f1 = new Film("Jujutsu Kaisen 0", 105);
        Film f2 = new Film("The Batman", 176);
        Film f3 = new Film("Ambulance", 136);
        Film f4 = new Film("Uncharted", 116);
        
        List<Film> films = new ArrayList<Film>();
        films.add(f1);
        films.add(f2);
        films.add(f3);
        films.add(f4);
        
        Bioskop bioskop = new Bioskop("CGV", films);
        
        System.out.println(bioskop.getNamaBioskop()+" hari ini menayangkan "+bioskop.getTotalFilm()+" film.");
    }
    
}
