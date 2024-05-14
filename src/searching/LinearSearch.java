package searching;

public class LinearSearch {
    public static int search(int arr [], int N, int x){
        for(int i = 0; i<N; i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {2,4,5,6,10};
        int x = 2;

        //Function Call
        int result = search(arr, arr.length, x);
        if(result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index: " + result);
    }
}
