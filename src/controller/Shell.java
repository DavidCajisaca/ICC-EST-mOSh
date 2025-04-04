package controller;

public class Shell {

    public void shellSort(int[] array,boolean ascendente) {
        int n = array.length;
        
        for (int gap = n / 2; gap > 0; gap /= 2) {
            int cambios=0; 
            for (int i = gap; i < n; i++) {
                
                int temp = array[i];
                int j = i;
                if (ascendente) {
                while (j >= gap && array[j - gap] > temp) { 
                   
                    array[j] = array[j - gap];
                    j -= gap;
                    cambios++;
                }
                } else {
                    while (j >= gap && array[j - gap] < temp) { 
                        array[j] = array[j - gap];
                        j -= gap;
                        cambios++;
                    }
                }
                array[j] = temp;
            }
            System.out.println("\tCambios: " + cambios+" gap " + gap);
            printArray(array);
        }
       
    }
    

    // Método para imprimir el arreglo
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
