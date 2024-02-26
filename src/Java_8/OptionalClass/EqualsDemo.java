package Java_8.OptionalClass;

import java.util.Optional;

public class EqualsDemo {
    public static void main(String[] args) {

        Optional<String> s1 = Optional.of("Hello");

        Optional<String> s2 = Optional.of("Hi");

        System.out.println(s1.equals(s2)); //print 'false'


    }
}
