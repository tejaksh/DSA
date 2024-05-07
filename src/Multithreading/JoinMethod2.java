package Multithreading;

public class JoinMethod2 extends Thread{
    public void run(){
        for(int i = 0; i<=5; i++){
            try{
                Thread.sleep(500);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        JoinMethod2 t1 = new JoinMethod2();
        JoinMethod2 t2 = new JoinMethod2();
        JoinMethod2 t3 = new JoinMethod2();

        t1.start();
        try{
            t1.join();
            System.out.println("Current Thread: " +  Thread.currentThread().getName());
        }
        catch (Exception e){
            System.out.println(e);
        }

        t3.start();
        try{
            t3.join();
            System.out.println("Current Thread: " +  Thread.currentThread().getName());
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
        System.out.println("Current Thread: " + Thread.currentThread().getName());
    }
}
