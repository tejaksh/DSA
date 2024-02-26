package Java_8.OptionalClass;

import java.util.Arrays;
import java.util.Optional;

public class OfNullableDemo {
    public static void main(String[] args) {

        String str [] = new String[5];
        str[2] = "Hello World";
        //Arrays.stream(str).sorted().forEach(System.out::println);
        Optional<String> value = Optional.of(str[2]);

        System.out.println(value.get());
        System.out.println(value.hashCode());
        System.out.println(value.isPresent());

    }
}
