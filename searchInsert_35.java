package LEETCODE ;
public class searchInsert_35 {

    public static int searchInsert(int[] nums,int target ){
        int start =0;
        int end =nums.length-1;
        int index =-1;
        int mid =0;
        while (start<=end){
            mid = (start+end)/2;
            if (nums[mid]==target){
                return mid ;
            }else if(nums[mid]<target){
                start = mid +1;
            }else{
                end = mid -1 ;
            }



        }
        System.out.println(mid);
        if(target <nums[mid]){
            return mid;
        }else{
            return mid+1;
        }
    }
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,7,8};
        int target =6;
        System.out.println(searchInsert(nums,target));
    }
    
}
