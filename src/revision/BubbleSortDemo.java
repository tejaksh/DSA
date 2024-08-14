package revision;

/*
public class BubbleSortDemo {
    public static void main(String[] args) {
        int [] intArray = {20, 35, -15, 7, 55, 1, -22};
        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            int largest = 0;

            for(int i=1; i<=lastUnsortedIndex; i++){
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
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
//////////////////////////////////////////////////////////////////////////////////////////////
public class BubbleSortDemo {
    public static void main(String[] args) {
        int nums [] = {6,5,2,8,9,4};
        int size = nums.length;
        int temp = 0; //to store number for temporary
        System.out.println("Before sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
        for(int i=0; i<size;i++){
            for (int j=0; j<size-1; j++){
                if (nums[j] > nums[j+1]){
                    temp = nums[j]; // assign value of [j] to temp
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After sorting");
        for(int num :  nums){
            System.out.print(num+ " ");
        }
    }
}
