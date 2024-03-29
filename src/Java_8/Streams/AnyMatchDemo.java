package Java_8.Streams;

import java.util.Arrays;
import java.util.List;

public class AnyMatchDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,6,9,1,2,5,4,7);

        boolean answer = list
                .stream()
                .anyMatch(n -> n > 10); //checks whether list has any element greater than 10
        System.out.println(answer);
//////////////////////////////////////////////////////////////////////////////
        
        List<String> str = Arrays.asList("I", "Am", "Batmam");
        boolean answer2 = str
                .stream()
                .anyMatch(str1 -> Character
                        .isUpperCase(str1.charAt(0))); //checks whether in all Strings is UpperCase letter present at index 0
        System.out.println(answer2);
    }
}
