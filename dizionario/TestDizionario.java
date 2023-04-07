package dizionario;

public class TestDizionario {

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
                "Chiara"
        };

        Dizionario myDizionario = new DizionarioNonOrdinato();

        // int index = myDizionario.search("Samuele");
        // System.out.println("Ho trovato " + myDizionario + "\n" + index);
        System.out.println(myDizionario);
        System.out.println(myDizionario.isEmpty());
        myDizionario.insert("Eugenio");
        System.out.println(myDizionario);
        myDizionario.insert("Mattia");
        System.out.println(myDizionario);
        myDizionario.insert("Filippo");
        System.out.println(myDizionario);
        myDizionario.insert("Carlo");
        System.out.println(myDizionario);
    }

}
