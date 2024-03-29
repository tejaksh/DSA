package Java_8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        var stream = list.stream();
        var numbers = stream.sorted().distinct();//sorted() - to sort & distinct() - to remove duplicate
        numbers.forEach(System.out::println);
    }
}
