package Java_8.Lambda;

import java.util.function.Consumer;

public class ChainingLambdas {
    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println("c1 consumes " + s);
        Consumer<String> c2 = s -> System.out.println("c2 consumes " + s);

        c1.accept("Hello");
        c2.accept("World");

        Consumer<String> c3 =  c2.andThen(c1);
    }
}
