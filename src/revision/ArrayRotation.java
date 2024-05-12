package revision;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //size of array
        int d = sc.nextInt(); //number of rotations
        int [] a = new int[n]; //define an array of size 'n'2
        int [] newArray = new int[n]; //rotated array

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt(); //scan for first array
        }
        for(int i=0; i<n;i++){
            int index = ((n+i-d)%n); //logic for left rotation
            newArray[index] = a[i]; //assign the value of rotated array i.e. array 'a' to newArray[i]
        }
        for(int i=0; i<n;i++){
            System.out.print(newArray[i] + " "); //print newArray[i]
        }
    }
}
