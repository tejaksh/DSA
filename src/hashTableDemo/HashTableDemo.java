package hashTableDemo;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>(10);
        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        for(String key : table.keySet()){
            System.out.println(key.hashCode()%10 + " " + key + " " + table.get(key));
        }
    }
}
