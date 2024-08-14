package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {

        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(15);

        Consumer<List<Integer>> modifyList = list -> {
            for(int i = 0; i< list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);

        modifyList.andThen(dispList).accept(list);

    }
}
