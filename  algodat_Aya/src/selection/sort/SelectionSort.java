 
package selection.sort;

import java.util.Arrays;

/**
 *
 * @author falya amrina zahra
 */
public class SelectionSort {

    public static void main(String[] args) {
         int data[]={10,95 ,6,15,70,25};
        int min = data[0];
        int index = 0;
        
        for(int j=0;j<data.length-1;j++){
        for(int i = j;i<data.length;i++) {
            if(data[i]<min){
                min = data[i];
                index = i;
            }
            System.out.println(Arrays.toString(data));
        }
        if(min<data[j]){
            data[index] = data[j];
            data[j] = min;
        }
        min = data[j+1];
    }
    }
    
}

