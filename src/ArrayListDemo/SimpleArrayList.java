package ArrayListDemo;

import java.util.ArrayList;

public class SimpleArrayList {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Pasta");
        food.add("Fries");
        food.add("Burger");
        food.add("Hot Dog");

        food.set(0, "Misal");
        food.remove(2);
        food.clone();

        for(int i=0; i< food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
