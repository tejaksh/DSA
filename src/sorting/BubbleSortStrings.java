package sorting;

public class BubbleSortStrings {
    public static void main(String[] args) {
        String [] arr = { "GeeksforGeeks", "Quiz", "Practice", "Gblogs", "Coding" };
        int n = arr.length;
        String temp;
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (arr[j].compareTo(arr[i]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
       for(String str : arr){
           System.out.println(str);
       }
    }
}
