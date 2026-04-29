import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        int []numeros = {2,0,-15,10,20,-3,-5,7};
        System.out.println(Arrays.toString(numeros));
        InsertioSort apliacion = new InsertioSort();

        apliacion.insertionSort(numeros);
        
        System.out.println(Arrays.toString(numeros));

        int [] numeros1 = {2,0,-15,10,20,-3,-5,7};
        System.out.println(Arrays.toString(numeros1));
        ShellSort aplicacionShell = new ShellSort();

        aplicacionShell.shellSort(numeros1);
        
        System.out.println(Arrays.toString(numeros1));

    }
}
