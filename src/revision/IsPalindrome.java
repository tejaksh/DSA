package revision;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toLowerCase();
        int length = str.length();
        boolean isPalindrome = true;

        for(int i = 0;  i<length/2; i++){
            if(str.charAt(i) == str.charAt(length-1 - i)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(str);
    }
}
