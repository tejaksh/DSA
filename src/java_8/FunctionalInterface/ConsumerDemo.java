package java_8.FunctionalInterface;


import java.util.ArrayList;
import java.util.List;

public class ConsumerDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(12);
        list.add(33);
        list.add(52);
        list.add(78);

        //int result = list.stream().mapToInt(Integer::intValue).sum();
        //System.out.println(result);

        int result = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum is: " + result);

    }
}
