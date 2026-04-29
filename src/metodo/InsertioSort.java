package metodo;
public class InsertioSort {
    public void ordenarYMostrar(int[] numeros,boolean asc) {
        if(asc){
            int comparaciones = 0;
            int cambios = 0;


            System.out.println("==== METODO INSERCIÓN ====");
            System.out.println();
            System.out.print("Arreglo original: ");
            mostrarArreglo(numeros);
            System.out.println();

            for (int i = 1; i < numeros.length; i++) {
                int clave = numeros[i];
                int j = i - 1;

                System.out.print("I:" + i + "  ");
                mostrarArreglo(numeros);
                while (j >= 0) {
                    comparaciones++;
                    int a = j;
                    int b = j + 1;
                    System.out.println();
                    System.out.print("      ");
                    System.out.print("a=" + a + "  b=" + b + "  [a]=" + numeros[a] + "  [b]=" + clave);

                    if (numeros[j] > clave) {
                        System.out.println("  cambio=si");
                        numeros[j + 1] = numeros[j];
                        cambios++;
                        j--;
                        
                        System.out.println();
                        System.out.print("      ");
                        mostrarArreglo(numeros);
                    } else {
                        System.out.println("  cambio=no");
                        break;
                    }
                }
                numeros[j + 1] = clave;
                System.out.println();
                System.out.println("      " + "Arreglo tras reingresar el dato reservado");
                System.out.println();
                System.out.print("      ");
                mostrarArreglo(numeros);
                System.out.println();
            }
            System.out.println();
            System.out.println("======================================================");
            System.out.println();
            System.out.print("end:  ");
            mostrarArreglo(numeros);

            System.out.println();
            
            System.out.println("COMPARACIONES = " + comparaciones);
            System.out.println("ITERACIONES = " + (numeros.length - 1));
            System.out.println("CAMBIOS = " + cambios);
            System.out.println();
        }else{
            int comparaciones = 0;
            int cambios = 0;

            System.out.println("==== METODO INSERCIÓN ====");
            System.out.print("Arreglo original: ");
            mostrarArreglo(numeros);
            System.out.println();

            for (int i = 1; i < numeros.length; i++) {
                int clave = numeros[i];
                int j = i - 1;

                System.out.print("I:" + i + "  ");
                mostrarArreglo(numeros);
                while (j >= 0) {
                    comparaciones++;
                    int a = j;
                    int b = j + 1;
                    System.out.println();
                    System.out.print("      ");
                    System.out.print("a=" + a + "  b=" + b + "  [a]=" + numeros[a] + "  [b]=" + clave);

                    if (numeros[j] < clave) {
                        System.out.println("  cambio=si");
                        numeros[j + 1] = numeros[j];
                        cambios++;
                        j--;
                        
                        System.out.println();
                        System.out.print("      ");
                        mostrarArreglo(numeros);
                    } else {
                        System.out.println("  cambio=no");
                        break;
                    }
                }
                numeros[j + 1] = clave;
                System.out.println();
                System.out.println("      " + "Arreglo tras reingresar el dato reservado");
                System.out.println();
                System.out.print("      ");
                mostrarArreglo(numeros);
                System.out.println();
            }
            System.out.println();
            System.out.println("======================================================");
            System.out.println();
            System.out.print("end:  ");
            mostrarArreglo(numeros);
            
            System.out.println();

            System.out.println("COMPARACIONES = " + comparaciones);
            System.out.println("ITERACIONES = " + (numeros.length - 1));
            System.out.println("CAMBIOS = " + cambios);
            System.out.println();
        }

    }

    public static void mostrarArreglo(int[] numeros) {
            for (int n : numeros) {
                System.out.printf("%-4d", n); // "printF" o print formatted es un tipo de print que nos permite alienar columanas en este caso pero tambien puede formatear tipos de datos
            }
            System.out.println();
        }

}

