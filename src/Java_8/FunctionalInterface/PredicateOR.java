package Java_8.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateOR {
    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length() > 15;
        }
    };

    public static void predicate_or(){
        Predicate<String> containsLetterA = p -> p.contains("A");
        String containsA = "AND";
        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
        System.out.println(outcome);
    }
    public static void main(String[] args) {
        predicate_or();
    }
}
