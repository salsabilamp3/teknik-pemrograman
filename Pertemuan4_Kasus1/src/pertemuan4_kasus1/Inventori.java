/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4_kasus1;

/**
 *
 * @author Tata
 */
public class Inventori {
    Barang[] barangs;
    
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    void showBarang() {
        System.out.println(barangs[0].getNama_barang() + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNama_barang() + "(" + barangs[1].getStok() + ")");
    }
    void pengadaan() {
        initBarang();
        barangs[0].addStok(20);
        barangs[1].addStok(20);
        showBarang();
    }
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
    
}
