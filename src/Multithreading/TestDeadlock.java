package Multithreading;

public class TestDeadlock {
    public static void main(String[] args) {
        final String s1 = "Hello";
        final String s2 = "World";

        //t1 tries to lock s1 then s2

        Thread t1 = new Thread(){
            public void run(){
                synchronized (s1){
                    System.out.println("Thread 1 : Locked s2");

                    try{
                        Thread.sleep(100);
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    synchronized (s2){
                        System.out.println("Thread 2 : Locked s2");
                    }
                }
            }
        };

        //t2 tries to lock s2 then s1
        Thread t2 = new Thread(){
            public void run(){
                synchronized (s2){
                    System.out.println("Thread 2 : Locked s1");

                    try{
                        Thread.sleep(100);
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    synchronized (s1){
                        System.out.println("Thread 2 : Locked s1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
