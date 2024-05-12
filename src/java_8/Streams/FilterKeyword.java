package java_8.Streams;

import java.util.stream.Stream;

public class FilterKeyword {
    public static void main(String[] args) {
        Stream<String> str = Stream.of("This", "Is", "Sparta");

        str.filter(s -> Character.isUpperCase(s.charAt(0)))
                .forEach(System.out::println);
        }
    }

