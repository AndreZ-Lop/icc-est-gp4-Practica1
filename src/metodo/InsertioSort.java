package metodo;

import java.util.Arrays;

public class InsertioSort {
    public void metodoInsertionSort(int[] numeros,boolean asc) {
        int [] numeros1 = numeros.clone();
        if(asc){
            int comparaciones = 0;
            int cambios = 0;
            int iteraciones = 0;
            System.out.println("==== METODO INSERCIÓN ====");
            System.out.println();
            System.out.print("Arreglo original: ");
            System.out.println(Arrays.toString(numeros1));
            System.out.println();

            for (int i = 1; i < numeros1.length; i++) {
                int suma=0;
                int clave = numeros1[i];
                int j = i - 1;

                System.out.print("I:" + i + "  ");
                System.out.println(Arrays.toString(numeros1));
                while (j >= 0) {
                    comparaciones++;
                    int a = j;
                    int b = j + 1;

                    if (numeros1[j] > clave) {
                        numeros1[j + 1] = numeros1[j];
                        cambios++;
                        j--;
                        
                        System.out.println();
                        System.out.print("     ");
                        System.out.print(Arrays.toString(numeros1));
                        System.out.print("     ");
                        System.out.print("a=" + a + "  b=" + b + "  [a]=" + numeros1[a] + "  [b]=" + clave);
                        System.out.println("  cambio=si");
                        suma++;
                    } else {
                        System.out.println();
                        System.out.print("      ");
                        System.out.print(Arrays.toString(numeros1));
                        System.out.print("    cambio=no");
                        System.out.println();

                        break;
                    }
                }
                numeros1[j + 1] = clave;
                if(suma==0){
                     System.out.println();
                }else{
                    System.out.println();
                    System.out.println("     " + "Arreglo tras reingresar el dato reservado");
                    System.out.println();
                    System.out.print("     ");
                    System.out.println(Arrays.toString(numeros1));
                    System.out.println();
                }
                iteraciones++;
            }
            System.out.println();
            System.out.println("======================================================");
            System.out.println();
            System.out.print("end:  ");
           System.out.println(Arrays.toString(numeros1));

            System.out.println();
            
            System.out.println("COMPARACIONES = " + comparaciones);
            System.out.println("ITERACIONES = " + iteraciones);
            System.out.println("CAMBIOS = " + cambios);
            System.out.println();
        }else{
            int comparaciones = 0;
            int cambios = 0;
            int iteraciones = 0;
            System.out.println("==== METODO INSERCIÓN ====");
            System.out.println();
            System.out.print("Arreglo original: ");
            System.out.println(Arrays.toString(numeros1));
            System.out.println();

            for (int i = 1; i < numeros1.length; i++) {
                int suma=0;
                int clave = numeros1[i];
                int j = i - 1;

                System.out.print("I:" + i + "  ");
                System.out.println(Arrays.toString(numeros1));
                while (j >= 0) {
                    comparaciones++;
                    int a = j;
                    int b = j + 1;
                    if (numeros1[j] < clave) {
                        numeros1[j + 1] = numeros1[j];
                        cambios++;
                        j--;
                        
                        System.out.println();
                        System.out.print("     ");
                        System.out.print(Arrays.toString(numeros1));
                        System.out.print("     ");
                        System.out.print("a=" + a + "  b=" + b + "  [a]=" + numeros1[a] + "  [b]=" + clave);
                        System.out.println("  cambio=si");
                        suma++;
                    } else {
                        System.out.println();
                        System.out.print("    ");
                        System.out.print(Arrays.toString(numeros1));
                        System.out.print("    cambio=no");
                        System.out.println();
                        break;
                    }
                }
                numeros1[j + 1] = clave;
                if(suma==0){
                     System.out.println();
                }else{
                    System.out.println();
                    System.out.println("     " + "Arreglo tras reingresar el dato reservado");
                    System.out.println();
                    System.out.print("     ");
                    System.out.println(Arrays.toString(numeros1));
                    System.out.println();
                }
                iteraciones++;
            }
            System.out.println();
            System.out.println("======================================================");
            System.out.println();
            System.out.print("end:  ");
            System.out.println(Arrays.toString(numeros1));

            System.out.println();
            
            System.out.println("COMPARACIONES = " + comparaciones);
            System.out.println("ITERACIONES = " + iteraciones);
            System.out.println("CAMBIOS = " + cambios);
            System.out.println();
        }
    }

}
