package searching;

/**
 * Step 1: Traverse the array
 * Step 2: Match the key element with array element
 * Step 3: If key element is found, return the index position of the array element
 * Step 4: If key element is not found, return -1
 **/

public class LinearSearch2 {
    public static int search(int [] arr, int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key)
                return i; //if key element is found, return the index of the array element
        }
        return -1; //if key element is not found, return -1
    }

    public static void main(String[] args) {
        int [] arr = {34,32,56,4,25,78,2};
        int key = 32;

        int result = search(arr, key);
        if(result == -1){
            System.out.println("Element is not present in the array");
        }
        else{
            System.out.println("Element is present at index: " + result);
        }
    }
}
