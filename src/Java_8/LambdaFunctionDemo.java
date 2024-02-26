package Java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class LambdaFunctionDemo {

    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
        list.add(150);
        list.add(260);
        list.add(30);
        list.add(480);
        list.add(350);
        System.out.println("Before Sorting " + list);

        //lambda expression for sorting in place of comparator object
        Collections.sort(list, (p1,p2) -> (p1<p2) ? -1 : (p1>p2) ? 1 : 0);
        System.out.println("After Sorting " + list);

        }
    }

