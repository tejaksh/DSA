package revision;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String st = sc.nextLine();
        StringBuilder rev = new StringBuilder(st).reverse();
        StringBuffer rev2 = new StringBuffer(st).reverse();
        System.out.println(rev);
        System.out.println(rev2);
    }
}
