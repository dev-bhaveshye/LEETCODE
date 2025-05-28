package LEETCODE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class longestConsecutive_128 {

    public static int longestConsecutive(int[] nums){
        // Arrays.sort(nums);
        // int i=0;
        // int count=1;
        // int count1=1;
        // if(nums.length==0){
        //     return 0;
        // }
        // while(i<nums.length-1){
        //     if(nums[i]==nums[i+1]){
        //         i++;
        //         continue;
        //     }
        //     else if(nums[i]+1==nums[i+1]){
        //         count++;
                
        //     }else{
        //         count1=Math.max(count,count1);
        //         count=1;
        //     }
        //     i++;
        // }
        // return Math.max(count,count1);

        // Good approach 

        // -------------------------------------------------------------------------------------


        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<=nums.length-1;i++){
            set.add(nums[i]);
        }
        int max=0;
        
        for (int n : set) {
            if(!set.contains(n-1)){
                int count=1;
                while(set.contains(n+1)){
                    n++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,1,0};
        int longest = longestConsecutive(nums);
        System.out.println(longest);
    }
}
