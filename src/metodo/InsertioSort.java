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
                int clave = numeros1[i];
                int j = i - 1;

                System.out.print("I:" + i + "  ");
                System.out.println(Arrays.toString(numeros1));
                while (j >= 0) {
                    comparaciones++;
                    int a = j;
                    int b = j + 1;
                    System.out.print(" ");
                    if (numeros1[j] > clave) {
                        System.out.println();
                        System.out.print("   ");
                        boolean aux=false;
                        for(int k = 0;k<numeros1.length;k++){
                            if(!aux && k==j){
                                System.out.print("  "+numeros1[b]+ " " + numeros1[a]);
                                aux=true;

                            }
                            System.out.print("    ");
                        }
                        
                        numeros1[j + 1] = numeros1[j];
                        cambios++;
                        j--;
                        
                        System.out.print("     ");
                        System.out.print("a=" + a + "  b=" + b + "  [a]=" + numeros1[a] + "  [b]=" + clave);
                        System.out.println("  cambio=si");
                    } else {
                        break;
                    }
                }
                numeros1[j + 1] = clave;
                System.out.println();
                System.out.println(Arrays.toString(numeros1));
                System.out.println();
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
                int clave = numeros1[i];
                int j = i - 1;

                System.out.print("I:" + i + "  ");
                System.out.println(Arrays.toString(numeros1));
                while (j >= 0) {
                    comparaciones++;
                    int a = j;
                    int b = j + 1;
                    System.out.print(" ");
                    if (numeros1[j] < clave) {
                        System.out.println();
                        System.out.print("   ");
                        boolean aux=false;
                        for(int k = 0;k<numeros1.length;k++){
                            if(!aux && k==j){
                                System.out.print("  "+numeros1[b]+ " " + numeros1[a]);
                                aux=true;

                            }
                            System.out.print("    ");
                        }
                        
                        numeros1[j + 1] = numeros1[j];
                        cambios++;
                        j--;
                        
                        System.out.print("     ");
                        System.out.print("a=" + a + "  b=" + b + "  [a]=" + numeros1[a] + "  [b]=" + clave);
                        System.out.println("  cambio=si");
                    } else {
                        break;
                    }
                }
                numeros1[j + 1] = clave;
                System.out.println();
                System.out.println(Arrays.toString(numeros1));
                System.out.println();
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
