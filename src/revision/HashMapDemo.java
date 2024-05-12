package revision;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C",3);

        System.out.println("Size of map is: " + map.size());
        System.out.println("Keys of map are: " + map.get("A"));
        System.out.println(map.containsKey("D"));
        System.out.println(map);
        System.out.println(map.hashCode());
    }
}
