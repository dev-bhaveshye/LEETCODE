package LEETCODE;

public class findPeakElement_162 {
    public static int findPeakElement(int[] nums){
        int start =0;
        int end = nums.length-1;

        if (nums.length == 1) return 0; 
        if(nums[start]>nums[start+1]) return start;
        
        if(nums[end]>nums[end -1]) return end;
        
        start=start+1;
        end=end-1;

        while (start<=end){
            int mid = start + (end - start) / 2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid ;
            }else if(nums[mid+1]>nums[mid]){
                start = mid+1;
            } else {
                end = mid -1 ;
            }
            System.out.println("mid "+mid);
            System.out.println("start "+start);
            System.out.println("end "+end);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,1,4,1,2,1,1,2,1,1};
        System.out.println(findPeakElement(nums));

    }
}
