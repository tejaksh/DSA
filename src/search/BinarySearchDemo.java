package search;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};
        System.out.println(iterativeBinarySearch(intArray, 55));
    }

    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            System.out.println("Midpoint " + midpoint); //1st midpoint will always be 3
            if (input[midpoint] == value) { //if midpoint matches the value then return the midpoint
                return midpoint;
            } else if (input[midpoint] < value) { //if midpoint is less than the value then search the right part of the array
                start = midpoint + 1; //start point will be midpoint+1 & end point will remain same
            } else { // if midpoint is higher than the value then search the left part of the array
                end = midpoint; //start point will remain same but midpoint will become end point
            }
        }
        return -1; //if value is not present in the array then return -1
    }
}

