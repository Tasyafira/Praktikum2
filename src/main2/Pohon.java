/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Pohon {
    String nama;
    int tinggi;
    Scanner input = new Scanner(System.in);
    
    void setNama(){
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
    }
    void setTinggi(){
        System.out.print("Masukkan Tinggi : ");
        tinggi = input.nextInt();
    }
    void getNama(){
        System.out.println("Nama Pohon : "+nama);
    }
    void getTinggi(){
        System.out.println("Tinggi : "+tinggi+"M");
    }
}

