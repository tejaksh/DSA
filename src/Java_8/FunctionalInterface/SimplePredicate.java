package Java_8.FunctionalInterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class SimplePredicate {
    public static void main(String[] args) {
        Predicate<Integer> lesserThan = i -> (i <10);
        System.out.println(lesserThan.test(18));
    }
}
