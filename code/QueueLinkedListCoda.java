package code;

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
        if (size == 1) {
            // first e last = elemento
            // second = null;
            first = null;
            second = null;
            last = null;
            return null;
        }
        if (size == 2) {
            // first = 1
            // last = 2, second = 2;

            first = second;
            first.next = null;
            second = null;
        }
        if (size == 3) {
            // first = 1
            // second = 2
            // last = 3
            first = second;
            first.next = null;
            // trova second
            Node<T> aux = last;
            // ---
            second = last;
        }

        if (size == 4) {

        }

        T value = first.value;

        first = second;
        first.next = null;
        size--;

        if (size <= 1) {
            second = null;
        } else {
            // troviamo il penultimo elemento
            Node<T> aux = last;
            while (aux.next.next != null) {
                aux = aux.next;
                second = aux;
            }
        }
        return value;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[] la coda è vuota!";
        }
        String str = "[";
        Node<T> aux = last;
        while (aux != null) {
            str += aux.value;
            aux = aux.next;
            if (aux != null) {
                str += ",";
            }
        }
        str += "] last: " + last.value;

        if (second != null) {
            str += " ... second: " + second.value;
        }

        str += " first: " + first.value;
        return str;
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSize'");
    }

}
