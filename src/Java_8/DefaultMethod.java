package Java_8;

interface TestInterface{
    public void square(int a);

    default void show(){
        System.out.println("DEFAULT METHOD EXECUTED");

    }
}
public class DefaultMethod implements  TestInterface{
    public void square(int a) {
        System.out.println(a*a);
    }

    public static void main(String[] args) {
        DefaultMethod d = new DefaultMethod(); //create object for sqaure method
        d.square(5); //call square method

        d.show(); // call show method

    }
}
