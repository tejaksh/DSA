package dataStructures.arrays;

public class BinarySortSearch {
    static void buubleSort(int [] arr, int n){
        int i, j, temp;
        boolean swapped;
        for(i = 0; i<n-1; i++){
            swapped=false;
            for(j = 0; j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped=true;
                }
            }
            if(swapped == false)
                break;
        }
    }
    static int binarySearch(int [] arr, int key){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == key)
                return mid;
            if(arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {45,23,56,21,78,67,5,90,85};
        int n = arr.length;
        buubleSort(arr, n);
        int result = binarySearch(arr, 21);
        if(result == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index: " + result);
        }
    }
