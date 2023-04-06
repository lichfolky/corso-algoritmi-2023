package ordinamento;

import java.util.ArrayList;
import java.util.Random;

import macchinetta.Prodotto;

public class Sort<T extends Comparable<T>> {
    /*
     * Per ogni elemento dell'array i
     * trova il minimo nei successivi i + 1 elementi
     * scambia il minimo trovato con l'elemento i
     * Questo algoritmo ha complessità O(x^2)
     */
    public void selectionSort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            int minimo = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minimo].compareTo(array[j]) > 0) {
                    minimo = j;
                }
            }

            T aux = array[i];
            array[i] = array[minimo];
            array[minimo] = aux;
        }
    }

    public void mergeSort(T[] array, int inizio, int fine) {
        if (inizio < fine) {
            int centro = (inizio + fine) / 2;
            mergeSort(array, inizio, centro);
            mergeSort(array, centro + 1, fine);
            merge(array, inizio, centro, fine);
        }
    }

    // fonde due sezioni dell'array ordinate, in un'unica sezione ordinata
    public void merge(T[] array, int inizio, int centro, int fine) {
        // array di lavoro
        ArrayList<T> aux = new ArrayList<T>(fine - inizio + 1);

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

                aux.set(k, array[i]);
                i++;
            } else {
                // salvo in aux l'elemento della 2a parte
                aux.set(k, array[j]);
                j++;
            }
            k++;
        }

        while (i <= centro) {
            aux.set(k, array[i]);
            i++;
            k++;
        }

        while (j <= fine) {
            aux.set(k, array[j]);
            j++;
            k++;
        }

        for (int p = inizio; p <= fine; p++) {
            array[p] = aux.get(p - inizio);
        }

    }

    /*
     * ripeti fino a quando sono stati effettuati degli scambi
     * per ogni coppia di elementi successivi (array[0], array[1]), (array[1],
     * array[2])
     * se il primo è maggiore del secondo scambiali
     */
    public void bubbleSort(T[] array) {
        boolean scambi = true;
        while (scambi) {
            scambi = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    scambia(array, i, i + 1);
                    scambi = true;
                }
            }
        }
    }

    private void scambia(T[] array, int i, int j) {
        T aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    /*
     * public void bubbleSort(Prodotto[] array) {
     * boolean scambi = true;
     * while (scambi) {
     * scambi = false;
     * for (int i = 0; i < array.length - 1; i++) {
     * if (array[i].compareTo(array[i + 1]) > 0) {
     * scambia(array, i, i + 1);
     * scambi = true;
     * }
     * }
     * }
     * }
     */

    /**
     * per ogni elemento i (escluso il primo)
     * > trova il più piccolo elemento maggiore dell'elemento i
     * > shifta i rimanenti fino a i di un posto a destra
     * > inserisci l'elemento i
     * 
     * @param array
     */
    public void insertionSort(T[] array) {
        // i primi i elementi sono ordinati
        for (int i = 1; i < array.length; i++) {
            T aux = array[i];

            // trova l'elemento array[k] >= array[i] (cosa cambia l'=?)
            // System.out.print(array[i] + ": ");

            int k = 0;
            for (; k < i; k++) {
                if (array[k].compareTo(array[i]) > 0) {
                    // System.out.println("ho trovate l'elemento k " + array[k] + " > " + array[i]);
                    break;
                }
            }

            // System.out.println(Arrays.toT(array));
            // System.out.println("shifto " + k + ": ");

            // shifto tutto gli elementi ordinati rimanenti a dx
            for (int j = i - 1; j >= k; j--) {
                array[j + 1] = array[j];
            }
            // System.out.println(Arrays.toT(array));

            array[k] = aux;
        }
    }

    public void insertionSort(Prodotto[] array) {
        // i primi i elementi sono ordinati
        for (int i = 1; i < array.length; i++) {
            Prodotto aux = array[i];
            int k = 0;
            for (; k < i; k++) {
                if (array[k].compareTo(array[i]) > 0) {
                    // System.out.println("ho trovate l'elemento k " + array[k] + " > " + array[i]);
                    break;
                }
            }
            for (int j = i - 1; j >= k; j--) {
                array[j + 1] = array[j];
            }
            array[k] = aux;
        }
    }

    public void miracleSort(T[] array) {

        throw new UnsupportedOperationException();
        /*
         * boolean miracolo = false;
         * do {
         * // Aspetta un miracolo
         * } while (!miracolo);
         */
    }

    public void bozoSort(T[] array) {
        Random rng = new Random();
        while (!isOrdinato(array)) {
            int primo = rng.nextInt(array.length);
            int secondo = rng.nextInt(array.length);
            scambia(array, primo, secondo);
        }
    }

    public boolean isOrdinato(T[] array) {
        boolean ordinato = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                ordinato = false;
            }
        }
        return ordinato;
    }

    public void quickSort(T[] array) {
        quickSortStep(array, 0, array.length - 1);
    }

    private void quickSortStep(T[] array, int minimo, int massimo) {
        if (minimo >= massimo || minimo < 0) {
            return;
        }
        int pivotIndex = partizione(array, minimo, massimo);
        quickSortStep(array, minimo, pivotIndex - 1);
        quickSortStep(array, pivotIndex + 1, massimo);
        // non c'è bisogno di fare merge
    }

    private int partizione(T[] array, int minimo, int massimo) {
        T pivot = array[minimo];
        int inf = minimo;
        int sup = massimo + 1;

        while (true) {
            // a[minimo ... inf-1] <= pivot
            // a[sup+1 ... massimo] > pivot
            do {
                inf++;
            } while (array[inf].compareTo(pivot) <= 0);
            do {
                sup--;
            } while (array[sup].compareTo(pivot) > 0);
            if (inf < sup) {
                scambia(array, inf, sup);
            } else {
                break;
            }
        }

        System.out.println("minimo sup" + minimo + " " + sup);
        scambia(array, minimo, sup);
        return sup;
    }

}
