package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

//contains key-value pairs
//contains unique keys but map can allow duplicate values
//HashMap & LinkedHashMap allows null keys and values but TreeMap doesn't allow null key or value
//useful for search, update or delete on the basis of key
public class MapInterfaceDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1, "Triumph");
        map.put(5, "Kawasaki");
        map.put(2, "Yamaha");
        map.put(4, "Ducati");
        map.put(3, "Suzuki");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue()) //sorted map by comparing value
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // sorted map by comparing value in reverse order
                .forEach(System.out::println);
    }
}
