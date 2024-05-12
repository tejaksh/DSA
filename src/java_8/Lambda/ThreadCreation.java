package java_8.Lambda;

public class ThreadCreation {
    public static void main(String[] args) {

        Runnable myThread = () -> {

            Thread.currentThread().setName("myThread");
            System.out.println(Thread.currentThread().getName());
        };
        Thread run = new Thread(myThread);
        run.start();
    }
}
