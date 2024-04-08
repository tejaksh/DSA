package Java_8.FunctionalInterface;

import javax.swing.plaf.SplitPaneUI;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();
        Supplier randomInt =  () -> (Math.random() *100);
        System.out.println(randomInt.get());

    }
}
