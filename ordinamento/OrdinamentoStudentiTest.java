package ordinamento;

import java.util.Arrays;

public class OrdinamentoStudentiTest {

    public static void main(String[] args) {
        String[] studenti = 
        {
        "Eugenio Aloi - https://github.com/eugenioaloi",
        "Enrico Aimo	- https://github.com/EnricoAimo",
        "Antonio Fiumanò - https://github.com/TonyFiuma",
        "Bodasca Luca - https://github.com/bodascaluca",
        "Gabriele Sucato - https://github.com/Gabriele-Sucato",
        "Roberto Blasi - https://github.com/robbbb999",
        "Facundo Acosta - https://github.com/FacuNor",
        "Simone Di Carlo - https://github.com/s-dc",
        "Zaccone Chiara - https://github.com/ChiaraZaccone",
        "Josue Manuel Condori Quisbert - https://github.com/JCondoriGithub",
        "Elisabetta Penna - https://github.com/ElisabettaPenna",
        "Samuele Richetto - https://github.com/samuNeo23",
        "Chiara Zaccone - https://github.com/ChiaraZaccone",
        };

        // Arrays.sort(studenti);
        Sort.selectionSort(studenti);
        System.out.println("Studenti\n" + String.join("\n", studenti));

    }
    
}
