package ordinamento;

public class Sort {
    /*
     *     Per ogni elemento dell'array i
     *        trova il minimo nei successivi i + 1 elementi 
     *        scambia il minimo trovato con l'elemento i
     *     Questo algoritmo ha complessità O(x^2)
     */
    public static void selectionSort(String[] array){
        for (int i = 0; i < array.length; i++) {
            int minimo = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[minimo].compareTo(array[j]) > 0){
                    minimo = j;
                }
            }

            String aux = array[i];
            array[i] = array[minimo];
            array[minimo] = aux;
        }
    }
}
