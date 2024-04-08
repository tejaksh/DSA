public class MergeSortDemo {
    private static void mergeSort(int [] arr, int l, int r){
        if (l<r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid); //1st divided array which is on left side
            mergeSort(arr, mid+1, r); //2nd divided array which is on right side

            merge(arr, l, mid, r); // l, r & mid represents the index number of an array.
        }
    }
    private static void merge(int []arr, int l, int mid, int r){
        int n1 = mid - l+1;  // as l is zero index thing we need to add +1 & this line is to define the size of an array n1
        int n2= r - mid; // to define size of rArr

        int lArr[] = new int[n1]; // left side divided array
        int rArr[] = new int[n2]; // right side divided array

        for (int x=0; x<n1; x++){ // copy values into left Array
            lArr[x] = arr[l+x];
        }
        for (int x=0; x<n2; x++){ // copy values into right array
            rArr[x] = arr[mid+1+x];
        }
        int i=0; // for 1st array
        int j=0; // for 2nd array
        int k=l;

        while (i<n1 && j<n2){
            if (lArr[i] <= rArr[j]) { //1st element of lArr will be compared with 1st element of rArr
                arr[k] = lArr[i]; //element will be store in arr[k]
                i++;
            }
            else {
                arr[k] = rArr[j];
                j++;

            }
            k++;
        }
        while (i<n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int arr [] = {54,34,234,55,237,845,97,345};
        for (int n : arr){
            System.out.print(n + " ");
        }
        mergeSort(arr, 0, arr.length-1);
        System.out.println();
        System.out.println("After Sorting");
        for (int n : arr){
            System.out.print(n + " ");
        }
    }
}
