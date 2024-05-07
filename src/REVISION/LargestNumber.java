package REVISION;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class LargestNumber {
    public static void main(String[] args) {
        int [] numbers = {10,25,4,23,4,2};
        int largest = numbers[0];
        for(int number : numbers){
            if(number > largest){
                largest = number;
            }
        }
        System.out.println(largest);
    }
}
