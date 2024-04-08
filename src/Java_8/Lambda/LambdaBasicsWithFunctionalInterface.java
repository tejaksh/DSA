package Java_8.Lambda;

import javax.sound.midi.Soundbank;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaBasicsWithFunctionalInterface {
    public static void main(String[] args) {

        //Supplier
        Supplier<String> supplier = () -> {
            System.out.println("Inside supplier block");
            return "Hello Supplier";
        };
        String string = supplier.get();
        System.out.println(string);

        //Consumer
        Consumer<String> consumer = (String s) -> {
            System.out.println("Inside consumer block");
            System.out.println(s);
        };
        consumer.accept("Hello Consumer");
    }
}
