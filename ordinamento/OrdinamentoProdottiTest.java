package ordinamento;

import java.util.Arrays;

import macchinetta.Prodotto;

public class OrdinamentoProdottiTest {

    public static void main(String[] args) {

        Sort<Prodotto> sorter = new Sort<Prodotto>();
        Prodotto[] prodotti = new Prodotto[11];
        prodotti[0] = new Prodotto("Panino", 5.50);
        prodotti[1] = new Prodotto("Panino Vegano", 4.00);
        prodotti[2] = new Prodotto("Patatine", 2.00);
        prodotti[3] = new Prodotto("Coca", 1.50);
        prodotti[4] = new Prodotto("Acqua", 1.00);
        prodotti[5] = new Prodotto("Aranciata", 1.50);
        prodotti[6] = new Prodotto("Caramelle", 0.50);
        prodotti[7] = new Prodotto("Acqua", 0.20);
        prodotti[8] = new Prodotto("Acqua", 2.00);
        prodotti[9] = new Prodotto("Acqua", 9.00);
        prodotti[10] = new Prodotto("Acqua", 10.00);

        sorter.bubbleSort(prodotti);
        // Sort.selectionSort(prodotti);
        // Sort.insertionSort(prodotti);
        // Sort.bubbleSort(prodotti);
        System.out.println("Prodotti:\n\n");
        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto.nome + " " + prodotto.prezzo);
        }

    }

}
