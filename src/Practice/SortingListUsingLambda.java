package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SortingListUsingLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("PQR", "ABC", "XYZ", "LMN", "SQRQZQ");

        Predicate<String> startsWith = name -> name.startsWith("S");

        names.stream().filter(startsWith).forEach(System.out::println);
    }
}
