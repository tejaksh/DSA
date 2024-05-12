package java_8.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateChaining {
    public static void main(String[] args) {
        Predicate<Integer> greaterThanTen = (i) -> i>10;

        Predicate<Integer> lowerThanTwenty = (i) -> i<20;

        boolean result1 = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result1);

        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(25);
        System.out.println(result2);
    }
}
