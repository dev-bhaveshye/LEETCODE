package LEETCODE;

import java.util.HashMap;

public class pivotIndex_724 {
    public int  pivotIndex_724(int[] nums){

            // for(int i =0;i<=nums.length-1;i++){
            //     int left=0;
            //     int right =0;
            //     for(int j=0;j<i;j++){
            //         left+=nums[j];
            //     }
            //     for(int r=i+1;r<nums.length;r++){
            //         right+=nums[r];
            //     }
            //     if(left==right){
            //         return i;
            //     }else{
            //         continue;
            //     }
            // }

            // return -1;
            int total =0;
            for(int i =0;i<=nums.length-1;i++){
                total+=nums[i];
            }
            int left =0;
            int right =0;
            for(int i=0;i<=nums.length-1;i++){
                right = total -nums[i]-left;
                
                System.out.println(left +" - "+ right);
                if(right==left){
                    return i;
                }
                left +=nums[i];
                
            }
            return -1;
    }
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        pivotIndex_724 pi = new pivotIndex_724();
        int result = pi.pivotIndex_724(nums);  
        System.out.println(result);

    }
}
