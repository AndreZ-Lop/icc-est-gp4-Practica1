package metodo;
public class ShellSort {
    public void metodoShellSort(boolean asc, int []numeros){
        int [] numeros1 = numeros;
        if(asc){
            int comparaciones = 0;
            int cambios = 0;
            int tamanio = numeros1.length;
            int iteraciones = 0;

            System.out.println("==== MÉTODO SHELL SORT ====");
            System.out.println("\nArreglo original:");
            mostrarArreglo(numeros1);
            System.out.println();

            // el gap comienza en n/2 y se reduce a la mitad en cada iteración
            for (int gap = tamanio / 2; gap > 0; gap /= 2) {
                System.out.println("--- GAP = " + gap + " ---");
                
                for (int i = gap; i < tamanio; i++) {
                    int clave = numeros1[i];
                    int j = i;

                    System.out.printf("I%-2d  ", i);
                    mostrarArreglo(numeros1);

                    while (j >= gap) {
                        comparaciones++;
                        int a = j - gap;
                        int b = j;

                        int ancho = numeros1.length * 5;
                        StringBuilder margen = new StringBuilder();
                        for (int k = 0; k < ancho; k++) margen.append(" ");

                        System.out.printf("      %s a=%-1d  b=%-1d  [a]=%-4d [b]=%-4d  ", 
                        margen.toString(), a, b, numeros1[a], clave);

                        // --- AQUÍ SE FORMAN LAS 2 ESCALERAS ---
                        if (numeros1[a] > clave) {
                            System.out.println("cambio=si");
                            
                            System.out.print("      "); 
                            for (int k = 0; k < tamanio; k++) {
                                if (k == b) System.out.printf("%-5d", numeros1[a]); 
                                else System.out.printf("%-5s", "");
                            }
                            
                            System.out.print("\n      ");
                            for (int k = 0; k < tamanio; k++) {
                                if (k == a) System.out.printf("%-5d", clave);
                                else System.out.printf("%-5s", "");
                            }
                            System.out.println();

                            numeros1[b] = numeros1[a];
                            cambios++;
                            j -= gap;
                        } else {
                            System.out.println("cambio=no");
                            break;
                        }
                    }
                    numeros1[j] = clave;
                    
                    System.out.print("      ");
                    for (int k = 0; k < tamanio; k++) {
                        if (k == j) System.out.printf("%-5d", clave);
                        else System.out.printf("%-5s", "");
                    }
                    System.out.println("\n");
                    iteraciones++;
                }
            }
             // AQUI SE MOSTRARA TODAS LAS COMPARACIONES,ITERACIONES Y CAMBIOS HECHA
            System.out.print("end   ");
            mostrarArreglo(numeros1);
            System.out.println("\nCOMPARACIONES = " + comparaciones);
            System.out.println("ITERACIONES   = " + iteraciones);
            System.out.println("CAMBIOS       = " + cambios);
        }else{
            int comparaciones = 0;
            int cambios = 0;
            int tamanio = numeros1.length;
            int iteraciones = 0;

            System.out.println("==== MÉTODO SHELL SORT ====");
            System.out.println("\nArreglo original:");
            mostrarArreglo(numeros1);
            System.out.println();

            // el gap comienza en n/2 y se reduce a la mitad en cada iteración
            for (int gap = tamanio / 2; gap > 0; gap /= 2) {
                System.out.println("--- GAP = " + gap + " ---");
                
                for (int i = gap; i < tamanio; i++) {
                    int clave = numeros1[i];
                    int j = i;

                    System.out.printf("I%-2d  ", i);
                    mostrarArreglo(numeros1);

                    while (j >= gap) {
                        comparaciones++;
                        int a = j - gap;
                        int b = j;

                        int ancho = numeros1.length * 5;
                        StringBuilder margen = new StringBuilder();
                        for (int k = 0; k < ancho; k++) margen.append(" ");

                        System.out.printf("      %s a=%-1d  b=%-1d  [a]=%-4d [b]=%-4d  ", 
                        margen.toString(), a, b, numeros1[a], clave);

                        // --- AQUÍ SE FORMAN LAS 2 ESCALERAS ---
                        if (numeros1[a] < clave) {
                            System.out.println("cambio=si");
                            
                            System.out.print("      "); 
                            for (int k = 0; k < tamanio; k++) {
                                if (k == b) System.out.printf("%-5d", numeros1[a]); 
                                else System.out.printf("%-5s", "");
                            }
                            
                            System.out.print("\n      ");
                            for (int k = 0; k < tamanio; k++) {
                                if (k == a) System.out.printf("%-5d", clave);
                                else System.out.printf("%-5s", "");
                            }
                            System.out.println();

                            numeros1[b] = numeros1[a];
                            cambios++;
                            j -= gap;
                        } else {
                            System.out.println("cambio=no");
                            break;
                        }
                    }
                    numeros1[j] = clave;
                    
                    System.out.print("      ");
                    for (int k = 0; k < tamanio; k++) {
                        if (k == j) System.out.printf("%-5d", clave);
                        else System.out.printf("%-5s", "");
                    }
                    System.out.println("\n");
                    iteraciones++;
                }
            }
             // AQUI SE MOSTRARA TODAS LAS COMPARACIONES,ITERACIONES Y CAMBIOS HECHA
            System.out.print("end   ");
            mostrarArreglo(numeros1);
            System.out.println("\nCOMPARACIONES = " + comparaciones);
            System.out.println("ITERACIONES   = " + iteraciones);
            System.out.println("CAMBIOS       = " + cambios);
        }
    }

    public static void mostrarArreglo(int[] numeros){
        int [] numeros1 = numeros;
        for (int recorrer : numeros1){
            System.out.printf("%-5d", recorrer);
        }
        System.out.println();
    }
}
