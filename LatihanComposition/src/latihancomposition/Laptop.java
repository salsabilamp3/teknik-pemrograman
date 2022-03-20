/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihancomposition;

/**
 *
 * @author Tata
 */
public class Laptop {
    private CPU cpu;
    private VGA vga;
    private String merk;
    private int harga;
    
    Laptop(String merk, int harga){
        this.merk = merk;
        this.harga = harga;
    }
    
    public void komponen(CPU cpu, VGA vga){
        this.cpu = cpu;
        this.vga = vga;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public String getNamaCPU(){
        return cpu.getNama();
    }
    
    public String getNamaVGA(){
        return vga.getNama();
    }
}
