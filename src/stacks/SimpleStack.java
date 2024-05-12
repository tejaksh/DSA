package stacks;

import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("COD");
        stack.push("GTA");
        stack.push("GOW");
        stack.push("MOH");
        stack.push("WWE");

        System.out.println("Before Popping " + stack);

        String myFavGame = stack.pop();
        System.out.println("My Fav Game is " + myFavGame);
        System.out.println("After Popping " + stack);
        System.out.println(stack.search("GTA"));
    }
}
