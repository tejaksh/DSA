package multithreading;
/**
Each thread starts in a separate call stack.
Invoking the run() method from the main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack.
There is no context-switching because here t1 and t2 will be treated as normal object not thread object.
**/

public class RunMethod extends Thread {
    public void run(){
        for(int i = 1; i<=5; i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        RunMethod t1 = new RunMethod();
        RunMethod t2 = new RunMethod();

        t1.run();
        t2.run();

    }
}
