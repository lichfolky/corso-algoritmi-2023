package tree;

import java.util.Arrays;

public class SimpleTree {
    Object array[];

    public SimpleTree(int size) {
        this.array = new Object[size];
    }

    // il figlio i di un padre v in un albero d-ario
    // è p[d * v + i]
    // è p[2 * v + (0 o 1)]
    // se indexPadre == -1  allora inseriamo come radice
    public int insert(int indexPadre, Object value) {
        if (indexPadre == -1) {
            array[1] = value;
            return 1;
        }
        if (array[2 * indexPadre] == null) {
            array[2 * indexPadre] = value;
            return 2 * indexPadre;
        } else {
            if (array[2 * indexPadre + 1] == null) {
                array[2 * indexPadre + 1] = value;
                return 2 * indexPadre + 1;
            } else {
                return -1;
            }
        }
    }

    public void delete(int index) {
        array[index] = null;
    }

    public Object[] getFigli(int indexPadre) {
        Object[] figli = new Object[2];
        figli[0] = array[2 * indexPadre];
        figli[1] = array[2 * indexPadre + 1];
        return figli;
    }

    public int getPadre(int indexFiglio) {
        ///
    }

    // vista dell'albero
    // stampa bella

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

}
