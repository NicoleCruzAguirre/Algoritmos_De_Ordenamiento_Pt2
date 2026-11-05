
package algoritmos_de_ordenamiento_pt2;


public class Main {

    public static void main(String[] args) {
        
        int[] array = {9,8,3,4,2,1,7,5,6}; 
        
        System.out.println("-----MERGE SORT-----");
        
        System.out.println("Arreglo original:");
        print(array);
        
        array = MergeSort.merge(array);
        
        System.out.println("Arreglo ordenado: " );
        print(array);
        
    }
    
    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) System.out.print(i);
            else System.out.print(i + ",");
        }
        System.out.println("");
    }
    
}
