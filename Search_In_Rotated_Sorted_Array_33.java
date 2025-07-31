package DSA.HackWithInfy.Binary_Search;

public class Search_In_Rotated_Sorted_Array_33 {
    public static void main(String[] args){

        int[] nums = {3,1};
        int target = 1;
        int left = 0;
        int right = nums.length-1;
        
        while(left<=right){

            int mid = (left+right)/2;
            if(nums[mid]== target){
                System.out.println(mid);
                break;
            }

            if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target <nums[mid]){
                    right = mid;
                }else{
                    left = mid+1;
                }
            }else{
                if(target>nums[mid] && target<=nums[right]){
                    left = mid+1;
                }else{
                    right = mid;
                }
            }

        }
        System.out.println(-1);
    }
}
