package Java_8.Lambda;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsLambdaDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(34);
        list.add(43);
        list.add(78);
        list.add(54);
        list.add(42);

        System.out.println("Before Sorting " + list);

        Collections.sort(list, (o1, o2) -> (o1 > o2) ? -1 :
                (o1 < o2) ? 1 : 0);

        //System.out.println("After Sorting " + list);

        list.stream().sorted(Comparator.reverseOrder());
        System.out.print("After Sorting " + list);
    }
}
