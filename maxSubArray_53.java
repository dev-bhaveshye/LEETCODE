package LEETCODE;
public class maxSubArray_53 {
    public static int maxsubString(int[] nums){
        int currsum =nums[0];
        int maxsum =nums[0];
        if (nums.length==1){
            return nums[0];
        }
        for(int i=1; i <=nums.length-1;i++){
            if((nums[i]+currsum)>=nums[i]){
                currsum+=nums[i];
            }else{
                currsum=nums[i];
            }
            if(currsum>maxsum){
                maxsum=currsum;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.println(maxsubString(nums));
    }
}
