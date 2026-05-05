package metodo;
import java.util.Arrays;
public class ShellSort {
    public void metodoShellSort(boolean asc, int []numeros){
        int [] numeros1 = numeros.clone();
        if(asc){
            int comparaciones=0;
            int cambios=0;
            int iteraciones=0;
            int n=numeros1.length;

            System.out.println("==== METODO SHELLSORT ====");
            System.out.println();
            System.out.print("Arreglo original: ");
            System.out.println(Arrays.toString(numeros1));
            System.out.println();

            for (int gap=n/2;gap>0;gap/=2){
                for (int i=gap;i<numeros1.length;i++){
                    int clave=numeros1[i];
                    int j=i;
                    iteraciones++;
                    int anchoColumna = 6;
                    System.out.print("I"+iteraciones+"  ");
                    for (int k=0;k<numeros1.length; k++){
                        String num=""+numeros1[k];
                        System.out.print(num);
                        for (int s=0;s<anchoColumna-num.length();s++){
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                    while (j>=gap){
                        comparaciones++;
                        int a=j-gap;
                        int b=j;
                        if (numeros1[a]>clave) {
                            System.out.println();
                            System.out.print("     ");
                            for (int k=0;k<numeros1.length;k++){
                                if (k==a){
                                    String num=""+clave;
                                    System.out.print(num);
                                    for (int s=0;s<anchoColumna-num.length();s++){
                                        System.out.print(" ");
                                    }
                                }else if (k==b){
                                    String num =""+numeros1[a];
                                    System.out.print(num);
                                    for (int s=0; s<anchoColumna-num.length();s++){
                                        System.out.print(" ");
                                    }
                                }else{
                                    for (int s=0; s<anchoColumna;s++){
                                        System.out.print(" ");
                                    }
                                }
                            }
                            System.out.print("   gap="+gap+"  a="+a+"  b="+b+"  [a]="+ numeros1[a]+"  [b]="+clave+"  cambio=si");
                            System.out.println();
                            numeros1[j]=numeros1[j-gap];
                            cambios++;
                            j-=gap;
                        } else {
                            System.out.print("     ");
                            for (int s=0;s<anchoColumna*numeros1.length;s++){
                                System.out.print(" ");
                            } 
                            System.out.print("   gap=" +gap+"  a="+a+"  b="+b+"  [a]="+numeros1[a]+"  [b]="+clave+"  cambio=no");
                            System.out.println();
                            break;
                        }
                    }
                    numeros1[j]=clave;
                    System.out.println();
                }
            }

            System.out.println();
            System.out.println("======================================================");
            System.out.println();
            System.out.print("end:  ");
            for (int k=0;k<numeros1.length;k++) {
                String num =""+numeros1[k];
                System.out.print(num);
                for (int s=0;s<6-num.length(); s++){
                    System.out.print(" ");
                } 
            }
            System.out.println();
            System.out.println();
            System.out.println("COMPARACIONES = "+comparaciones);
            System.out.println("ITERACIONES   = "+iteraciones);
            System.out.println("CAMBIOS       = "+cambios);
            System.out.println();
        }else{
            int comparaciones=0;
            int cambios=0;
            int iteraciones=0;
            int n=numeros1.length;

            System.out.println("==== METODO SHELLSORT ====");
            System.out.println();
            System.out.print("Arreglo original: ");
            System.out.println(Arrays.toString(numeros1));
            System.out.println();

            for (int gap=n/2;gap>0;gap/=2){
                for (int i=gap;i<numeros1.length;i++){
                    int clave=numeros1[i];
                    int j=i;
                    iteraciones++;
                    int anchoColumna = 6;
                    System.out.print("I"+iteraciones+"  ");
                    for (int k=0;k<numeros1.length; k++){
                        String num=""+numeros1[k];
                        System.out.print(num);
                        for (int s=0;s<anchoColumna-num.length();s++){
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                    while (j>=gap){
                        comparaciones++;
                        int a=j-gap;
                        int b=j;
                        if (numeros1[a]<clave) {
                            System.out.println();
                            System.out.print("     ");
                            for (int k=0;k<numeros1.length;k++){
                                if (k==a){
                                    String num=""+clave;
                                    System.out.print(num);
                                    for (int s=0;s<anchoColumna-num.length();s++){
                                        System.out.print(" ");
                                    }
                                }else if (k==b){
                                    String num =""+numeros1[a];
                                    System.out.print(num);
                                    for (int s=0; s<anchoColumna-num.length();s++){
                                        System.out.print(" ");
                                    }
                                }else{
                                    for (int s=0; s<anchoColumna;s++){
                                        System.out.print(" ");
                                    }
                                }
                            }
                            System.out.print("   gap="+gap+"  a="+a+"  b="+b+"  [a]="+ numeros1[a]+"  [b]="+clave+"  cambio=si");
                            System.out.println();
                            numeros1[j]=numeros1[j-gap];
                            cambios++;
                            j-=gap;
                        } else {
                            System.out.print("     ");
                            for (int s=0;s<anchoColumna*numeros1.length;s++){
                                System.out.print(" ");
                            } 
                            System.out.print("   gap=" +gap+"  a="+a+"  b="+b+"  [a]="+numeros1[a]+"  [b]="+clave+"  cambio=no");
                            System.out.println();
                            break;
                        }
                    }
                    numeros1[j]=clave;
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println("======================================================");
            System.out.println();
            System.out.print("end:  ");
            for (int k=0;k<numeros1.length;k++) {
                String num =""+numeros1[k];
                System.out.print(num);
                for (int s=0;s<6-num.length(); s++){
                    System.out.print(" ");
                } 
            }
            System.out.println();
            System.out.println();
            System.out.println("COMPARACIONES = "+comparaciones);
            System.out.println("ITERACIONES   = "+iteraciones);
            System.out.println("CAMBIOS       = "+cambios);
            System.out.println();
        }
    }
    
}