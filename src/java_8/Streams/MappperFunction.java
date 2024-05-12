package java_8.Streams;

import java.util.List;

public class MappperFunction {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,3,4,5,6,7,8,9,10,2,3);

        list
                .stream()
                .map(element -> element * element)
                .sorted()
                .distinct()
                .forEach(element -> System.out.print(element + " "));
                //.forEach(System.out::println);
    }
}
