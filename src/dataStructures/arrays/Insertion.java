package dataStructures.arrays;

/**
 * Function to insert a given key in the array. This function returns n+1 if insertion is successful, else n.
 */

public class Insertion {
    static int insertSorted(int [] arr, int  n, int key, int capacity){
        /**
         * Cannot insert more elements if n is greater than the array capacity
         */
        if(n >= capacity)
            return n;

        arr[n] = key;
        return (n + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = 20;
<<<<<<< HEAD
        int n = 7;
        int i, key = 28;
=======
        int n = 6;
        int i, key = 26;
>>>>>>> origin/master

        System.out.print("Before Insertion: ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        //Inserting key
        n = insertSorted(arr, n, key, capacity);
        System.out.println();
        System.out.print("After Insertion: ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}
