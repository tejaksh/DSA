package collections;


import java.util.Hashtable;
import java.util.Map;

/**
 *HashTable is an array of a list. Each list is known as bucket
*The position of bucket is identified by calling the hashCode() method.
*HashTable contains the values based on the key
*HashTable class contains unique elements
*doesn't allow null key or values
*class is synchronized
*initial capacity is 11 and loading factor is 0.75
 **/
public class HashTable2 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(100, "Mercedez");
        ht.put(102, "Audi");
        ht.put(101, "Hummer");
        ht.put(103, "Pagani");

        for (Map.Entry m : ht.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println(ht.getOrDefault(101, "Not found")); //retuns the value to which specified key is mapped, or defaultValue if the map contains no mapping for the key
        System.out.println(ht.getOrDefault(105, "Not found"));
    }
}
