package ricerca;

import java.util.Arrays;

public class RicercaTest {
    public static void main(String[] args) {

        Ricerca<Integer> ricercatore = new Ricerca<Integer>();

        // System.out.println(7 / 2);
        Integer[] array = { 9, 6, 4, 2, 8, 3, 1 };
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Integer elementoDaTrovare = 4;

        // boolean trovato = Ricerca.ricercaBinaria(array, elementoDaTrovare);
        boolean trovato = ricercatore.ricercaBinariaRicorsiva(array, elementoDaTrovare);
        if (trovato) {
            System.out.println("Elemento " + elementoDaTrovare + " trovato");
        } else {
            System.out.println("Elemento " + elementoDaTrovare + " non trovato");
        }
    }
}
