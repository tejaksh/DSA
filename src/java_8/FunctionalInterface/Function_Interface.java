package java_8.FunctionalInterface;

import java.util.function.Function;

public class Function_Interface {
    public static void main(String[] args) {

        //apply()
        Function<Integer, Double> half = a -> a/2.0;
        System.out.println(half.apply(10));

        //andThen()
        Function<Integer, Double> half1 = a -> a/2.0;
        half1 = half1.andThen(a -> 3 * a);
        System.out.println(half1.apply(10));

        //compose()
        Function<Integer, Double> half2 = a -> a/2.0;
        half2 = half2.compose(a -> 3 * a);
        System.out.println(half2.apply(10));

        //identity()
        Function<Double, Double> i = Function.identity();
        System.out.println(i.apply(10.0));
    }
}
