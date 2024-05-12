package multithreading.Synchronization;

class Table2{
    synchronized static void printTable(int n){
        for(int i = 1; i<=5; i++){
            System.out.println(n * i);
        }
        try{
            Thread.sleep(500);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class Thread1 extends Thread{
    public void run(){
        Table2.printTable(2);
    }
}
class Thread2 extends Thread{
    public void run(){
        Table2.printTable(5);
    }
}
class Thread3 extends Thread{
    public void run(){
        Table2.printTable(10);
    }
}

public class StaticSynchronization {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.start();
        t2.start();
        t3.start();
    }
}
