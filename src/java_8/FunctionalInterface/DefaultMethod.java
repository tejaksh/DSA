package java_8.FunctionalInterface;


interface Test{
    default void show()
    {
        System.out.println("Default");
    }
}
public class DefaultMethod implements Test {
    public static void main(String[] args) {
        DefaultMethod d = new DefaultMethod();
        d.show();
    }
}
