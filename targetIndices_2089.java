package LEETCODE;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class targetIndices_2089 {

    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for (int i=0;i<=nums.length-1;i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
        return list;
    }

    //  List<Integer> list=new ArrayList<>();
    //     int count=0, lessthan=0;
    //     for(int n:nums){
    //         if(n==target) count++;
    //         if(n<target) lessthan++;
    //     }

    //     for(int i=0;i<count;i++){
    //         list.add(lessthan++);
    //     }
    //     return list;

    // }
    
    public static void main(String[] args) {
        int[] nums = {2,6,8,4,9,4};
        int target = 4;
        targetIndices_2089 tg = new targetIndices_2089();
        System.out.println(tg.targetIndices(nums,target));
    }
}
