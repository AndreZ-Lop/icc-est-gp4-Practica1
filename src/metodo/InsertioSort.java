package metodo;
public class InsertioSort {

    public int[] insertionSort(int []numeros,boolean asc){
        int []copia = numeros;
        if(asc){
            for(int i = 1;i<copia.length;i++){
                int j=i-1; 
                int clave=copia[i]; 
                while (j>=0 && copia[j]>clave){ 
                    copia[j+1]=copia[j];
                    j--;
                }
                copia[j+1]=clave;
            }
            return copia; 
        }else{
            for(int i = 1;i<copia.length;i++){
                int j=i-1; 
                int clave=copia[i]; 
                while (j>=0 && copia[j]<clave){ 
                    copia[j+1]=copia[j];
                    j--;
                }
                copia[j+1]=clave;
            }
            return copia;
        }
    }

    public void printInsertionSort(int[] copia){
        int cont = 0;
        for (int printCopia:copia){
            if (cont==0){
                System.out.print("[ "+printCopia + ", ");
            }else if (cont<copia.length-1){
                System.out.print(printCopia + ", ");
            }else{
                System.out.print(printCopia + " ]");
            }
            cont++;
        }
        System.out.println();
    }

}
