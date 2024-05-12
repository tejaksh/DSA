package stacks;

import java.util.LinkedList;

public class StacksDemo {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("abceca"));
    }

    public static boolean checkPalindrome(String string){
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringNoPunctutation = new StringBuilder(string.length());
        String lowercase = string.toLowerCase();

        for (int i=0; i<lowercase.length(); i++){
            char c = lowercase.charAt(i);
            if(c>='a' && c<='z'){
                stringNoPunctutation.append(c);
                stack.push(c);
            }
        }
        StringBuilder reversedString = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reversedString.append(stack.pop());
        }

        return reversedString.toString().equals(stringNoPunctutation.toString());
    }
}
