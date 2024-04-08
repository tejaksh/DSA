package Collections;

import java.util.LinkedHashSet;

//maintains insertion order
//non-synchronized
//contains unique elements
public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Five");

        System.out.println(set);
    }
}

