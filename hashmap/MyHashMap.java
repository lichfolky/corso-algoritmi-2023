package hashmap;

public class MyHashMap extends HashMap<String, Persona> {

    public MyHashMap(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public int hashFunction(String element) {
        return (int) element.charAt(0);
    }

}
