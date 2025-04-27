package LEETCODE;

public class singleNonDuplicate_540 {
    
    public static int singleNonDuplicate(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }else if(nums[0]!=nums[1]){
            return nums[0];
        }else if (nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = (start +end )/2;
            if(mid<nums.length && mid>0 &&nums[mid-1]!=nums[mid] && nums[mid+1]!=nums[mid]){
                return nums[mid];
            }else if (mid % 2 == 0 && nums[mid] == nums[mid + 1] ||mid %2 != 0 && nums[mid]== nums[mid-1]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] nums={1,1,2,2,3,3,4,4,5,6,6};
        System.out.println(singleNonDuplicate(nums));
    }
}
