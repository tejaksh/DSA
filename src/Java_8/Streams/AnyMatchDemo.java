package Java_8.Streams;

import java.util.Arrays;
import java.util.List;

public class AnyMatchDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,6,9,1,2,5,4,7);

        boolean answer = list
                .stream()
                .anyMatch(n -> n > 10); //checks whether list has any element greater than 10
        System.out.println("answer: " + answer);
//////////////////////////////////////////////////////////////////////////////

        List<Integer> list3 = Arrays.asList(54,34,65,12,98,67,70);
        boolean answer3 = list3.stream().anyMatch(n -> n > 100);
        System.out.println("answer3 : " + answer3);



        //////////////////////////////////////////////////////////////////////////////
        
        List<String> str = Arrays.asList("I", "Am", "Batmam");
        boolean answer2 = str
                .stream()
                .anyMatch(str1 -> Character
                        .isUpperCase(str1.charAt(0))); //checks whether in all Strings is UpperCase letter present at index 0
        System.out.println("answer2: " + answer2);

        ////////////////////////////////////////////////

        List<Integer> ls = Arrays.asList(43,63,82,12,64,34);
        boolean ans = ls.stream().anyMatch(in -> in > 95);
        System.out.println("ans: " + ans);
    }
}
