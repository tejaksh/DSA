package Java_8.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortedKeyword {
    public static void main(String[] args) {
        int [] arr = {5,-23,65,-5,34,-1,0};
        List<String> str = List.of("My", "Name", "Is", "Maximus", "Decimus", "Meridius");

        IntStream stm1 = IntStream.of(arr);
        //stm1.sorted().forEach(System.out::println);

        str.stream().sorted().forEach(System.out::println);

    }
}
