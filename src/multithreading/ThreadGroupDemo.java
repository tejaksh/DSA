package multithreading;

public class ThreadGroupDemo implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName());

        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThreadGroupDemo runnable = new ThreadGroupDemo();
        ThreadGroup tg1 = new ThreadGroup("Parent Thread Group");

        Thread t1 = new Thread(tg1,runnable, "One");
        t1.setPriority(1);
        t1.start();
        Thread t2 = new Thread(tg1, runnable, "Two");
        t2.setPriority(2);
        t2.start();
        Thread t3 = new Thread(tg1, runnable, "Three");
        t3.setPriority(3);
        t3.start();

        System.out.println("Thread Group Name: " + tg1.getName());
        System.out.println("Active Threads: " +  tg1.activeCount());
        tg1.list();
    }
}
