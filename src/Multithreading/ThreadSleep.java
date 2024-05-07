package Multithreading;

import org.w3c.dom.ls.LSOutput;

public class ThreadSleep extends Thread {
    public void run(){
        for(int i = 1; i<=5; i++){
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadSleep t1 = new ThreadSleep();
        t1.start();
    }
}
