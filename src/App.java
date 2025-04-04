
import controller.Shell;

public class App {
    public static void main(String[] args) throws Exception {
        Shell sh = new Shell();
        int[] array = {-10,0,4,7,2,1,9,6,5,};
        System.out.println("Dennis Cajisaca");
        System.out.println("Ordenado Ascendente");
        sh.shellSort(array, true);
        System.out.println("\n Ordenado Descendente");
        sh.shellSort(array, false);

       
        
    }
}
