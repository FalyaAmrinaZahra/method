/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinearSearch;

import java.util.Scanner;

/**
 *
 * @author falya amrina zahra
 */
public class LinearSearch {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        String data, dicari;
        int jumlah;
        System.out.println("--Pencarian Data--");
        System.out.print("Jumlah Data Yang Tersedia : ");
        jumlah = baca.nextInt();
        System.out.println("------------");
        baca.nextLine();
        String[] dataBase = new String[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Data ke "+(i+1)+" : ");
            dataBase[i] = baca.nextLine();
        }
        System.out.println("------------");
        System.out.print("Masukkan Data yang dicari : ");
        dicari = baca.nextLine();
        System.out.println("------Hasil------");
        for (int i = 0; i < jumlah; i++) {
            data = dataBase[i];
            System.out.print((i+1)+". ");
            mesinPencari mesinPencari = new mesinPencari(data, dicari);
        }
        System.out.println("---");
        
    }
} 
    
    

