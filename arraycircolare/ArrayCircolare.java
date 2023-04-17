package arraycircolare;

import java.util.Arrays;

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
            array[last] = value;
            if (last < array.length - 1) {
                last++;
            } else {
                last = 0;
            }
            size++;
        }
    }

    /* Restituisco l'elemento "first", aggiorno la sua nuova posizione, decremento size */
    @Override
    public Object dequeue() {
        if (size == 0) {
            return null;
        }
        Object value = array[first];

        // non è necessario perchè sarà riscritto
        array[first] = null;
        // aggiorno posizione first
        if (first < array.length - 1) {
            first++;
        } else {
            first = 0;
        }
        size--;
        return value;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

}
