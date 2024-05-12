package collections;

import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        //Creating List
        List<String> list = Arrays.asList("Java", "Python", "C#", "Kotlin", "PHP");
        System.out.println("Printing list: " + list);

        //Converting ArrayList to Array
        String [] arr = list.toArray(new String[list.size()]);
        System.out.println("Printing array: " + Arrays.toString(arr));
    }
}
