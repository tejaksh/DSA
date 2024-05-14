package recursion;

/**
  returntype methodname(){
  //code to be executed
  methodname();//calling same method
  }
 **/

public class Demo {
    static int count = 0;

    static void p() {
        count++;
        if (count <= 5) {
            System.out.println("Hello " + count);
            p();
        }
    }

    public static void main(String[] args) {
        p();

    }
}