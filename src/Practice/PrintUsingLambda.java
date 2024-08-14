package Practice;

import java.util.Arrays;
import java.util.List;

public class PrintUsingLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "John");

        names.forEach(name -> System.out.println(name));

        /* using stream api */
        //names.stream().forEach(System.out::println);
    }
}
