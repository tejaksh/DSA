package java_8.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateItems {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34, 13);

      list.stream()
              .filter(i -> Collections.frequency(list,i)>1)
              .collect(Collectors.toSet())
              .forEach(System.out::println);
    }
}
