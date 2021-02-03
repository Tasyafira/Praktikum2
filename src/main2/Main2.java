/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2;

/**
 *
 * @author MOKLET-1
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pohon cemara = new Pohon();
        cemara.setNama();
        cemara.setTinggi();
        System.out.println("--------------------------");
        cemara.getNama();
        cemara.getTinggi();
        
        
        System.out.println("\n");
        
        Pohon kelapa = new Pohon();
        kelapa.setNama();
        kelapa.setTinggi();
        System.out.println("--------------------------");
        kelapa.getNama();
        kelapa.getTinggi();
    }
    
}
