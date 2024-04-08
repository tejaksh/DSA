/*public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int firstUnsortedIndex =1; firstUnsortedIndex<intArray.length; firstUnsortedIndex++ ){
            int newElement = intArray [firstUnsortedIndex];
            int i;
            for(i= firstUnsortedIndex; i>0 && intArray[i-1] > newElement; i--){
                intArray[i] =  intArray[i-1];
            }
            intArray[i] = newElement;

        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    }*/
    ///////////////////////////////////////////////////////////////////////////////////////
    public class InsertionSortDemo {
        public static void main(String[] args) {
            int arr [] = {6,5,2,8,9,4};

            for(int i =1; i<arr.length;i++){
                int key = arr[i];
                int j = i-1;

                while (j>=0 && arr[j] > key){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr [j+1] = key;
            }
            System.out.println("after sorting");
            for(int num :  arr){
                System.out.println(num);
            }
        }
    }