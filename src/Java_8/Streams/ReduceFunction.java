package Java_8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceFunction {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        List<Integer> even
                = list.stream().reduce(new ArrayList<Integer>(),
                (a, b)
                        -> {
                    if (b * 2 >= 10)
                        a.add(b);
                    return a;
                },
                (a, b) -> {
                    a.addAll(b);
                    return a;
                });
        System.out.println(even);
    }
}
