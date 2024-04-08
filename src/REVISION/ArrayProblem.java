package REVISION;

import java.util.Scanner;

public class ArrayProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //enter size of an array
        int [] a = new int[n]; // declare array with size 'n'
        for (int i=0; i<n; i++){ //increment array size till 'n' times from '0' to 'n'
            int val = sc.nextInt(); //to store array values
            a[i] = val; //assign array values to 'val'
        }
        sc.close();
        for(int i=0; i<a.length; i++){ //for-loop to print array
            System.out.println(a[i]); // print array a[i]
        }
    }
}
