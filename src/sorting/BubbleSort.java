package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {4,7,1,3};

        //bubble sort
        for(int i = 0; i<arr.length-1; i++){ //outer loop to count number of iterations
            for(int j = 0; j<arr.length-i-1; j++){ //inner loop to count number of swaps
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int nums : arr){
            System.out.print(" " + nums);
        }
    }
}
