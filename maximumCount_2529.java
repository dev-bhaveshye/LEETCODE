package LEETCODE;

public class maximumCount_2529 {
    public static int maximumCount(int[] nums){
        int start=0;
        int end=nums.length;
        int negative=0;
        int positive =0;
        // while(start<=end){
        //     if(nums[start]<0){
        //         negative++;
        //         start++;
        //     }else if(nums[end]>0){
        //         positive++;
        //         end--;
        //     }else{
        //         end--;
        //     }
        // }
        // return Math.max(negative, positive);
        int mid=0;
        while(start<end){
            mid = (start+end)/2;
            if(nums[mid]>=0){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        negative = start;

        int mid1=0;
        int start1=0;
        int end1=nums.length;
        while(start1<end1){
            mid1=(start1+end1)/2;
            if(nums[mid1]<=0){
                start1=mid1+1;
            }else{
                end1=mid1;
            }
        }
        
        positive = nums.length-start1;
        System.out.println(negative);
        return positive;
        
       
        
    }
    public static void main(String[] args) {
        int[] nums={0,0};
        System.out.println(maximumCount(nums));
    }
}
