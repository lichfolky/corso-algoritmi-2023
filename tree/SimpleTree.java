package tree;

import java.util.Arrays;

import linkedlist.StackQueueLinkedList;
import stack.Stack;

public class SimpleTree {
    private Object array[];
    public int padri[];

    public SimpleTree(int size) {
        this.array = new Object[size];
        this.padri = new int[size];
        Arrays.fill(padri, -1);
    }

    // il figlio i di un padre v in un albero d-ario
    // è p[d * v + i]
    // è p[2 * v + (0 o 1)]
    // se indexPadre == -1  allora inseriamo come radice

    public int insert(int indexPadre, Object value) {
        if (indexPadre == -1) {
            array[1] = value;
            padri[1] = 0;
            return 1;
        }
        if (array[2 * indexPadre] == null) {
            array[2 * indexPadre] = value;
            padri[2 * indexPadre] = indexPadre;
            return 2 * indexPadre;
        } else {
            if (array[2 * indexPadre + 1] == null) {
                array[2 * indexPadre + 1] = value;
                padri[2 * indexPadre + 1] = indexPadre;
                return 2 * indexPadre + 1;
            } else {
                return -1;
            }
        }
    }

    public void delete(int index) {
        array[index] = null;
        padri[index] = -1;
    }

    public Object[] getFigli(int indexPadre) {
        Object[] figli = new Object[2];
        figli[0] = array[2 * indexPadre];
        figli[1] = array[2 * indexPadre + 1];
        return figli;
    }

    public int getPadre(int indexFiglio) {
        return padri[indexFiglio];
    }

    public void visitaProfondita() {
        Stack<Integer> stackNodi = new StackQueueLinkedList<Integer>();
        stackNodi.push(1);
        while (!stackNodi.isEmpty()) {
            Integer nodo = stackNodi.pop();
            if (2 * nodo + 1 < array.length) {
                if (array[2 * nodo + 1] != null) {
                    stackNodi.push(2 * nodo + 1);
                }
            }
            if (2 * nodo < array.length) {
                if (array[2 * nodo] != null) {
                    stackNodi.push(2 * nodo);
                }
            }

            System.out.println(array[nodo]);
        }
    }

    public String toString() {
        return Arrays.toString(array);
    }

}
