package queue;

public interface Queue<T> {

    /*
     * Restituisce il primo elemento senza toglierlo dalla coda
     */
    public T top();

    /*
     * Restituisce il primo elemento senza toglierlo dalla coda
     */
    public boolean isEmpty();

    /*
     * Mette in coda l'elemento value
     * Restituisce la posizione in cui l'ha inserito
     */
    public void enqueue(T value);

    /*
     * Toglie dalla fine della coda il primo elemento e
     * lo restituisce.
     */
    public T dequeue();

    /*
     * Toglie dalla fine della coda il primo elemento e
     * lo restituisce.
     */
    public int getSize();

}
