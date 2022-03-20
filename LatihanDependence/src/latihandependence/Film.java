/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihandependence;

/**
 *
 * @author Salsabila Maharani Putri
 */
public class Film {
    private String judul;
    private int durasi;
    
    Film(String judul, int durasi){
      this.judul = judul;
      this.durasi = durasi;
    }
    
    public String getJudul() {
        return judul;
    }

    public int getDurasi() {
        return durasi;
    }
    
}
