package Java_8.MethodReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayListToHashMap {
    public static void main(String[] args) {
        ArrayList<String> bikes = new ArrayList<>();
        bikes.add("Speed Twin");
        bikes.add("ZX10R");
        bikes.add("S1000R");
        bikes.add("Panigale V4R");
        bikes.add("MT01");

        //printing contents of list before conversion
        System.out.println("Elements in the ArrayList are: " + bikes);

        //Creating new HashMap using Method Reference
        //with necessary classes for the conversion
        HashMap<String, Integer> map = bikes.stream().collect(Collectors.toMap(
                Function.identity(), String::length,
                (e1, e2) -> e1, HashMap::new));
        System.out.println("Elements in the HashMap are: " + bikes);
    }
}
