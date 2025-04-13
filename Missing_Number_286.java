package LEETCODE;

public class Missing_Number_286{
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        int[] nums={5,4,3,1,2,6,8,0};
        for(int i =nums.length-1; i>=0 ;i--){
            sum1 = sum1 +(i+1);
            sum2=sum2+nums[i];
        }
        System.out.println(sum1-sum2);
    }
}