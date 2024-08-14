package Practice;

import javax.naming.InsufficientResourcesException;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<Integer> sup = () -> 15;

        Stream<Integer> st = Stream.generate(sup).limit(5);

        st.forEach(System.out::println);
    }
}
