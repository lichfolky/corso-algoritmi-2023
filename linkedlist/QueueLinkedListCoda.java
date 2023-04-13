package linkedlist;

import queue.Queue;

public class QueueLinkedListCoda<T> implements Queue<T> {
    /* TO FIX */
    Node<T> first;
    Node<T> second;
    Node<T> last;
    int size;

    public QueueLinkedListCoda() {
        this.size = 0;
        this.first = null;
        this.second = null;
        this.last = null;
    }

    @Override
    public T top() {
        if (size == 0) {
            return null;
        }
        return first.value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(T value) {
        Node<T> node = new Node<T>(value);
        node.next = last;
        last = node;
        if (size == 0) {
            first = node;
        }
        if (size == 1) {
            second = node;
        }
        size++;
    }

    @Override
    public T dequeue() {

        if (size == 0) {
            return null;
        }

        T value = first.value;

        if (size == 1) {
            // first e last = elemento
            // second = null;
            first = null;
            second = null;
            last = null;
            return value;
        }

        if (size == 3) {
            // first = 1
            // second = 2
            // last = 3
            first = second;
            first.next = null;
            if (size == 2) {
                second = null;
            } else {
                // trova second
                Node<T> aux = last;
                while (aux.next.next != null) {
                    aux = aux.next;
                }
                second = aux;
            }
        }
        return value;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        String str = "[";
        Node<T> aux = first;
        while (aux != null) {
            str += aux.value;
            aux = aux.next;
            if (aux != null) {
                str += ",";
            }
        }
        str += "] last: " + last.value;
        str += " first: " + first.value;
        return str;
    }

    @Override
    public int getSize() {
        return size;
    }

}
