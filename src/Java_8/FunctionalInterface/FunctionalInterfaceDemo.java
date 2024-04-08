package Java_8.FunctionalInterface;

import java.util.Scanner;

public class FunctionalInterfaceDemo {
    @FunctionalInterface
    interface Square{
        int calculate(int x);
    }
    interface Cube{
        int calculate(int y);
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            //lambda expression to define the calculate method
            Square s = (int x) -> x * x;

            Cube q = (int y) -> y * y * y;

            //parameter passed and return type must be same as defined in the prototype
            int ans1 = s.calculate(a);
            int ans2 = q.calculate(b);
            System.out.println(ans1);
            System.out.println(ans2);
        }
    }
