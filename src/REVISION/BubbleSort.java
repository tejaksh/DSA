package REVISION;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        //int nums [] = {3,45,32,-3,5,78};
        int size = nums.length;
        int temp =0;

        for (int i=0; i<size;i++){
            for (int j=0; j<size-1; j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting: ");
        for(int num : nums){
            System.out.print(" "+num);
        }

    }
}
