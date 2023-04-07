package dizionario;

import ricerca.Ricerca;

public class DizionarioNonOrdinato implements Dizionario {
    private String[] dizionario;
    Ricerca<String> ricerca;
    private int indicePrimoElementoVuoto;
    // Sort<String> ordinamento;

    public DizionarioNonOrdinato() {
        ricerca = new Ricerca<String>();
        dizionario = new String[1];
        indicePrimoElementoVuoto = 0;
    }

    // n <= dimensioneDizionario < 4n
    // n = 0, dimensioneDizionario = 1
    // n supera dimensioneDizionario, radoppia dimensioneDizionario
    // n = dimensioneDizionario/4, dimezza dimensioneDizionario
    public DizionarioNonOrdinato(String[] init) {
        ricerca = new Ricerca<String>();
        dizionario = new String[init.length * 2];
        for (int i = 0; i < init.length; i++) {
            dizionario[i] = init[i];
        }
        indicePrimoElementoVuoto = init.length;
    }

    // O(n)
    @Override
    public int search(String element) {
        return ricerca.ricercaLineareIndice(dizionario, element);
    }

    // O(n)
    @Override
    public void delete(int index) {
        if (indicePrimoElementoVuoto == dizionario.length / 4) {
            String[] auxDizionario = new String[dizionario.length / 2];

            for (int i = 0, j = 0; i < dizionario.length; i++) {
                if (i != index) {
                    auxDizionario[j] = dizionario[i];
                    j++;
                }
            }
            dizionario = auxDizionario;
        } else {
            for (int i = index; i < indicePrimoElementoVuoto; i++) {
                dizionario[i] = dizionario[i + 1];
            }
        }
        indicePrimoElementoVuoto--;
    }

    // ammortizzato costante
    @Override
    public void insert(String element) {
        if (indicePrimoElementoVuoto + 1 == dizionario.length) {
            String[] auxDizionario = new String[dizionario.length * 2];
            for (int i = 0; i < dizionario.length; i++) {
                auxDizionario[i] = dizionario[i];
            }
            dizionario = auxDizionario;
        }
        dizionario[indicePrimoElementoVuoto] = element;
        indicePrimoElementoVuoto++;
    }

    @Override
    public boolean isEmpty() {
        return indicePrimoElementoVuoto == 0;
    }

    @Override
    public String toString() {
        return String.join(", ", dizionario);
    }
}
