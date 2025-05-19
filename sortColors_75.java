package LEETCODE;

import java.util.Arrays;

public class sortColors_75 {
    
    public static int[] sortColors(int[] nums) {

        int low =0;
        int mid =0;
        int high = nums.length-1;
        while(mid<=high){
            // if(nums[mid]==0){
            //     swap(nums,low,mid);
            //     low++;
            //     mid++;
            // }else if (nums[mid]==1){
            //     mid++;
            // }else{
            //     swap(nums,mid,high);
            //     high--;
            // }
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if (nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else{
                mid++;
            }

        }

        return nums;

    }
    public static void swap(int[] nums , int i , int j ){
        int k = nums[i];
        nums[i]=nums[j];
        nums[j]=k;

        
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,1,2,1,2,2,0,0,0,0,1};
        System.out.println(Arrays.toString(sortColors(nums)));
    }
    
}
