package generictree;

import java.util.LinkedList;
import java.util.Queue;

public class GenericTree<T> {

    public class Node<E> {
        LinkedList<Node<E>> figli;
        Node<E> padre;
        E value;

        public Node(E value) {
            this.figli = new LinkedList<Node<E>>();
            this.value = value;
            this.padre = null;
        }

        public void addFiglio(Node<E> figlio) {
            figli.add(0, figlio);
        }

        public void delete(Node<E> figlio) {
            figli.remove(figlio);
        }

        public String prettyPrint(int lv) {
            String str = "";
            if (lv > 0) {
                str += " ".repeat(lv * 3) + "│ \n";
                str += " ".repeat(lv * 3) + "└──";
            }

            str += this.toString() + "\n";
            for (Node<E> figlio : figli) {
                str += figlio.prettyPrint(lv + 1);
            }
            return str;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    Node<T> radice;
    int size;

    public GenericTree() {
        this.radice = null;
        this.size = 0;
    }

    public Node<T> insert(Node<T> padre, T value) {
        Node<T> node = new Node<T>(value);
        if (padre == null) {
            radice = node;
        } else {
            padre.addFiglio(node);
        }
        return node;
    }

    public void delete(Node<T> node) {
        node.padre.delete(node);
    }

    public LinkedList<Node<T>> getFigli(Node<T> padre) {
        return padre.figli;
    }

    public Node<T> getPadre(Node<T> figlio) {
        return figlio.padre;
    }

    public LinkedList<T> visitaProfondita() {
        LinkedList<T> visita = new LinkedList<T>();
        LinkedList<Node<T>> stack = new LinkedList<Node<T>>();
        stack.push(radice);
        while (!stack.isEmpty()) {
            Node<T> nodo = stack.pop();
            for (Node<T> figlio : nodo.figli) {
                stack.push(figlio);
            }
            visita.add(nodo.value);
        }
        return visita;
    }

    public LinkedList<T> visitaAmpiezza() {
        LinkedList<T> visita = new LinkedList<T>();
        Queue<Node<T>> stack = new LinkedList<Node<T>>();
        stack.add(radice);
        while (!stack.isEmpty()) {
            Node<T> nodo = stack.poll();
            for (Node<T> figlio : nodo.figli) {
                stack.add(figlio);
            }
            visita.add(nodo.value);
        }
        return visita;
    }

    public String prettyPrint() {
        return radice.prettyPrint(0);
    }

}
