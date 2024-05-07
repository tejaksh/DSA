package REVISION;

public class SumOfArray {
    public static void main(String[] args) {
        int [] numbers = {3,24,5,6,45,23};
        int sum = 0;
        for(int number : numbers ){
            sum += number;
        }
        System.out.println(sum);
    }
}
