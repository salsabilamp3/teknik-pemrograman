/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4_kasus1;

/**
 *
 * @author : Salsabila Maharani Putri
 */
public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;
    
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public int getStok() {
        return stok;
    }
    
    public void addStok(int add){
        /*Method untuk menambahkan stok*/
        stok += add;
    }
}
