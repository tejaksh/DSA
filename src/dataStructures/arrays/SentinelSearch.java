package dataStructures.arrays;

public class SentinelSearch {
    static void sentinelSearch(int [] arr, int n, int key){
        int last = arr[n-1]; //last element of the array

        //Element to be searched is placed at last index
        arr[n-1] = key; //last element is assigned to key
        int i = 0; //initialize search index at 0

        while (arr[i] != key)
            i++;

        //put the last element back
        arr[n-1] = last;

        if((i < n-1) || (arr[n-1] == key))
            System.out.println(key + " key is present at index: " + i);
        else
            System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int arr [] = {45,23,56,21,78,67,5,90,85};
        int n = arr.length;
        sentinelSearch(arr, n, 56);
    }
}
