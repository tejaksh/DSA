package java_8.OptionalClass;

import java.util.Optional;

public class OrElseGet {
    public static void main(String[] args) {
        Optional<Integer> op = Optional.empty();

        System.out.println("Optional " + op);

        try {

            // orElseGet supplier
            System.out.println("Value by orElseGet"
                    + "(Supplier) method: "
                    + op.orElseGet(
                    () -> (int)(Math.random() * 10)));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
