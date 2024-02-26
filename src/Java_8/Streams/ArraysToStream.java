package Java_8.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysToStream {
    public static void main(String[] args) {
        int [] arr1 = {6,4,3,8,9};

        //IntStream stm1 = Arrays.stream(arr1); //convert array into stream (method 1)
        ////// OR /////////
        IntStream stm1 = IntStream.of(arr1); // convert array into stream (method 2)
        stm1
                .sorted()
                .forEach(System.out::println);

        double [] arr2 = {2.3, 6.4, 7.5, 8.7, 1.2, 5.1, 7.6};
        //DoubleStream stm2 = Arrays.stream(arr2); //convert array into stream (method 1)
        ////// OR ////////////
        DoubleStream stm2 = DoubleStream.of(arr2); // convert array into stream (method 2)
        stm2
                .sorted()
                .forEach(System.out::println);

        String [] str = {"I", "Am", "Batman"};
        Stream<String> stm3 = Stream.of(str); //convert String array into stream
        stm3
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        List<Integer> int1 = Arrays.asList(32,54,12,56,43,87,32);
        int1
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println); //print in reverse order
    }
}
