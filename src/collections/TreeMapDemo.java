package collections;

import java.util.Map;
import java.util.TreeMap;

//contains values based on the key.
//contains only unique elements
//cannot have a null key but can have multiple null values
//maintains ascending order
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(103,"Volvo");
        map.put(101,"range rover");
        map.put(102,"jaguar");

        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " +  m.getValue());
        }
        map.remove(102);
        System.out.println(map);

        map.put(102, "Koenigsegg");
        System.out.println(map);
    }
}
