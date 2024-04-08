package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

//works on LIFO and FIFO operation
//Unlike Queue, we can add or remove elements from both sides.
//null elements are not allowed
//ArrayDeque is not thread safe, in the absence of external synchronization.
//ArrayDeque is faster than LinkedList and Stack.
public class ArrayDequeDemo {
    public static void main(String[] args) {
        //Creating deque
        Deque<String> deque = new ArrayDeque<>();
        deque.add("One");
        deque.add("Two");
        deque.add("Three");
        deque.add("Four");
        deque.add("Five");

        System.out.println("Initial deque: " + deque + " " + " " + "head: " + deque.element());

        deque.offerFirst("Zero"); //adds element at the front of queue
        deque.offerLast("Seven"); //adds element at the end of queue

        System.out.println("After adding elements: " + deque);
        System.out.println("First Element: " + deque.peekFirst() + " " + "& " + "Last Element: " + deque.peekLast());//used to retrieve, but does not remove the first and last element of the queue

        deque.pollFirst();//retrieve and removes the First element of the queue
        deque.pollLast();//retrieve and removes the Last element of the queue

        System.out.println("After poll operation: " + deque);
    }
}
