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
public class Tiket {
    private int harga;
    private int jumlah;
    
    public int getHarga(){
        return harga;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public void printTiket(Film film){
        System.out.println("Judul: " + film.getJudul());
        System.out.println("Durasi: " + film.getDurasi() + " menit.");
        System.out.println("Harga: Rp." + getHarga());
    }
}
