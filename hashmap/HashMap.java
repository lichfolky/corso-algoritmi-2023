package hashmap;

import java.util.ArrayList;

/* con lista di collisioni */
public abstract class HashMap<T, E> {
    ArrayList<ArrayList<E>> map;

    public HashMap(int initialCapacity) {
        this.map = new ArrayList<ArrayList<E>>(initialCapacity);
        for (int i = 0; i < initialCapacity; i++) {
            map.add(new ArrayList<E>());
        }
    }

    public abstract int hashFunction(T element);

    public ArrayList<E> get(T key) {
        return map.get(hashFunction(key));
    }

    public void set(T key, E element) {
        int index = hashFunction(key);
        ArrayList<E> el = map.get(index);
        if (el == null) {
            el = new ArrayList<E>();
        }
        el.add(element);
    }

    public void delete(T key, E element) {
        map.get(hashFunction(key)).remove(element);
    }

    @Override
    public String toString() {
        String str = "";
        int i = 0;
        for (ArrayList<E> list : map) {
            str += i + ": ";
            for (E element : list) {
                str += element.toString() + ", ";
            }
            str += "\n";
            i++;
        }
        return str;
    }

}
