package stacks;

public class StackDemo2 {
    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        stack[top] = data;
        top++;
    }
    public void show(){
        for (int i : stack){
            System.out.println(i + " ");
        }
    }
}

