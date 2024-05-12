package multithreading;

/**
Deadlock in Java is a part of Multithreading. Deadlock can occur in a situation when
 a thread is waiting for an object lock, that is acquired by another thread and second thread is waiting for an object lock that is acquired by first thread.
 Since, both threads are waiting for each other to release the lock, the condition is called as Deadlock.
**/

public class Deadlock {
    String s1 = "Hello";
    String s2 = "World";
    Thread t1 = new Thread() {
        public void run() {
            while (true) {
                synchronized (s1) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " locked " + s1);
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                synchronized (s2) {
                    System.out.println(Thread.currentThread().getName() + " locked " + s2);
                    System.out.println(s1 + s2);
                }
            }
        }
    };

    Thread t2 = new Thread() {
        public void run() {
            while (true) {
                synchronized (s2) {
                    System.out.println(Thread.currentThread().getName() + " locked " + s2);
                    synchronized (s1) {
                        System.out.println(Thread.currentThread().getName() + " locked " + s1);
                        System.out.println(s1 + s2);
                    }
                }
            }
        }

        ;
    };

    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();
        deadlock.t1.start();
        deadlock.t2.start();
    }
}

