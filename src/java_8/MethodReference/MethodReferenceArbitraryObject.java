package java_8.MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceArbitraryObject {
    public static void main(String[] args) {

        // Creating an empty ArrayList of user defined type 'String'
        // List of person
        List<String> personList = new ArrayList<>();

        //add elements to the list using add() method
        personList.add("Thor");
        personList.add("Captain");
        personList.add("Hulk");

        //method reference to String Type
        Collections.sort(personList, String::compareToIgnoreCase);
        personList.forEach(System.out::println); //method reference used here
    }
}
