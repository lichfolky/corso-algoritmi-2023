package tree;

import java.util.LinkedList;

/* Albero binario */
public class LinkedTree<T> implements Tree<T> {

    public Node<T> radice;
    private int size;

    public LinkedTree() {
        this.radice = null;
        this.size = 0;
    }

    @Override
    public Node<T> insert(Node<T> padre, T value) {

        if (padre == null) {
            radice = new Node<T>(value);
            size++;
            return radice;
        }
        if (padre.leftChild == null) {
            padre.leftChild = new Node<T>(value);
            size++;
            return padre.leftChild;
        }
        if (padre.rightChild == null) {
            padre.rightChild = new Node<T>(value);
            size++;
            return padre.rightChild;
        }
        return null;
    }

    public Node<T> insertLeft(Node<T> padre, T value) {
        padre.leftChild = new Node<T>(value);
        size++;
        return padre.leftChild;
    }

    public Node<T> insertRight(Node<T> padre, T value) {
        padre.rightChild = new Node<T>(value);
        size++;
        return padre.rightChild;
    }

    @Override
    public void delete(Node<T> node) {
        Node<T> padre = node.father;
        if (padre.leftChild.equals(node)) {
            padre.leftChild = null;
            size--;
        }
        if (padre.rightChild.equals(node)) {
            padre.rightChild = null;
            size--;
        }
    }

    @Override
    public LinkedList<Node<T>> getFigli(Node<T> padre) {

        LinkedList<Node<T>> lista = new LinkedList<Node<T>>();

        if (padre.leftChild == null) {
            lista.push(padre.leftChild);
        }
        if (padre.rightChild == null) {
            lista.push(padre.rightChild);
        }
        return lista;
    }

    @Override
    public Node<T> getPadre(Node<T> figlio) {
        return figlio.father;
    }

    @Override
    public LinkedList<T> visitaProfondita() {
        LinkedList<T> lista = new LinkedList<T>();
        LinkedList<Node<T>> stackNodi = new LinkedList<Node<T>>();
        if (radice == null) {
            return null;
        }
        stackNodi.push(radice);
        while (!stackNodi.isEmpty()) {
            Node<T> nodo = stackNodi.pop();
            if (nodo.rightChild != null) {
                stackNodi.push(nodo.rightChild);
            }
            if (nodo.leftChild != null) {
                stackNodi.push(nodo.leftChild);
            }
            lista.add(nodo.value);
        }
        return lista;
    }

    @Override
    public Node<T> searchProfondita(T value) {
        LinkedList<Node<T>> stackNodi = new LinkedList<Node<T>>();
        if (radice == null) {
            return null;
        }
        stackNodi.push(radice);
        while (!stackNodi.isEmpty()) {
            Node<T> nodo = stackNodi.pop();
            if (nodo.value.equals(value)) {
                return nodo;
            }
            if (nodo.rightChild != null) {
                stackNodi.push(nodo.rightChild);
            }
            if (nodo.leftChild != null) {
                stackNodi.push(nodo.leftChild);
            }
        }

        return null;
    }

    @Override
    public LinkedList<T> visitaAmpiezza() {
        LinkedList<T> lista = new LinkedList<T>();
        LinkedList<Node<T>> stackNodi = new LinkedList<Node<T>>();
        if (radice == null) {
            return null;
        }
        stackNodi.add(radice);
        while (!stackNodi.isEmpty()) {
            Node<T> nodo = stackNodi.poll();
            if (nodo.leftChild != null) {
                stackNodi.add(nodo.leftChild);
            }
            if (nodo.rightChild != null) {
                stackNodi.add(nodo.rightChild);
            }
            lista.add(nodo.value);
        }
        return lista;
    }

    @Override
    public String toString() {

        String str = "";
        LinkedList<Node<T>> stackNodi = new LinkedList<Node<T>>();
        if (radice == null) {
            return "";
        }

        stackNodi.push(radice);
        while (!stackNodi.isEmpty()) {
            Node<T> nodo = stackNodi.pop();
            if (nodo.rightChild != null) {
                stackNodi.push(nodo.rightChild);
            }
            if (nodo.leftChild != null) {
                stackNodi.push(nodo.leftChild);
            }

            str += nodo.value + ", ";
        }

        return str;
    }

    public String prettyPrint() {
        return radice.prettyPrint(0);
    }

    public int getSize() {
        return size;
    }

}
