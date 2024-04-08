package Collections;

import java.util.Collections;
import java.util.HashSet;

//Contains unique elements only
//allows null value
//doesn't maintain insertion order, elements are inserted on basis of their hashcode
//best for search operation
//initial capacity is 16 & load factor is 0.75
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Five");

        System.out.println(set);

        /*for(String s : set){
            System.out.println(s);
        }*/
    }
}
