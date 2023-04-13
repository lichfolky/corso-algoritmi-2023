package code;

import mystack.Stack;

public class StackQueueLinkedList<T> implements Stack<T>, Queue<T> {

    private Node<T> top;
    private Node<T> last;
    private int size;

    public StackQueueLinkedList() {
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

    @Override
    public void enqueue(T value) {
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
    public T dequeue() {
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

    // inserisco un elemento in testa (top)
    @Override
    public void push(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

    // tolgo e restituisco un elemento in testa (top)
    @Override
    public T pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

}
