package ricerca;

import java.util.Arrays;
import java.util.Scanner;

public class RicercaLineareTest {

    /*
     * https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
     */
    public static void main(String[] args) {
        int[] array = { 5, 4, 2, 1 };
        int find = 5;
        int index = Ricerca.ricercaLineare(array, find);
        System.out.println("trovato " + index);
        find = 2;
        index = Ricerca.ricercaLineare(array, find);
        System.out.println("trovato " + index);

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        boolean inputIsNumber = false;
        int inputNumber;
        do {
            System.out.println("Enter number, other to exit...");
            String inputText = scanner.nextLine();
            try {
                inputNumber = Integer.parseInt(inputText);
                System.out.println("number is: " + inputNumber);
                inputIsNumber = true;
                index = Ricerca.ricercaLineare(array, inputNumber);
                System.out.println("trovato " + index);
            } catch (NumberFormatException e) {
                inputIsNumber = false;
            }
        } while (inputIsNumber);
        System.out.println("Goodbye...");
        scanner.close();

    }

}
