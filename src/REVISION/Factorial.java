package REVISION;

public class Factorial {
    public static int calculateFactorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return num * calculateFactorial(num - 1);
        }
    }
    public static void main(String[] args) {
        int number = 5;
        int result = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + result);


    }
}
