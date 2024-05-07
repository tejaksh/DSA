public class Pattern {
    public static void main(String[] args) {
        int i,j,n=20;
        for(i=0; i<=n;i++){
            for(j=0;j<2;j++){
                if(i<3){
                    if(i==j)
                        System.out.println("*");
                    else System.out.println(" ");
                }
                else if (i%4==0 && j==0)
                    System.out.println("*");
                else if(i%4==0 && j==2)
                    System.out.println(" ");
                else if (i%2==0 && j==0)
                    System.out.println(" ");
                else if((i+j)%2==0)
                    System.out.println("*");
                else
                    System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}
