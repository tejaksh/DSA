package Multithreading;


//By extending Thread Class
public class ThreadCreation extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ThreadCreation t1 = new ThreadCreation();
        t1.start();
    }
}
