package Java_8.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilteringList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("One", "Two", "Three", "Four", "Five"));

        Predicate<String> filter = string -> string.endsWith("e"); //filter the strings starts with "F"
        list.removeIf(filter); //remove the strings starts from "F"
        System.out.println(list);

        /*Consumer<String> action = string -> System.out.println(string);
        list.forEach(action);
*/

    }
}
