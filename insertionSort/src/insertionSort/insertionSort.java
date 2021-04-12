/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionSort;

/**
 *
 * @author falya amrina zahra
 */
public class insertionSort {

   public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i,j,data_sisip;
        int[] tabInt = {6,5,3,1,8,7,2,4};
    System.out.print("sebelum melakukan pengurutan insertingsort \n");

        for(i=0; i<tabInt.length; i++){ 
            System.out.print(tabInt[i]+" ");
        }
        
        
        
        for(i=1; i<tabInt.length; i++){ 
            data_sisip = tabInt[i]; 
            j = i; 
            while((j>0) && (tabInt[j-1] > data_sisip)){            
                tabInt[j] = tabInt[j-1]; 
                j = j - 1; 
            }        
            tabInt[j] = data_sisip; 
        } 
        System.out.print("\n setelah melakukan pengurutan insertingsort \n");

        for(i=0; i<tabInt.length; i++){ 
            System.out.print(tabInt[i]+" ");
        }
    }
}  
