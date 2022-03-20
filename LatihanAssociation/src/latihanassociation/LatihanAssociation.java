/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanassociation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tata
 */
public class LatihanAssociation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setKodeDosen("KO001N");
        
        Mahasiswa m1 = new Mahasiswa();
        m1.setNim("211524001");
        
        Mahasiswa m2 = new Mahasiswa();
        m2.setNim("211524002");
        
        List<Mahasiswa> mhs = new ArrayList<Mahasiswa>();
        mhs.add(m1);
        mhs.add(m2);
        
        dosen.setMhs(mhs);
        
        System.out.println("Dosen dengan kode " + dosen.getKodeDosen() + " mengajar mahasiswa dengan NIM " + dosen.getMhs());
    }
    
}
