package Java_8.Streams;

import java.util.stream.Stream;

public class FilterByCustomPropertiesPalindrome {
    public static void filterByCustomProperties(){
        String [] myArray = new String[]{"madam", "hello", "racecar", "abba","please", "refer"};

        //filter using a custom method
        Stream.of(myArray).filter(x -> palindrome(x)).forEach(System.out::println);
    }

    public static boolean palindrome(String s){
        if(s.length() <= 1)
            return true;
        else
            return (s.charAt(0) == s.charAt(s.length()-1)) && palindrome(s.substring(1, s.length()-1));
    }
    public static void main(String[] args) {

        filterByCustomProperties();
    }
}
