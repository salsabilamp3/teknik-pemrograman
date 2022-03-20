/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanassociation;

/**
 *
 * @author Tata
 */
public class Mahasiswa {
    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    @Override
    public String toString(){
        return nim;
    }
}
