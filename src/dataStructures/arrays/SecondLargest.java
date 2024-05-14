package dataStructures.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargest {
    static void print2largest(Integer [] arr, int arr_size){
        Arrays.sort(arr, Collections.reverseOrder());//sort and reverse an array
        for(int i = 0; i<arr_size; i++){
            if(arr[i] != arr[0]){ //skip first element and get the second element i.e second largest element
                System.out.println("The second largest element is: " + arr[i]);
                return;
            }
        }
        System.out.println("There is no such element!");
    }

    public static void main(String[] args) {
        Integer [] arr = {12,25,21,1,45,2,56,8};
        int n = arr.length;
        print2largest(arr,n);
    }
}
