package Java_8;

import java.util.ArrayList;

public class MaxSalary {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34000);
        list.add(21000);
        list.add(45986);
        list.add(34221);
        list.add(56875);
        list.add(34542);

        Integer var = list.stream().max(Integer::compare).get();
        System.out.println(var);
        //list.stream().map(list::getSalary).max(Integer::Compare).get();
        //list.stream().max(Integer::comparator).get();
    }
}
