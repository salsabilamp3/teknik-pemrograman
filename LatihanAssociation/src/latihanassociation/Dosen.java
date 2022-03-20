/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanassociation;

import java.util.List;

/**
 *
 * @author Tata
 */
public class Dosen {
    private String kodeDosen;
    private List<Mahasiswa> mhs;

    public String getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public List<Mahasiswa> getMhs() {
        return mhs;
    }

    public void setMhs(List<Mahasiswa> mhs) {
        this.mhs = mhs;
    }
    
}
