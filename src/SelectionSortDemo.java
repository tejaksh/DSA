/*
public class SelectionSortDemo {
    public static void main(String[] args) {
        int [] intArray = {20, 35, -15, 7, 55, 1, -22};
        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for(int i=0; i<lastUnsortedIndex; i++){
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i+1);

                }
            }
        }
        for(int i=0; i< intArray.length; i++){
            System.out.println(intArray[i]);
        }

    }

    public static void swap(int [] array, int i, int j){
        if(i==j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
*/
////////////////////////////////////////////////////////////////////////////////////////////////////

public class SelectionSortDemo {
    public static void main(String[] args) {
        int nums [] = {6,5,2,8,9,4};
        int size = nums.length;
        int temp =0;
        int minIndex = -1;

        System.out.println("before sorting");
        for(int num : nums){
            System.out.println(num + " ");
        }

        for(int i=0; i<size-1; i++){
            minIndex = i;
            for(int j=i+1 ;j<size; j++){
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
                temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }
        //System.out.println();
        System.out.println("after sorting");
        for(int num : nums){
            System.out.println(num);
        }
    }
}

