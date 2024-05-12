package java_8.OptionalClass;

import java.util.Optional;

public class IfPresentOrElse {
    public static void main(String[] args) {
        //Optional<Integer> i = Optional.of(7880);
        Optional<Integer> i = Optional.empty();

        System.out.println("Optional " + i);

        try{
            System.out.println("Value by OrElseGet " + "(Supplier Methood)" + i.orElseGet(() -> (int)(Math.random())));
        }
        catch (Exception e){
            System.out.println(e);

        }
    }
}
