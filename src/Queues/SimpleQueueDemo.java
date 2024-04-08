package Queues;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Tejas");
        queue.offer("Gaurav");
        queue.offer("Ishan");
        queue.offer("Ishita");

        queue.poll();
        System.out.println(queue.size());
        queue.offer("Ikshit");

        System.out.println(queue);

    }
}
