
package algoritmos_de_ordenamiento_pt2;

import java.util.Arrays;


public class MergeSort {
    
    public static int[] merge(int[] array) {
        
        if (array.length <= 1) {            
            return array;
        }

        int mitad = array.length / 2;
        
        int[] izq = Arrays.copyOfRange(array, 0, mitad);
        int[] der = Arrays.copyOfRange(array, mitad, array.length);
        
        izq = merge(izq);
        der = merge(der);
        
        int[] arrayResuelto = new int[array.length];
        
        int i = 0; 
        int j = 0; 
        int k = 0;
        
        while (i < izq.length && j < der.length) {
            if (izq[i] <= der[j]) {
                arrayResuelto[k] = izq[i];
                i++;
                k++;
            } else {
                arrayResuelto[k] = der[j];
                j++;
                k++;
            }
        }
        
        while (i < izq.length) {            
            arrayResuelto[k] = izq[i];
            i++;
            k++;
        }
        
        while (j < der.length) {
            arrayResuelto[k] = der[j];
            j++;
            k++;
        }

        return arrayResuelto;
    }
    
}
