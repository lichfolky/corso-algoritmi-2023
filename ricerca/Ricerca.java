package ricerca;

public class Ricerca<T extends Comparable<T>> {

    // O(n) Omega(1)
    public boolean ricercaLineare(T[] array, T elementoDaTrovare) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementoDaTrovare) { // 1
                return true;
            }
        }
        return false;
    }

    // O(logn) Omega(1)
    public boolean ricercaBinaria(T[] array, T elementoDaTrovare) {
        int primo = 0;
        int ultimo = array.length - 1;

        int centro = 0;

        while (primo != ultimo) {
            centro = (primo + ultimo) / 2;
            System.out.println("[" + primo + ", " + centro + ", " + ultimo + "]");

            if (array[centro] == elementoDaTrovare) {
                return true;
            } else {
                if (array[centro].compareTo(elementoDaTrovare) > 0) {
                    primo = centro + 1;
                } else {
                    ultimo = centro - 1;
                }
            }
        }
        System.out.println("singolo elemento: " + array[primo] + " alla posizione " + primo);

        return array[primo] == elementoDaTrovare;
    }

    // O(n) Omega(n) Theta(n)
    public int ricercaMassimo(int[] array) {
        int massimo = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > massimo) {
                massimo = array[i];
            }
        }

        return massimo;
    }

    /*
     * public int ricercaLineareProdotti(Prodotto[] array, String nome) {
     * for (int i = 0; i < array.length; i++) {
     * if (array[i].nome.equals(nome)) {
     * return i;
     * }
     * }
     * return -1;
     * }
     */

    public boolean ricercaBinariaRicorsiva(T[] array, T elementoDaTrovare) {
        return ricercaBinariaStepRicorsivo(array, 0, array.length - 1, elementoDaTrovare);
    }

    private boolean ricercaBinariaStepRicorsivo(T[] array, int inizio, int fine, T elementoDaTrovare) {
        if (inizio == fine) {
            return array[inizio] == elementoDaTrovare;
        }

        int centro = (inizio + fine) / 2;

        if (array[centro] == elementoDaTrovare) {
            return true;
        } else {
            if (array[centro].compareTo(elementoDaTrovare) < 0) {
                return ricercaBinariaStepRicorsivo(array, centro + 1, fine, elementoDaTrovare);
            } else {
                return ricercaBinariaStepRicorsivo(array, inizio, centro - 1, elementoDaTrovare);
            }
        }
    }

}