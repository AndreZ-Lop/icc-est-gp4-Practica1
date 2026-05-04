package metodo;
import java.util.Arrays;
public class ShellSort {
    public void metodoShellSort(boolean asc, int []numeros){
        int [] numeros1 = numeros.clone();
        if(asc){
            int comparaciones = 0;
            int cambios = 0;
            int iteraciones = 0;
            int n=numeros1.length;
            System.out.println("==== METODO SHELLSORT ====");
            System.out.println();
            System.out.print("Arreglo original: ");
            System.out.println(Arrays.toString(numeros1));
            System.out.println();
            for (int gap=n/2;gap>0;gap/=2){
                for (int i = gap; i < numeros1.length; i++) {
                    iteraciones++;
                    int suma=0;
                    int clave = numeros1[i];
                    int j = i;
                    System.out.print("I:" + iteraciones + "  ");
                    System.out.println(Arrays.toString(numeros1));
                    while (j >= gap) {
                        comparaciones++;
                        int a = j;
                        int b = j - gap;

                        if (numeros1[j-gap] > clave) {
                            numeros1[j] = numeros1[j-gap];
                            cambios++;
                            j-=gap;
                            
                            System.out.println();
                            System.out.print("     ");
                            System.out.print(Arrays.toString(numeros1));
                            System.out.print("     ");
                            System.out.print("gap= "+ gap + "  a=" + a + "  b=" + b + "  [a]=" + numeros1[a] + "  [b]=" + clave);
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
                    numeros1[j] = clave;
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
                }
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
            int n=numeros1.length;
            System.out.println("==== METODO SHELLSORT ====");
            System.out.println();
            System.out.print("Arreglo original: ");
            System.out.println(Arrays.toString(numeros1));
            System.out.println();
            for (int gap=n/2;gap>0;gap/=2){
                for (int i = gap; i < numeros1.length; i++) {
                    iteraciones++;
                    int suma=0;
                    int clave = numeros1[i];
                    int j = i;
                    System.out.print("I:" + iteraciones + "  ");
                    System.out.println(Arrays.toString(numeros1));
                    while (j >= gap) {
                        comparaciones++;
                        int a = j;
                        int b = j - gap;

                        if (numeros1[j-gap] < clave) {
                            numeros1[j] = numeros1[j-gap];
                            cambios++;
                            j-=gap;
                            
                            System.out.println();
                            System.out.print("     ");
                            System.out.print(Arrays.toString(numeros1));
                            System.out.print("     ");
                            System.out.print("gap= "+ gap + "  a=" + a + "  b=" + b + "  [a]=" + numeros1[a] + "  [b]=" + clave);
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
                    numeros1[j] = clave;
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
                }
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
