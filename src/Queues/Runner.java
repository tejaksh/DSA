package Queues;

public class Runner {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(4);
        q.enQueue(3);
        q.enQueue(2);
        q.enQueue(1);

        q.show();

        q.deQueue();
        q.show();

        q.enQueue(9);
        q.show();

        q.deQueue();
        q.show();

        q.enQueue(10);
        q.show();
    }
}
