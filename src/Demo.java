import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(54);
        list.add(14);
        list.add(57);
        list.add(24);
        list.add(56);


        list.stream().sorted().forEach(System.out::println);
        int min = list.stream().reduce(Integer.MAX_VALUE, Integer::min);
        int max = list.stream().reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);


    }
}




