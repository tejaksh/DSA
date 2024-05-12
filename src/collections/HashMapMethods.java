package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
    public static void main(String[] args) {
        //creating hashmap
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(100, "Lamborghini");
        hm.put(101, "Ferrari");
        hm.put(102, "Bugatti");

        //printing initial hashmap
        System.out.println("Initial elements: " + hm);

        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();

        hm.putIfAbsent(102,"Audi"); //this will NOT replace buggati as we are using putIfAbsent
        hm.put(102, "BMW"); //this will take place of Buggatti
        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        hm.replace(102, "Meserati"); //BMW will be replaced by Meserati
        System.out.println();
        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //create new HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.putAll(hm); //put older map into new map
        System.out.println("After invoking putAll method: ");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
