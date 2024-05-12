package multithreading;


class ThreadNew extends Thread{
    ThreadNew(String tName, ThreadGroup tGroup){
        super(tGroup, tName);
        start();
    }
    public void run(){
        for(int i = 0; i<100; i++){
            try{
                Thread.sleep(5);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " Thread has finished executing");
    }
}
public class ThreadGroup2 {
    public static void main(String[] args) throws SecurityException, InterruptedException{

        //Creating Thread group
        ThreadGroup tg = new ThreadGroup("Parent Group");
        ThreadGroup tg1 = new ThreadGroup(tg, "Child Group");

        ThreadNew th1 = new ThreadNew("The First", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("The Second", tg);
        System.out.println("starting the second");

        //waiting until the other threads has been finished
        th1.join();
        th2.join();

        //destroying the child thread group
        tg1.destroy();
        System.out.println(tg1.getName() + " is destroyed!");

        //destroying the parent thread group
        tg.destroy();
        System.out.println(tg.getName() + " is destroyed!");
    }
}
