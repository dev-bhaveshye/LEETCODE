package LEETCODE;

public class MinRotatedSortedArray_153 {
    public int MinRotatedSortedArray(int[] nums){
        int start=0;
        int end = nums.length-1;
        int mid = 0;
        int min =Integer.MAX_VALUE;
        if(nums.length==1) return nums[0];
        if(nums[start]<nums[end]) return nums[start];

        while(start<end){
            mid = (start+end)/2;
            if(mid!=0 && nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            if(mid!=nums.length-1 && nums[mid+1]<nums[mid]){
                return nums[mid+1];
            }else{
                if(nums[start]<=nums[mid]){
                    start=mid+1;
                }else{
                    end=mid;
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums = {6,7,8,9,2,3,4,5};
        MinRotatedSortedArray_153 sc = new MinRotatedSortedArray_153();
        System.out.println(sc.MinRotatedSortedArray(nums));
    }
}
