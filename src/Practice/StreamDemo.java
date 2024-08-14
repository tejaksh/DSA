package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(10,20,30,40,50,60);

        Stream<Integer> droppedNums = num.stream().dropWhile(n -> n < 50); //prints values except less than 50
        Stream<Integer> takenNums = num.stream().takeWhile(n -> n < 50); //prints values less than 50

        IntStream intStream = IntStream.range(1,7);
        Stream<Integer> boxedStream = intStream.boxed(); //prints from 1 to 6
        boxedStream.forEach(System.out::println);
        System.out.println();

        droppedNums.forEach(System.out::println);
        System.out.println();
        takenNums.forEach(System.out::println);
    }
}
