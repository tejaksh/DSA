package Practice;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(isPrime(number)){
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is not a prime number");
        }
        sc.close();

    }
    public static boolean isPrime(int number){
        if(number <= 1){
            return false; //numbers less than or equal to 1 are not prime
        }
        for(int i = 2; i<=Math.sqrt(number); i++){
            if(number %i ==0){
                return  false; //if divisible by any number then return false
            }
        }
        return true;
    }
}
