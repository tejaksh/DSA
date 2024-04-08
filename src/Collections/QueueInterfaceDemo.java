package Collections;

//elements are processed in FIFO for insertion and deletion
//not thread safe, PriorityBlockingQueue can be used for thread safety

import java.util.PriorityQueue;

public class QueueInterfaceDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");

        System.out.println("Initial Queue: " + queue);
        System.out.println("Head element: " + queue.element());
        queue.peek(); //used to retrieve, but does not remove the head of the queue, or returns null if this queue is empty.
        queue.poll(); //used to retrieve and removes the head of the queue, or returns null if this queue is empty.
        queue.remove(); //used to retrieve and removes the head of the queue
        System.out.println(queue);
    }
}
