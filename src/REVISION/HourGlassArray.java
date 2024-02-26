package REVISION;

import java.util.Scanner;

public class HourGlassArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] h = new int[6][6]; //declare 2D array 6x6
        for(int i=0; i<6;i++) //increment row till 6
            for(int j=0;j<6;++j) //increment column till 6
                h[i][j] = sc.nextInt(); //scan values of 'i' & 'j' for array

                int max = -100000;
                for(int i=0; i<=3; ++i){
                    for (int j=0; j<=3;++j){
                        int sum = h[i][j] + h[i][j+1] + h[i][j+2] + h[i+1][j+1] + h[i+2][j] + h[i+2][j+1] + h[i+2][j+2];
                        if(sum>max){
                            max = sum;
                        }
                    }
                    System.out.println(max);
                }
            }
        }