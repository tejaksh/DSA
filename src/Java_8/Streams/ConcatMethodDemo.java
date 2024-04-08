package Java_8.Streams;

import java.util.stream.Stream;

public class ConcatMethodDemo {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("I", "am", "Batman");
        Stream<String> s2 = Stream.of("I", "am", "Ironman");
        /*Stream.concat(s1, s2).forEach(System.out::println);*/ //print conncatinated stream

        //////////////////////////////////////

        Stream<String> s3 = Stream.of("3");
        Stream<String> s4 = Stream.of("4");
        Stream<String> s5 = Stream.of("5");
        Stream<String> s6 = Stream.of("6");

        Stream.concat(
                Stream.concat(
                        Stream.concat(s6,s5),s4),s3)
                .forEach(System.out::println); //print concatinated stream in reverse order
    }
}
