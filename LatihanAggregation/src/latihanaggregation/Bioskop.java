/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanaggregation;

import java.util.List;

/**
 *
 * @author Tata
 */
public class Bioskop {
    private String namaBioskop;
    private List<Film> films;
    
    Bioskop(String nama, List<Film> films){
        this.namaBioskop = nama;
        this.films = films;
    }
    
    public String getNamaBioskop(){
        return namaBioskop;
    }
    
    public int getTotalFilm(){
        int jumlahFilm = 0;
        
        for(Film f : films){
            jumlahFilm++;
        }
        return jumlahFilm;
    }
}
