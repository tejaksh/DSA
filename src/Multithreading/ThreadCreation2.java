package Multithreading;

//By implementing Runnable Interface
public class ThreadCreation2 implements Runnable{
    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ThreadCreation2 tc2 = new ThreadCreation2();
        Thread t1 = new Thread(tc2); //Using the constructor Thread(Runnable r)
        t1.start();
    }
}
