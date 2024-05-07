package REVISION;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
         str = str.toLowerCase();
         if(isPalindrome(str))
             System.out.println("Yes, it is palindrome");
         else
             System.out.println("Not a palindrome");
    }
    public static boolean isPalindrome(String str){
        int i=0;
        int j= str.length()-1;
        while (i<j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
