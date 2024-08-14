package Practice;

public class Pattern2 {
    public static void main(String[] args) {
        int rows = 7;
        for(int i = 1; i<=rows; i++){
            int num = 1;
            for(int j =0;j<i;j++ ){
                System.out.print(num + " ");
                num +=2;
            }
            System.out.println();
        }
    }
}
