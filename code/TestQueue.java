package code;

import java.util.Scanner;

public class TestQueue {

    static Queue<String> coda;
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        coda = new QueueLinkedList<String>();
        clearScreen();
        System.out.println("\u001B[103m" + "\nBenvenuto!!\n");

        boolean esci = false;
        while (!esci) {
            System.out.println("\u001B[0m \n" + coda);
            System.out.println("\nScegli un'opzione:\n");
            System.out.println("1: Aggiungi un cliente in coda");
            System.out.println("2: Servi un cliente");
            System.out.println("3: Controlla chi è il prossimo della coda");
            System.out.println("4: La coda è vuota?");
            System.out.println("5: Esci");
            System.out.println("");
            int scelta = scanner.nextInt();
            scanner.nextLine();
            clearScreen();
            System.out.println("");
            switch (scelta) {
                case 1:
                    addCliente();
                    break;
                case 2:
                    serviCliente();
                    break;
                case 3:
                    checkCliente();
                    break;
                case 4:
                    isCodaVuota();
                    break;
                case 5:
                    esci = true;
                    break;
            }
        }
        scanner.close();

    }

    private static void addCliente() {
        System.out.println("Inserisci il nome del cliente\n");
        String nome = scanner.nextLine();
        coda.enqueue(nome);
    }

    private static void serviCliente() {
        String nome = coda.dequeue();
        System.out.println("Il cliente " + nome + " è stato servito!");
    }

    private static void checkCliente() {
        String nome = coda.top();
        if (nome == null) {
            System.out.println("Non c'è nessuno in coda!");
        } else {
            System.out.println("Il prossimo cliente è " + nome);
        }
    }

    private static void isCodaVuota() {
        if (coda.isEmpty()) {
            System.out.println("Non c'è nessuno in coda!");
        } else {
            System.out.println("C'è qualcuno in coda!");
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
