package java_8.Streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(80);
        list.add(89);
        list.add(43);
        list.add(31);
        list.add(89);
        list.add(31);
        list.add(10);

       /* var stream = list.stream();
        var numbers = stream.sorted().distinct();//sorted() - to sort & distinct() - to remove duplicate
        numbers.forEach(System.out::println);*/

        Integer sum = list.stream()
                .collect(Collectors.summingInt(Integer::intValue)); //sum of all integers
        System.out.println(sum);

    }
}
