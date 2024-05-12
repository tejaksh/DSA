package java_8.Lambda;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("royal enfield");
        list.add("yamaha");
        list.add("kawasaki");
        list.add("triumph");

       /* list.replaceAll(String :: toUpperCase); //to UpperCase
        list.forEach(System.out::println);*/

        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
