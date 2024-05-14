package dataStructures.arrays;

public class LinearSearch {
    public static int search(int [] arr, int key){
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {45,23,56,21,78,67,5,90,85};
        //int key = 67;
        int result = search(arr, 23);
        if(result == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index: " + result);
    }
}
