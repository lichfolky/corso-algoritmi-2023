public interface UnionFind<T> {
    public class Node<E> {
        public int key;
        public E value;
        public SetNode set;

        public Node(int key, E value) {
            this.key = key;
            this.value = value;
            this.set = new UnionFind.SetNode(key);
        }

        @Override
        public String toString() {
            return "(" + key + ") " + value.toString();
        }
    }

    public class SetNode {
        int key;
        SetNode parent;

        public SetNode(int key) {
            this.key = key;
            this.parent = null;
        }

        @Override
        public String toString() {
            return "" + key;
        }
    }

    /*
    * Crea un nuovo elemento dell'insieme, assegnadogli un setNode di riferimento
    * e una chiave.
    */
    public Node<T> make(T value);

    /* 
     * Restituisce il nome (key) dell'insieme che contiene node
     */
    public SetNode find(Node<T> node);

    /*
     * Unisce i due insiemi in un insieme di nome set1.key
     * Tutti gli elementi di set 2 avranno come insieme di 
     * appartenenza il primo set (set1).
     */
    public void union(SetNode set1, SetNode set2);

    public SetNode getSet(int key);

    public Node<T> getNode(int key);

}