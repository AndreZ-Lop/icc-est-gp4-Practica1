package app;
import metodo.InsertioSort;
import metodo.ShellSort;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int []numeros = {12,-7,25,0,-15,33,19,-22,5,48,-3};
        int opcion;
        int algoritmoDeseado;
        String seleccionUsuario;
        do{
            System.out.println("=== Programa de Ordenamientos ===");
            System.out.println();
            System.out.println("1 - Ejecutar ordenamientos");
            System.out.println("2 - Salir");
            opcion = lector.nextInt();
            while (opcion <= 0 && opcion>2){
                System.out.println("Error valor ingresado no valido");
                opcion = lector.nextInt();
            }
            if(opcion == 1){
                System.out.println("Que algoritmo desea ver?");
                System.out.println("1 - Insertion Sort");
                System.out.println("2 - Shell Short");
                algoritmoDeseado = lector.nextInt();
                while (algoritmoDeseado <= 0 && algoritmoDeseado>2){
                    System.out.println("Error valor ingresado no valido");
                    algoritmoDeseado = lector.nextInt();
                }
                if (algoritmoDeseado == 1){
                    System.out.println("Orden ascendente o descendente? (A/D)");
                    seleccionUsuario = lector.next();
                    boolean asc = seleccionUsuario.equalsIgnoreCase("A");
                    InsertioSort aplicacionInsertion = new InsertioSort();
                    aplicacionInsertion.metodoInsertionSort(numeros, asc);
                    
                }else{
                    System.out.println("Orden ascendente o descendente? (A/D)");
                    seleccionUsuario = lector.next();
                    boolean asc = seleccionUsuario.equalsIgnoreCase("A");
                    ShellSort aplicacionShellShort = new  ShellSort();
                    aplicacionShellShort.metodoShellSort(asc, numeros);
                }

            }
        }while(opcion!=2);
        lector.close();
        
    }
} 