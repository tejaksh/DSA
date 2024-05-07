package Java_8.OptionalClass;

import java.util.Optional;

public class FilterDemo {
    public static void main(String[] args) {
        Integer [] in = {21,43,56,75,78,80,32,45};

        Optional<Integer> value = Optional.of(57);

        System.out.println(value);

        //System.out.println(value.filter(num -> num % 2 ==0));

    }
}
