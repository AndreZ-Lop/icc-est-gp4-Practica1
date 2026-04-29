package app;
import metodo.InsertioSort;
import metodo.ShellSort;
public class App {
    public static void main(String[] args) throws Exception {
        int []numeros = {12,-7,25,0,-15,33,19,-22,5,48,-3};
        boolean asc = true;
        InsertioSort aplicacionInsertion = new InsertioSort();
        System.out.println("Arreglo ascendente");
        int [] insertionAsc = aplicacionInsertion.insertionSort(numeros, asc);
        aplicacionInsertion.printInsertionSort(insertionAsc);
        System.out.println("Arreglo descendente");
        asc = false;
        int [] insertioDes = aplicacionInsertion.insertionSort(numeros, asc);
        aplicacionInsertion.printInsertionSort(insertioDes);   
    }
}