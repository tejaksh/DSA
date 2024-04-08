package Java_8.Lambda;


interface Test{
    void print(Integer i1, String s1);
}

public class MultiParametersDemo {

    static void fun(Test t, Integer i1, String s1){
        t.print(i1,s1);
    }
    public static void main(String[] args) {

        fun((i1,s1) -> System.out.println(i1 + " " + s1), 10, "Hello");
    }
}
