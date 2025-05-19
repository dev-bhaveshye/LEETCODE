package LEETCODE;

import java.util.Arrays;

public class Trap_42 {
    public static int Trap(int[] height){
        int n= height.length;
        int []leftmax = new int[n];
        leftmax[0]=height[0];
        int []rightmax = new int[n];
        rightmax[n-1]=height[n-1];
        for (int i=1;i<=n-1;i++){
            if(height[i]>leftmax[i-1]){
                leftmax[i]=height[i];
            }else{
                leftmax[i]=leftmax[i-1];
            }
        }
        for (int i=n-2;i>=0;i--){
             if(height[i]>rightmax[i+1]){
                rightmax[i]=height[i];
            }else{
                rightmax[i]=rightmax[i+1];
            }
        }
        int minimum=0;
        int sum=0;

        for( int i=0;i<n-1;i++){
            int min = Math.min(leftmax[i], rightmax[i]);
            minimum = min-height[i];
            sum+=minimum;
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] height= {4,2,0,3,2,5};
        System.out.println(Trap(height));
    }
}
