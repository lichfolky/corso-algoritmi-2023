package ordinamento;

public class Sort {
    /*
     * Per ogni elemento dell'array i
     * trova il minimo nei successivi i + 1 elementi
     * scambia il minimo trovato con l'elemento i
     * Questo algoritmo ha complessità O(x^2)
     */
    public static void selectionSort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            int minimo = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minimo].compareTo(array[j]) > 0) {
                    minimo = j;
                }
            }

            String aux = array[i];
            array[i] = array[minimo];
            array[minimo] = aux;
        }
    }

    public static void mergeSort(String[] array, int inizio, int fine) {
        if (inizio < fine) {
            int centro = (inizio + fine) / 2;
            mergeSort(array, inizio, centro);
            mergeSort(array, centro + 1, fine);
            merge(array, inizio, centro, fine);
        }
    }

    // fonde due sezioni dell'array ordinate, in un'unica sezione ordinata
    public static void merge(String[] array, int inizio, int centro, int fine) {
        // array di lavoro
        String[] aux = new String[fine - inizio + 1];

        // contatore inizio prima parte
        int i = inizio;

        // contatore inizio seconda parte
        int j = centro + 1;

        // contatore elementi ordinati
        int k = 0;

        // per tutti gli elementi della sottosezione
        while (i <= centro && j <= fine) {
            // se elemento i della 1a parte è minore elemento j della 2a parte
            if (array[i].compareTo(array[j]) <= 0) {
                // salvo in aux l'elemento della 1a parte
                aux[k] = array[i];
                i++;
            } else {
                // salvo in aux l'elemento della 2a parte
                aux[k] = array[j];
                j++;
            }
            k++;
        }

        while (i <= centro) {
            aux[k] = array[i];
            i++;
            k++;
        }

        while (j <= fine) {
            aux[k] = array[j];
            j++;
            k++;
        }

        for (int p = inizio; p <= fine; p++) {
            array[p] = aux[p - inizio];
        }
    }
}
