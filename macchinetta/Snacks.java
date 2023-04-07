package macchinetta;

import ricerca.*;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Snacks {

    public static void main(String[] args) {
        Ricerca<Prodotto> ricerca = new Ricerca<Prodotto>();

        Prodotto[] prodotti = new Prodotto[7];
        prodotti[0] = new Prodotto("Panino", 5.50);
        prodotti[1] = new Prodotto("Panino Vegano", 4.00);
        prodotti[2] = new Prodotto("Patatine", 2.00);
        prodotti[3] = new Prodotto("Coca", 1.50);
        prodotti[4] = new Prodotto("Acqua", 1.00);
        prodotti[5] = new Prodotto("Aranciata", 1.50);
        prodotti[6] = new Prodotto("Caramelle", 0.50);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto.nome + " " + df.format(prodotto.prezzo) + "€");
        }

        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);

        String inputText = "";
        int indiceProdotto = -1;
        double costoTotale = 0.0;

        do {
            System.out.print("Inserisci un prodotto: ");
            inputText = scanner.nextLine();
            if (inputText != "") {
                indiceProdotto = ricerca.ricercaLineareIndice(prodotti, new Prodotto(inputText));
                if (indiceProdotto >= 0) {
                    costoTotale += prodotti[indiceProdotto].prezzo;
                }
            }
        } while (inputText != "" && indiceProdotto >= 0);

        System.out.println(" ");
        System.out.println("Costo totale: " + costoTotale + "€");
        System.out.println("Grazie mille e buona giornata!!!");
        scanner.close();
    }

}
