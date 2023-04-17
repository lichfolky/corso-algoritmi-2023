package doublelinkedlist;

public interface LinkedList<T> {

    /* Inserisce un valore value alla posizione index */
    public void insert(int index, T value);

    /* Rimuove un elemento alla posizione index e restituisce il suo valore */
    public T remove(int index);

    /* Restituisce il suo valore di un elemento alla posizione index */
    public T get(int index);

    /* Restituisce l'indice il primo un elemento trovato, altrimenti -1 */
    public int search(T value);

    public int getSize();

    public boolean isEmpty();

}
