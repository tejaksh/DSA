package dataStructures.arrays;

public class Searching {
    static int search(int [] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                return i;

             return -1;
    }
    public static void main(String[] args) {
        int [] arr = { 12, 34, 10, 6, 40 };
        int key = 34;

        int result = search(arr, key);

        if(result == -1)
            System.out.println("Element is not present in the array");

        else
            System.out.println("Element is present at index: " + result);

    }
}
