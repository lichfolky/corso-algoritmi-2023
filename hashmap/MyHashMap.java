package hashmap;

public class MyHashMap extends HashMap<String, Persona> {

    public MyHashMap(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public int hashFunction(String element) {
        char inizialeMinuscola = element.toLowerCase().charAt(0);
        int code = (int) inizialeMinuscola;
        code = code - 97;
        return code;
    }

    /* 
    public void set(String key, Persona element) {
        super.set(key.toLowerCase(), element);
    }*/

}
