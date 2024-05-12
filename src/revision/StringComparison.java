package revision;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        //System.out.println(a.length() + b.length());
        System.out.println(a.compareTo(b)>0 ? "Yes" : "No");
        System.out.println(Character.toUpperCase(a.charAt(0)) + a.substring(1) + " " + Character.toUpperCase(b.charAt(0)) + b.substring(1));
    }
}
