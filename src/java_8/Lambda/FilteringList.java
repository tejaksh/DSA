package java_8.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilteringList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("One", "Two", "Three", "Four", "Five"));

        Predicate<String> filter = string -> string.endsWith("e"); //filter the strings ends with "e"
        list.removeIf(filter); //remove the strings ends with "e"
        System.out.println(list);

        /*Consumer<String> action = string -> System.out.println(string);
        list.forEach(action);
*/
    }
}
