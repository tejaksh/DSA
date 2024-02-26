package Java_8.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInterfaceDemo {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        listA.add(12);
        listA.add(23);
        listA.add(34);

        List<Integer> listB = new ArrayList<>();
        listB.add(13);
        listB.add(24);
        listB.add(35);

        BiConsumer<List<Integer>, List<Integer> >
                equals = (list1, list2) ->
        {
            if(list1.size() != list2.size()){
                System.out.println("False");
            }
            else{
                for(int i=0; i<list1.size(); i++)
                    if(list1.get(i) != list2.get(i)){
                        System.out.println("False");
                        return;
                    }
                System.out.println("True");
            }
        };

        //disp method to print both lists
        BiConsumer<List<Integer>, List<Integer>> disp = (list1, list2) ->
        {
            list1.stream().forEach(a -> System.out.print(a + " "));
            System.out.println();
            list2.stream().forEach(a -> System.out.print(a + " "));
            System.out.println();
        };
        /*equals.accept(listA, listB);*/

        //andThen() method is used
        equals.andThen(disp).accept(listA, listB);
    }
}
