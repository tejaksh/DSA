package Practice;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestNumber {
    static void printSecondLargest(Integer[]arr, int arr_size){
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i<arr_size; i++){
            if(arr[i] != arr[0]){
                System.out.println("Second largest element: " +  arr[i]);
                return;
            }
        }
        System.out.println("There is no such element");

    }

    public static void main(String[] args) {
        Integer [] arr = {12,25,21,1,45,2,56,8};
        int n = arr.length;
        printSecondLargest(arr, n);
    }
}
