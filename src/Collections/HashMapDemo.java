package Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

//keys should be unique
//If you try to insert the duplicate key, it will replace the element of the corresponding key
//Java HashMap may have one null key and multiple null values.
//HashMap maintains no order
//Initial capacity is 16 & loading factor is 0.75
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Triumph");
        map.put(5, "Kawasaki");
        map.put(2, "Yamaha");
        map.put(4, "Ducati");
        map.put(null, "Suzuki");

        //map.clear();
       for(Map.Entry m : map.entrySet()){
           System.out.println(m.getKey() + " " + m.getValue());
       }
    }
}
