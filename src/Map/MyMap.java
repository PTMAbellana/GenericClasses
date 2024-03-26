package Map;
import java.util.ArrayList;

public class MyMap<K, V> {
    ArrayList<K> keys; //package-priv default
    ArrayList<V> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(K key, V value) {
        int index = keys.indexOf(key); // instead of using for loops nga magcreate pud ug para lain static entry class
        if (index != -1) { // if naa ang key
            values.set(index, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public V get(K key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            return values.get(index);
        } else {
            return null;
        }
    }

    public V remove(K key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            keys.remove(index);
            return values.remove(index);
        } else {
            return null;
        }
    }

}

