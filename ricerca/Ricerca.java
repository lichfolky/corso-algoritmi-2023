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
            if(array[i].nome.equals(nome)){
                return i;
            }
        }
        return -1;
    }

}