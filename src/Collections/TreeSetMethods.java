package Collections;

import java.util.TreeSet;

public class TreeSetMethods {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(45);
        set.add(51);
        set.add(12);
        set.add(67);
        set.add(36);

        System.out.println(set);
        System.out.println("Reverse set: " +  set.descendingSet());
        /*System.out.println("Highest value: " + set.pollLast());
        System.out.println("Lowest value: " +  set.pollFirst());*/

    }
}
