package Java_8.Streams;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        Integer var = list.stream().max(Integer::compare).get();
        Integer min = list.stream().min(Integer::compare).get();
        System.out.println(min);
        System.out.println(var);

       // list.stream().distinct().forEach(System.out::println);

        /*Stream stream = Stream.of("I", "Am", "Batman"); // Stream().of method is used here
        stream.sorted().forEach(System.out::println);

        Stream stream1 = Stream.of(23,52,12,78,45,34); // Stream().of method is used here
        stream1.sorted(Comparator.reverseOrder()).forEach(System.out::println); //sorted in reverse order*/
    }
}
