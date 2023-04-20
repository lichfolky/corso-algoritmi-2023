import java.util.Scanner;

public class TestUnionFind {
    static UnionFind<String> insiemi;
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        insiemi = new QuickUnion<String>();
        clearScreen();

        insiemi.make("Mattia");
        insiemi.make("Maria");
        insiemi.make("Luca");
        insiemi.make("Marco");
        insiemi.make("Anna");

        //System.out.println("\u001B[103m" + "\nBenvenuto!!\n");
        System.out.println("\nBenvenuto!!\n");
        boolean esci = false;
        while (!esci) {
            System.out.println();
            System.out.println(insiemi);
            System.out.println();
            System.out.println("\nScegli un'opzione:\n");
            System.out.println("1: Inserisci un elemento");
            System.out.println("2: Cerca un elemento");
            System.out.println("3: Unisci due insiemi");
            System.out.println("4: Esci");
            System.out.println("");
            int scelta = scanner.nextInt();
            scanner.nextLine();
            clearScreen();
            switch (scelta) {
                case 1:
                    inserisci();
                    break;
                case 2:
                    cerca();
                    break;
                case 3:
                    unisci();
                    break;
                case 4:
                    esci = true;
                    break;
            }
        }
        scanner.close();
    }

    private static void unisci() {
        System.out.println();

        System.out.println("Inserisci primo insieme\n");
        int key1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        System.out.println("Inserisci secondo insieme\n");
        int key2 = scanner.nextInt();
        scanner.nextLine();
        insiemi.union(insiemi.getSet(key1), insiemi.getSet(key2));
    }

    private static void cerca() {
        System.out.println();
        System.out.println("Inserisci la chiave dell'elemento\n");
        int key = scanner.nextInt();
        scanner.nextLine();
        System.out.println("trovato: " + insiemi.find(insiemi.getNode(key)));
    }

    private static void inserisci() {
        System.out.println();
        System.out.println("Inserisci nome\n");
        String nome = scanner.next();
        System.out.println("inserito: " + insiemi.make(nome));
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
