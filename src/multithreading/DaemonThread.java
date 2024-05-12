package multithreading;

public class DaemonThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread");
        }
        else{
            System.out.println("User Thread");
        }
    }
    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread();
        DaemonThread t2 = new DaemonThread();
        DaemonThread t3 = new DaemonThread();

        t1.start();
        t2.start();
        t3.setDaemon(true);
        /**
         setDaemon() method should be called before Thread.start() method,
         otherwise it will throw IllegalThreadStateException
         * **/
        t3.start();
    }
}
