package LEETCODE;

public class searchRange_34 {
    public static void main(String[] args) {
        int[] nums ={0,0,1,2,2};
        int target =2;

        int First=-1;
        int start=0;
        int end=nums.length-1;
        int mid =0;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                First=mid;
                start=mid+1;
            }else{
                if(target>mid){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }System.out.println(First);

        
        

        
    }
}
