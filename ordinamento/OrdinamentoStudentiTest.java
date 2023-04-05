package ordinamento;

public class OrdinamentoStudentiTest {

    public static void main(String[] args) {
        String[] studenti = {

                "Eugenio",
                "Enrico",
                "Antonio",
                "Bodasca",
                "Gabriele",
                "Roberto",
                "Facundo",
                "Simone",
                "Zaccone",
                "Josue",
                "Elisabetta",
                "Samuele",
                "Chiara "
        };

        System.out.println("È ordinato: " + Sort.isOrdinato(studenti));
        // Arrays.sort(studenti);
        // Sort.selectionSort(studenti);

        // Sort.mergeSort(studenti, 0, studenti.length - 1);
        // System.out.println("Studenti\n" + String.join("\n", studenti));

        // Sort.insertionSort(studenti);
        // Sort.bubbleSort(studenti);
        // System.out.println("È ordinato: " + Sort.isOrdinato(studenti));

        // System.out.println("Studenti:\n\n" + String.join("\n", studenti));

        // proviamo un algoritmo terribile:
        String[] pochiStudenti = {
                "Eugenio",
                "Enrico",
                "Antonio",
                "Bodasca",
                "Gabriele",
                "Roberto",
                "Facundo",
                "Simone",
                "Zaccone",
                "Josue",
                "Elisabetta",
        };
        Sort.bozoSort(pochiStudenti);
        System.out.println("Studenti:\n\n" + String.join("\n", pochiStudenti));

    }

}
