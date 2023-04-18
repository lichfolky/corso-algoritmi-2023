package tree;

import java.util.LinkedList;
import java.util.List;

public interface Tree<T> {

    /* Inserisce un figlio con valore value, ad un padre */
    Node<T> insert(Node<T> padre, T value);

    void delete(Node<T> node);

    // Node<T>[] getFigli(Node<T> padre);

    Node<T> getPadre(Node<T> figlio);

    void visitaProfondita();

    void visitaAmpiezza();

    Node<T> searchProfondita(T value);

    String prettyPrint();

    String toString();

}