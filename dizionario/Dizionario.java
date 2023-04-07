package dizionario;

public interface Dizionario {

    abstract public int search(String element);

    abstract public void delete(int index);

    abstract public void insert(String element);

    public String toString();

    abstract public boolean isEmpty();
}
