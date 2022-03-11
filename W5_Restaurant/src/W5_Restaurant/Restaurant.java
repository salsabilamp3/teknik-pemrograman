/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W5_Restaurant;

/**
 *
 * @author Salsabila Maharani Putri
 */
public class Restaurant {
    private DetailMenu[] menu;
    private static byte id;
    
    public Restaurant(){
        menu = new DetailMenu[10];
        for(int i=0; i<10; i++){
            menu[i] = new DetailMenu();
        }
        id = 1;
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.menu[id].setNama_makanan(nama);
        this.menu[id].setHarga_makanan(harga);
        this.menu[id].setStok(stok);
    }
    
    public void tampilMenuMakanan(){
        for(int i=0; i<=id; i++){
            if(!isOutOfStock(i)){
                System.out.println(i +". " + menu[i].getNama_makanan() + "[" + menu[i].getStok() + "]" 
                        + "\tRp. " + menu[i].getHarga_makanan());
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        if(menu[id].getStok() == 0){
            return true;
        }else{
            return false;
        }
    }
   
    public static void nextId(){
        id++;
    }
    
    public void kurangStok(int id, int jmlPesanan){
        int stok = 0;
        stok = menu[id].getStok() - jmlPesanan;
        menu[id].setStok(stok);
    }
}
