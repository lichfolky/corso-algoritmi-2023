package hashmap;

public class HashMapTest {

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap(256);

        map.set("Mattia", new Persona("Mattia", 21));
        map.set("Lorenzo", new Persona("Lorenzo", 22));
        map.set("Marta", new Persona("Marta", 36));

        System.out.println("map: " + map);
        System.out.println("Marta: " + map.get("Marta"));
        System.out.println("Lorenzo : " + map.get("Lorenzo"));
    }

}
