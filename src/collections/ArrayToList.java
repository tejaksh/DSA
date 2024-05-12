package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        //Creating Array
        String [] arr = {"Java", "Python", "C#", "Kotlin", "PHP"};
        System.out.println("Printing array: " + Arrays.toString(arr));

        //Converting Array to List
        List<String> list = new ArrayList<>();
        for(String ls:arr){
            list.add(ls);
        }
        System.out.println("Printing list: " + list);
    }
}
