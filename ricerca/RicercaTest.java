package ricerca;
import java.util.Arrays;

public class RicercaTest {
    public static void main(String[] args) {

        System.out.println(7/2);
        int[] array = { 9, 6, 4, 2, 8, 3, 1 };
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int elementoDaTrovare = 2;
        
        boolean trovato = Ricerca.ricercaBinaria(array, elementoDaTrovare);
        if (trovato) {
            System.out.println("Elemento " + elementoDaTrovare + " trovato");
        } else {
            System.out.println("Elemento " + elementoDaTrovare + " non trovato");
        }
    }
}
