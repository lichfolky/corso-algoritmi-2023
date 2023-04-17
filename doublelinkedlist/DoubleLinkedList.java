package doublelinkedlist;

public class DoubleLinkedList<T> implements LinkedList<T> {

    // primo elemento della lista
    DoubleNode<T> first;
    DoubleNode<T> last;
    int size;

    public DoubleLinkedList() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    public void insert(T value) {
        insert(size, value);
    }

    @Override
    public void insert(int index, T value) {
        if (size == 0) {
            DoubleNode<T> nuovoElemento = new DoubleNode<T>(null, value, null);
            first = nuovoElemento;
            last = nuovoElemento;
            size++;
            return;
        }

        if (index == 0) {
            // inserimento posizione 0 ( in testa )
            DoubleNode<T> nuovoElemento = new DoubleNode<T>(null, value, first);
            first.prev = nuovoElemento;
            first = nuovoElemento;
            size++;

            return;
        }

        if (index == size) {
            // inserimento in coda (size)
            DoubleNode<T> nuovoElemento = new DoubleNode<T>(last, value, null);
            last.next = nuovoElemento;

            last = nuovoElemento;
            size++;

            return;
        }

        // index tra (1, size - 1)
        // trovo elementi da modificare
        DoubleNode<T> precedente, successivo;
        precedente = first;
        successivo = first.next;
        for (int i = 0; i < index - 1; i++) {
            precedente = precedente.next;
            successivo = successivo.next;
        }

        DoubleNode<T> nuovoElemento = new DoubleNode<T>(null, value, null);

        precedente.next = nuovoElemento;
        nuovoElemento.prev = precedente;

        successivo.prev = nuovoElemento;
        nuovoElemento.next = successivo;

        size++;
    }

    @Override
    public T get(int index) {
        DoubleNode<T> aux;
        aux = first;
        for (int i = 0; i < index; i++) {
            aux = aux.next;
        }
        return aux.value;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String str = "";
        DoubleNode<T> aux = first;
        str += "\n--- Classifica ---\n";

        for (int i = 0; i < size; i++) {
            str += (i + 1) + ") " + aux.value.toString() + "\n";
            aux = aux.next;
        }

        str += "------\n";

        // str += "\nPrimo: " + first.value.toString();
        // str += "\nUltimo: " + last.value.toString();

        return str;
    }

    @Override
    public int search(T value) {
        int index = -1;

        DoubleNode<T> aux = first;
        for (int i = 0; i < size; i++) {
            if (aux.value.equals(value)) {
                index = i;
                break;
            }
            aux = aux.next;
        }

        return index;
    }

    @Override
    public T remove(int index) {
        T value;
        if (index > size - 1) {
            return null;
        }

        if (size == 1) {
            value = first.value;
            first = null;
            last = null;
            size--;
            return value;
        }

        if (index == 0) {
            value = first.value;
            if (first.next != null) {
                first = first.next;
                first.prev = null;
            }
            size--;
            return value;
        }

        if (index == size - 1) {
            value = last.value;
            if (last.prev != null) {
                last = last.prev;
                last.next = null;
            }
            size--;
            return value;
        }

        DoubleNode<T> aux = first;
        for (int i = 0; i < index; i++) {
            aux = aux.next;
        }

        aux.prev.next = aux.next;
        aux.next.prev = aux.prev;

        size--;
        return aux.value;
    }

}
