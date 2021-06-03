/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary.Search;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author falya amrina zahra
 */
public class BinarySearch {
      public static int binarySearch(String[] a, String x) {
        int z = 0;
        int head = a.length - 1;
        int y;

        while (z <= head) {
            y = (z + head) / 2;

            if (a[y].compareTo(x) < 0) {
                z = y + 1;
                } else if (a[y].compareTo(x) > 0) {
                    head = y - 1;
                } else {
                    return y;
                }
        }
        return -1;
    }
    
     public static int process(String[] dataUnsp, String cari){    
        
        for(int c = 0 ; c < dataUnsp.length;c++ )
        {
            if(cari.equals(dataUnsp[c]))
            {
                int dataOut = c;
                return dataOut;
            }       
        }    
        return 0;
    }       

      public static void main(String[] args) {     
        
        String ID[] ={"meja","penghapus","apel","sepatu","kelas","rumah","waktu","ganteng","cantik","berbicara"};
        String cacheID[] = ID.clone();
        String ENG[] ={"table","eraser","apel","shoes","class","home","time","handsome","beautiful","talk"};
        String cacheENG[] = ENG.clone();  
        
       
        
        // Cari Kosakata ID/ENG
       
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println(">>> Cari Kosakata Menggunakan Huruf Kecil <<<");
        String search = keyboard.nextLine();
          System.out.println("\nTerjemahkan : " + search);

        int idOutput = process(cacheID,search);
        int enOutput = process(cacheENG,search);
   
        Arrays.sort(ID);
        Arrays.sort(ENG);
        int idResult = binarySearch(ID,search);
        int enResult = binarySearch(ENG,search);   
       
        if(idResult == -1 && enResult == -1)
        {
             System.out.println("\n||==============================================||");
            System.out.println("||\t     Terjemahan Tidak Ditemukan\t\t||");
             System.out.println("||==============================================||");
        }
         else
            {   for(int y = 0; y <= ID.length; y++)
                {           
                    if(search.equals(ID[y]))
                    {
                      System.out.println("\n||==============================================================||");
                      System.out.println("||                           TERJEMAHAN                         ||");
                      System.out.println("||==============================================================||");
                      System.out.println("||            Indonesia           ||           Inggris          ||");
                      System.out.println("||--------------------------------||----------------------------||");
                      System.out.println("||            " +search + "             ||" + "           " + cacheENG[idOutput] + "           ||");
                      System.out.println("||==============================================================||");
                      break;
                    }
                    else if (search.equals(ENG[y]))
                    {
                        System.out.println("\n||===============================================================||");
                        System.out.println("||                          TERJEMAHAN                           ||");
                        System.out.println("||===============================================================||");
                        System.out.println("||            Inggris           ||            Indonesia          ||");
                        System.out.println("||------------------------------||-------------------------------||");
                        System.out.println("||            "+ search + "            ||" + "           " + cacheID[enOutput] + "           ||");
                        System.out.println("||===============================================================||");
                        break;
                                            }
                    else {
                      
                        
                }
            }
        }
    }
}

