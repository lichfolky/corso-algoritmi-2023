package tree;

import linkedlist.QueueLinkedList;
import linkedlist.StackQueueLinkedList;
import queue.Queue;
import stack.Stack;

public class LinkedTree<T> implements Tree<T> {

    public Node<T> radice;
    int size;

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
    /* 
    @Override
    public Node<T>[] getFigli(Node<T> padre) {
        Node[] figli = new [2];
    
        if (padre.leftChild == null) {
            padre.leftChild = new Node<T>(value);
            size++;
        }
        if (padre.rightChild == null) {
            padre.rightChild = new Node<T>(value);
            size++;
        }
    }*/

    @Override
    public Node<T> getPadre(Node<T> figlio) {
        return figlio.father;
    }

    @Override
    public void visitaProfondita() {
        Stack<Node<T>> stackNodi = new StackQueueLinkedList<Node<T>>();
        if (radice == null) {
            return;
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
            System.out.println(nodo.value);
        }
    }

    @Override
    public Node<T> searchProfondita(T value) {
        Stack<Node<T>> stackNodi = new StackQueueLinkedList<Node<T>>();
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
            System.out.println(nodo.value);
        }

        return null;
    }

    @Override
    public void visitaAmpiezza() {

        Queue<Node<T>> stackNodi = new QueueLinkedList<Node<T>>();
        if (radice == null) {
            return;
        }
        stackNodi.enqueue(radice);
        while (!stackNodi.isEmpty()) {
            Node<T> nodo = stackNodi.dequeue();
            if (nodo.leftChild != null) {
                stackNodi.enqueue(nodo.leftChild);
            }
            if (nodo.rightChild != null) {
                stackNodi.enqueue(nodo.rightChild);
            }

            System.out.println(nodo.value);
        }
    }

    @Override
    public String toString() {

        String str = "";
        Stack<Node<T>> stackNodi = new StackQueueLinkedList<Node<T>>();
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

    @Override
    public String prettyPrint() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prettyPrint'");
    }

}
