package linkedlist;

import queue.Queue;
import stack.Stack;

public class LinkedList<T> implements Stack<T>, Queue<T> {

    // Primo elemento della linkedlist (senza link entranti)
    private Node<T> top;
    // Ultimo elemento della linkedlist (con last.next == null)
    private Node<T> last;
    private int size;

    public LinkedList() {
        this.size = 0;
        this.top = null;
        this.last = null;
    }

    @Override
    public T top() {
        if (size == 0) {
            return null;
        }
        return top.value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    private T extractTop() {
        if (size == 0) {
            return null;
        }

        T value = top.value;
        if (top.next == null) {
            last = null;
            top = null;
        } else {
            top = top.next;
        }
        size--;
        return value;
    }

    public T extractLast() {
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            T value = last.value;
            top = null;
            last = null;
            size = 0;
            return value;
        }

        T value = last.value;

        Node<T> penultimoNodo = top;

        // aggiorna penultimoNodo fino a quando penultimoNodo.next.next == null

        while (penultimoNodo.next.next != null) {
            penultimoNodo = penultimoNodo.next;
        }

        last = penultimoNodo;
        penultimoNodo.next = null;
        size--;
        return value;
    }

    private void insertTop(T value) {
        Node<T> node = new Node<T>(value);
        node.next = top;
        top = node;
        if (size == 0) {
            last = node;
        }
        size++;
    }

    private void insertLast(T value) {
        Node<T> node = new Node<T>(value);
        if (size == 0) {
            top = node;
        } else {
            last.next = node;
        }
        last = node;
        size++;
    }

    @Override
    public void enqueue(T value) {
        insertLast(value);
    }

    @Override
    public T dequeue() {
        return extractTop();
    }

    // inserisco un elemento in testa (top)
    @Override
    public void push(T value) {
        insertTop(value);
    }

    // tolgo e restituisco un elemento in testa (top)
    @Override
    public T pop() {
        return extractTop();
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        String str = "[";
        Node<T> aux = top;
        while (aux != null) {
            str += aux.value;
            aux = aux.next;
            if (aux != null) {
                str += ",";
            }
        }
        str += "] last: " + last.value;
        str += " top: " + top.value;
        return str;
    }

}
