package arrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleArrayList {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Pasta");
        food.add("Fries");
        food.add("Burger");
        food.add("Hot Dog");

        food.set(0, "Misal");
        food.remove(2); //fries removed
        food.isEmpty();
        food.clone();

        /*for(int i=0; i< food.size(); i++){ //for loop
            System.out.println(food.get(i));*/

        Collections.reverse(food); //print list in reverse order

            for (String s : food) { //for-each loop
                System.out.println(s);
            }
    }
}
