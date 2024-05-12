package arrayListDemo;

import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Pasta");
        bakeryList.add("Donut");
        bakeryList.add("Garlic Bread");

        ArrayList<String> productList = new ArrayList<String>();
        productList.add("Tomatoes");
        productList.add("Onions");
        productList.add("Cheese");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("Soda");
        drinksList.add("Coffee");
        drinksList.add("Lemonade");

        groceryList.add(bakeryList);
        groceryList.add(productList);
        groceryList.add(drinksList);

        //System.out.println(groceryList.get(0).get(0)+" "+" " +groceryList.get(1).get(1)); // this will give 1st item from 1st list & 2nd item from 2nd list
        /*for(int i=0; i<groceryList.size();i++){
            System.out.println(groceryList.get(i));*/
            groceryList.forEach(System.out::println); //Method Reference is used here
        //}
    }
}
