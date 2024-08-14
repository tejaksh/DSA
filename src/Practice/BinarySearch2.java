package Practice;

public class BinarySearch2 {
    static int binarySearch(int [] arr, int x){
        int low = 0, high = arr.length-1;
        while (low <= high){
            int mid = low + (high - low)/2;

            //check if x is present at mid
            if(arr[mid] == x)
                return mid;

            //if x is greater, ignore left half
            if(arr[mid] < x)
                low = mid + 1;

            //if x is smaller, ignore right half
            else
                high = mid - 1;
        }
        //if we reach here, element is not present
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {45,23,56,21,78,67,5,90,85};
        int n = arr.length;
        int result = binarySearch(arr, 90);
        if(result == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element is present at index: " + result);

    }
}
