package multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable{
    private String taskName;

    //Parameterized constructor for class Tasks
    public Tasks(String str){
        //Initiate field taskName
        taskName = str;
    }
    //Printing the task name and then sleeps for 1 sec
    //The complete process is getting repeated 5 times
    public void run(){
        try{
            for(int i = 0; i<=5; i++){
                if(i==0){
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization time of tasks: " + taskName + " " + sdf.format(dt) );
                }
                else{
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization time of tasks: " + taskName + " " + sdf.format(dt) );
                }
                Thread.sleep(1000);
            }
            System.out.println(taskName + " is completed");
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

public class ThreadPool {
    static final int MAX_TH = 3; //max  number of threads in pool
    public static void main(String[] args) {

        //Creating 5 new tasks
        Runnable r1 = new Tasks("Task 1");
        Runnable r2 = new Tasks("Task 2");
        Runnable r3 = new Tasks("Task 3");
        Runnable r4 = new Tasks("Task 4");
        Runnable r5 = new Tasks("Task 5");

        //creating a thread pool with MAX_TH size
        //thread size in pool is fixed
        ExecutorService pl = Executors.newFixedThreadPool(MAX_TH);

        pl.execute(r1); //passes the Task objects to the pool to execute
        pl.execute(r2);
        pl.execute(r3);
        pl.execute(r4);
        pl.execute(r5);

        pl.shutdown(); //shutdown the thread pool
    }
}
