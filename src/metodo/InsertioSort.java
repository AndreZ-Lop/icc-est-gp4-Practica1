public class InsertioSort {

    public void insertionSort(int []numeros){
        for(int i = 1;i<numeros.length;i++){
            int j=i-1; //numero que se va a insertar
            int clave=numeros[i]; // guardamos el valor que queremo ubicar correctamente

            // Comparamos la "clave" con los elementos a su izquierda.
            // Si el elemento de la izquierda es mayor, lo movemos a la derecha.

            while (j>=0 && numeros[j]>clave){ 
                numeros[j+1]=numeros[j];
                j--;
            }
            numeros[j+1]=clave;
        }
    }

}
