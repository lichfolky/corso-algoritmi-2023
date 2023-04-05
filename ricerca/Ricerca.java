package ricerca;

import macchinetta.Prodotto;

public class Ricerca {

    // O(n) Omega(1)
    public static boolean ricercaLineare(int[] array, int elementoDaTrovare) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementoDaTrovare) { // 1
                return true;
            }
        }
        return false;
    }

    // O(logn) Omega(1)
    public static boolean ricercaBinaria(int[] array, int elementoDaTrovare) {
        int primo = 0;
        int ultimo = array.length - 1;

        int centro = 0;

        while (primo != ultimo) {
            centro = (primo + ultimo) / 2;
            System.out.println("[" + primo + ", " + centro + ", " + ultimo + "]");

            if (array[centro] == elementoDaTrovare) {
                return true;
            } else {
                if (array[centro] < elementoDaTrovare) {
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
    public static int ricercaMassimo(int[] array) {
        int massimo = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > massimo) {
                massimo = array[i];
            }
        }

        return massimo;
    }

    public static int ricercaLineareProdotti(Prodotto[] array, String nome) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].nome.equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean ricercaBinariaRicorsiva(int[] array, int elementoDaTrovare) {
        return ricercaBinariaStepRicorsivo(array, 0, array.length - 1, elementoDaTrovare);
    }

    private static boolean ricercaBinariaStepRicorsivo(int[] array, int inizio, int fine, int elementoDaTrovare) {
        if (inizio == fine) {
            return array[inizio] == elementoDaTrovare;
        }

        int centro = (inizio + fine) / 2;

        if (array[centro] == elementoDaTrovare) {
            return true;
        } else {
            if (array[centro] < elementoDaTrovare) {
                return ricercaBinariaStepRicorsivo(array, centro + 1, fine, elementoDaTrovare);
            } else {
                return ricercaBinariaStepRicorsivo(array, inizio, centro - 1, elementoDaTrovare);
            }
        }
    }

}