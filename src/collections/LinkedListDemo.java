package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<>();
        al.add("Harley Davidson");
        al.add("Triumph");
        al.add("Yamaha");
        al.add("Ducati");

        al.addFirst("Kawasaki"); //addFirst() method is only allowed in LinkedList
        al.addLast("Suzuki"); //addLast() method is only allowed in LinkedList
        Collections.reverse(al);

        for(String str : al){
            System.out.println(str);
        }
    }
}
