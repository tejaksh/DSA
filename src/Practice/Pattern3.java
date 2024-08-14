package Practice;

public class Pattern3 {
    public static void main(String[] args) {
        int rows = 3;
        for(int i = 1; i<=rows;i++){
            //print leading spaces
            for(int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
