package Collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(101, "Triumph");
        table.put(102, "Yamaha");
        table.put(103, "Ducati");
        table.put(104, "Kawasaki");

        //System.out.println(table);
        for(Map.Entry m:table.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
