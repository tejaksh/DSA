package multithreading;

class JoinMethodDemo extends Thread
{
    public void run() {
        for (int j = 0; j < 2; j++) {
            try {
                //sleeping the thread for 300ms
                Thread.sleep(300);
                System.out.println("Current Thread: " + Thread.currentThread().getName());
            }
            //catch the raised exception
            catch (Exception e) {
                System.out.println("The exception has been caught " + e);
            }
            System.out.println(j);
        }
    }
    }
    public class JoinMethod {
        public static void main(String[] args) {
            JoinMethodDemo t1 = new JoinMethodDemo();
            JoinMethodDemo t2 = new JoinMethodDemo();
            JoinMethodDemo t3 = new JoinMethodDemo();

            //thread t1 starts
            t1.start();

            //starting the second thread after when the first thread t1 has ended or died
            try {
                System.out.println("Current Thread: " + Thread.currentThread().getName());

                t1.join();
            } catch (Exception e) {
                System.out.println("Exception Caught" + e);
            }
            t2.start();

            try {
                System.out.println("Current Thread: " + Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println("Exception Caught" + e);
            }
            t3.start();
        }
}
