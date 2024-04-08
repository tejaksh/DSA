package Collections;

import java.util.TreeSet;

//contains only unique elements
//doesn't allow null elements
//maintains ascending order
//access and retrieval time is fast

public class TreeSetDemo {
    public static void main(String[] args) {
        //Creating TreeSet
        TreeSet<String> tr = new TreeSet<>();
        tr.add("pqr");
        tr.add("xyz");
        tr.add("abc");
        tr.add("pqr"); //this will not print as TreeSet has unique elements

        //tr.stream().forEach(System.out::println);
        System.out.println(tr);

    }
}
