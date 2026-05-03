package metodo;
public class InsertioSort {
    public void metodoInsertionSort(int[] numeros,boolean asc) {
        int [] numeros1 = numeros; 
        if(asc){
            int comparaciones = 0;
            int cambios = 0;
            int iteraciones = 0;

            System.out.println("==== METODO INSERCIÓN ====");
            System.out.println("\nArreglo original:");
            mostrarArreglo(numeros1);
            System.out.println();

            for (int i = 1; i < numeros1.length; i++) {
                int clave = numeros1[i];
                int j = i - 1;

                System.out.printf("I%-2d  ", i);
                mostrarArreglo(numeros1);

                while (j >= 0) {
                    comparaciones++;
                    int ancho = numeros1.length * 5;
                    StringBuilder margen = new StringBuilder();
                    for (int k = 0; k < ancho; k++) margen.append(" ");

                    System.out.printf("      %s a=%-1d  b=%-1d  [a]=%-4d [b]=%-4d  ", 
                                    margen.toString(), j, j + 1, numeros1[j], clave);

                    if (numeros1[j] > clave) {
                        System.out.println("cambio=si");
                        
                        // --- AQUÍ SE FORMAN LAS 2 ESCALERAS ---
                        System.out.print("      "); 
                        for (int k = 0; k < numeros1.length; k++) {
                            if (k == j) {
                                System.out.printf("%-5s", "");
                            } else if (k == j + 1) {
                                System.out.printf("%-5d", numeros1[j]); 
                            } else {
                                System.out.printf("%-5s", "");
                            }
                        }
                        System.out.print("\n      ");
                        for (int k = 0; k < numeros1.length; k++) {
                            if (k == j) System.out.printf("%-5d", clave);
                            else System.out.printf("%-5s", "");
                        }
                        System.out.println();

                        numeros1[j + 1] = numeros1[j];
                        cambios++;
                        j--;
                    } else {
                        System.out.println("cambio=no");
                        break;
                    }
                }
                numeros1[j + 1] = clave;

                System.out.print("      ");
                for (int k = 0; k < numeros1.length; k++) {
                    if (k == j + 1) System.out.printf("%-5d", clave);
                    else System.out.printf("%-5s", "");
                }
                System.out.println("\n");
                iteraciones++;
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
            int iteraciones = 0;

            System.out.println("==== METODO INSERCIÓN ====");
            System.out.println("\nArreglo original:");
            mostrarArreglo(numeros1);
            System.out.println();

            for (int i = 1; i < numeros1.length; i++) {
                int clave = numeros1[i];
                int j = i - 1;

                System.out.printf("I%-2d  ", i);
                mostrarArreglo(numeros1);

                while (j >= 0) {
                    comparaciones++;
                    int ancho = numeros1.length * 5;
                    StringBuilder margen = new StringBuilder();
                    for (int k = 0; k < ancho; k++) margen.append(" ");

                    System.out.printf("      %s a=%-1d  b=%-1d  [a]=%-4d [b]=%-4d  ", 
                                    margen.toString(), j, j + 1, numeros1[j], clave);

                    if (numeros1[j] < clave) {
                        System.out.println("cambio=si");
                        
                        // --- AQUÍ SE FORMAN LAS 2 ESCALERAS ---
                        System.out.print("      "); 
                        for (int k = 0; k < numeros1.length; k++) {
                            if (k == j) {
                                System.out.printf("%-5s", "");
                            } else if (k == j + 1) {
                                System.out.printf("%-5d", numeros1[j]); 
                            } else {
                                System.out.printf("%-5s", "");
                            }
                        }
                        System.out.print("\n      ");
                        for (int k = 0; k < numeros1.length; k++) {
                            if (k == j) System.out.printf("%-5d", clave);
                            else System.out.printf("%-5s", "");
                        }
                        System.out.println();

                        numeros1[j + 1] = numeros1[j];
                        cambios++;
                        j--;
                    } else {
                        System.out.println("cambio=no");
                        break;
                    }
                }
                numeros1[j + 1] = clave;

                System.out.print("      ");
                for (int k = 0; k < numeros1.length; k++) {
                    if (k == j + 1) System.out.printf("%-5d", clave);
                    else System.out.printf("%-5s", "");
                }
                System.out.println("\n");
                iteraciones++;
            }
            // AQUI SE MOSTRARA TODAS LAS COMPARACIONES,ITERACIONES Y CAMBIOS HECHA
            System.out.print("end   ");
            mostrarArreglo(numeros1);
            System.out.println("\nCOMPARACIONES = " + comparaciones);
            System.out.println("ITERACIONES   = " +  iteraciones);
            System.out.println("CAMBIOS       = " + cambios);
        }

    }

    public static void mostrarArreglo(int[] numeros) {
            int [] numeros1 = numeros;
            for (int recorrer : numeros1) {
                System.out.printf("%-5d", recorrer); // "printF" o print formatted es un tipo de print que nos permite alienar columanas en este caso pero tambien puede formatear tipos de datos
            }
            System.out.println();
        }

}
