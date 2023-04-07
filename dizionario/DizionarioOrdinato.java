package dizionario;

import ordinamento.Sort;
import ricerca.Ricerca;

public class DizionarioOrdinato implements Dizionario {
    private String[] dizionario;
    Ricerca<String> ricerca;
    Sort<String> ordinamento;

    public DizionarioOrdinato() {
        ricerca = new Ricerca<String>();
        dizionario = new String[0];
    }

    public DizionarioOrdinato(String[] init) {
        ricerca = new Ricerca<String>();
        ordinamento = new Sort<String>();
        dizionario = init.clone();
        ordinamento.quickSort(dizionario);
    }

    // search: ricerca binaria (logn)
    public int search(String elemento) {
        return ricerca.ricercaBinariaRicorsivaIndice(dizionario, elemento);
    }

    // insert deve mantenere ordinamento e shiftare O(n)
    public void insert(String elemento) {
        String[] auxDizionarioOrdinato = new String[dizionario.length + 1];
        int i = 0;

        for (; i < dizionario.length; i++) {
            if (dizionario[i].compareTo(elemento) < 0) {
                auxDizionarioOrdinato[i] = dizionario[i];
            } else {
                auxDizionarioOrdinato[i] = elemento;
                i++;
                break;
            }
        }
        for (; i < auxDizionarioOrdinato.length; i++) {
            auxDizionarioOrdinato[i] = dizionario[i - 1];
        }
        dizionario = auxDizionarioOrdinato;
    }

    // delete e shiftare O(n)
    public void delete(int index) {
        String[] auxDizionarioOrdinato = new String[dizionario.length - 1];

        for (int i = 0, j = 0; i < dizionario.length; i++) {
            if (i != index) {
                auxDizionarioOrdinato[j] = dizionario[i];
                j++;
            }
        }
        dizionario = auxDizionarioOrdinato;
    }

    // empty
    public boolean isEmpty() {
        return dizionario.length == 0;
    }

    @Override
    public String toString() {
        return String.join(", ", dizionario);
    }
}
