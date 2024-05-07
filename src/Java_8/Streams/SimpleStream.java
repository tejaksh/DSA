package Java_8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStream {
    public static void main(String[] args) {
        /*List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(6);

        //getting the stream from this collection
        //filtering out only even elements
        //collecting the required elements to list
        List<Integer> ls = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(ls);*/

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(45);
        marks.add(16);
        marks.add(76);
        marks.add(53);
        marks.add(35);

        List<Integer> ls = marks.stream().map(i -> i + 5).collect(Collectors.toList());
        System.out.println("After updating marks: " + ls);

        ArrayList<String> list = new ArrayList<>();
        list.add("Harley Davidson");
        list.add("Yamaha");
        list.add("Kawasaki");
        list.add("Honda");
        list.add("Ducati");

        //list.stream().sorted().forEach(System.out::println); //method reference is used here
        //list.stream().filter(x -> x.endsWith("a")).forEach(System.out::println);

        //filter by object properties (String object)
        String [] myArray = "My name is Optimus Prime".split(" ");
        Stream<String> myStream = Stream.of(myArray);
        //myStream.filter(x -> x.matches("(a|e|i|o|u)\\w*")).forEach(System.out::println); //print only vowels

        AtomicInteger i  = new AtomicInteger(0);
        myStream.filter(x -> i.getAndIncrement() % 2 ==0).forEach(System.out::println); //print only even indexed words
    }
}
