package LEETCODE;

import java.util.Arrays;

public class numRescueBoats_881 {
    public static int numRescueBoats_881(int[] nums , int limit){
        Arrays.sort(nums);
        int start =0;
        int end = nums.length-1;
        int count = 0;
    while(start<=end){
            if(nums[end]+nums[start]<=limit){  
                end--;
                start++;
                
            }
            else{
                end--;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={3,2,2,1};
        int limit= 3;
        System.out.println(numRescueBoats_881(nums,3));
    }
}
