package linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<String>();
        lista.push("Mattia");
        lista.push("Mattia2");
        lista.push("Mattia3");
        System.out.println(lista + "\n" + lista.extractLast());
        System.out.println(lista + "\n" + lista.extractLast());
        System.out.println(lista + "\n" + lista.extractLast());
        System.out.println(lista);
    }
}
