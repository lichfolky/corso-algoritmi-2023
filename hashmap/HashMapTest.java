package hashmap;

public class HashMapTest {

    public static void main(String[] args) {

        MyOtherHashMap map = new MyOtherHashMap();

        Persona mattia = new Persona("attia", 21);
        map.set(mattia.nome, mattia); //97

        map.set("zorenzo", new Persona("zorenzo", 22)); //122
        map.set("Marta", new Persona("Marta", 36));

        System.out.println("map:\n " + map);
        System.out.println("Marta: " + map.get("Marta"));
        System.out.println("Lorenzo : " + map.get("Lorenzo"));

        /* 
        java.util.Map<String, Persona> map = new java.util.Hashtable(0, 0)<String, Persona>(26);
        Persona mattia = new Persona("attia", 21);
        map.put(mattia.nome, mattia); //97
        
        map.put("zorenzo", new Persona("zorenzo", 22)); //122
        map.put("Marta", new Persona("Marta", 36));
        
        System.out.println("Map:\n " + map);
        System.out.println("Marta: " + map.get("Marta"));
        System.out.println("Lorenzo : " + map.get("Lorenzo"));
        */

    }

}
