package dataStructures.arrays;

public class LargestThree {
    static void printLargestThree(int[]arr, int arr_size){
        int i, first, second, third;
        /** There should be atleast 3 elements **/
        if(arr_size < 3){
            System.out.println("Invalid input");
            return;
        }
        third = first = second = Integer.MIN_VALUE;
        for(i = 0; i<arr_size; i++){
            /** If current element is greater than first **/
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            /** if arr[i] is in between first and second then update second **/
            else if(arr[i] > second) {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third){
                third = arr[i];
            }
        }
        System.out.println("Three largest elements are: " + first + " " + second + " " + third);
    }

    public static void main(String[] args) {
        int [] arr = {12,43,48,32,89,5,26};
        int n = arr.length;
        printLargestThree(arr, n);
    }
}
