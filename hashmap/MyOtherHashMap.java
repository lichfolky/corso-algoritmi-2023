package hashmap;

public class MyOtherHashMap extends HashMap<String, Persona> {

    public MyOtherHashMap() {
        super(255);
    }

    @Override
    public int hashFunction(String element) {
        System.out.println("HASH di " + element + ": " + element.hashCode());
        int value = ("" + element.toLowerCase().charAt(0)).hashCode();
        return value;
    }

}
