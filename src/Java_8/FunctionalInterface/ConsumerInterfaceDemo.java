package Java_8.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerInterfaceDemo {
    public static void main(String[] args) {
        //consumer to display a number
        Consumer<Integer> display = a -> System.out.println(a);
        //accept 10 to display
        display.accept(10);

        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer> > modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        // Consumer to display a list of numbers
        Consumer<List<Integer> > dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(22);
        list.add(34);

        /*modify.accept(list);
        dispList.accept(list);*/

        modify.andThen(dispList).accept(list); //used andThen() method
    }
}
