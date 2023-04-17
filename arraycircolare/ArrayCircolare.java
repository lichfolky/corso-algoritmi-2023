package arraycircolare;

import queue.Queue;

public class ArrayCircolare implements Queue<Object> {
    int first;
    int last;
    Object[] array;
    int size;

    public ArrayCircolare(int dimensione) {
        this.first = 0;
        this.last = 0;
        this.size = 0;
        array = new Object[dimensione];
    }

    @Override
    public Object top() {
        return array[first];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void enqueue(Object value) {
        if (size <= array.length) {
            if (last < array.length - 1) {
                last++;
            } else {
                last = 0;
            }
            array[last] = value;
            size++;
        }
    }

    /* Restituisco l'elemento "first", aggiorno la sua nuova posizione, decremento size */
    @Override
    public Object dequeue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
    }

}
