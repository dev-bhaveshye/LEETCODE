package LEETCODE;
public class TwoSum_1{
    public static void main(String[] args){
        int[] nums= {3,3};
        int target=6;
        int[] ans=new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;i++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}