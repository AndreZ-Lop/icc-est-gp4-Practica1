public class ShellSort {
    public void shellSort(int []numeros){
        int n = numeros.length;
        for (int gap = n/2;gap>0;gap/=2){
            for (int i = gap;i<n;i++){
                int j=i;
                int clave = numeros[j];
                while(j>=gap && numeros[j-gap]>clave){
                    numeros[j] = numeros[j-gap];
                    j-=gap; 
                }
                numeros[j]=clave;
            }
        }

    }
}
