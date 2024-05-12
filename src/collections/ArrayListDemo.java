package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // adding elements to the ArrayList
        list.add("Volkswagen");
        list.add("Toyota");
        list.add("Porsche");
        list.add("Ferrari");
        list.add("Mercedes-Benz");
        list.add("Audi");
        list.add("Rolls-Royce");
        list.add("BMW");

        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);
        /*Collections.reverse(list);
        System.out.println("After reverse: " +  list + " " +  list.size());*/

        list.add(0, "Meserati");
        list.add(1, "Pagani");

        System.out.println("After adding: " +  list);
        Collections.sort(list);
        System.out.println("After final adding and sorting: " +  list + " " +  list.size());
    }
}
