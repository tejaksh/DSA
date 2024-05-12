package java_8.Lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {

        TreeSet<Integer> h = new TreeSet<Integer>(); //TreeSet allows auto sorting in ascending order

        h.add(850);
        h.add(235);
        h.add(1080);
        h.add(15);
        h.add(5);

        h.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println); //print TreeSet in reverse order

        //////////////////////////////////////////////////////////////////////

        TreeSet<String> ts=new TreeSet<String>();

        // Add elements to the Treeset
        ts.add("E");
        ts.add("D");
        ts.add("G");
        ts.add("B");
        ts.add("A");
        ts.add("F");
        ts.add("C");

       /* //Display the elements .
        for(String element : ts)
            System.out.println(element + "");

        System.out.println();*/

        ts.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
