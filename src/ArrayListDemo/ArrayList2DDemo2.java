package ArrayListDemo;

import javax.swing.*;
import java.util.ArrayList;

public class ArrayList2DDemo2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> bike = new ArrayList<>();

        ArrayList<String> engine = new ArrayList<>();
        engine.add("ECU");
        engine.add("Cylinder");
        engine.add("Transmission");

        ArrayList<String> chasis = new ArrayList<>();
        chasis.add("Frame");
        chasis.add("Forks");
        chasis.add("Swingarm");

        ArrayList<String> body = new ArrayList<>();
        body.add("Tank");
        body.add("Seat");
        body.add("Pegs");

        ArrayList<String> wheels = new ArrayList<>();
        wheels.add("Rims");
        wheels.add("Tyres");
        wheels.add("Mudguards");

        ArrayList<String> electricals = new ArrayList<>();
        electricals.add("Headlight");
        electricals.add("Console");
        electricals.add("Battery");
        electricals.add("Fuse Box");

        bike.add(engine);
        bike.add(chasis);
        bike.add(body);
        bike.add(wheels);
        bike.add(electricals);

        bike.forEach(System.out::println); //Method reference is used here

    }
}
