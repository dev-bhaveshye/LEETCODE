package LEETCODE;

import java.util.PriorityQueue;

public class findKthLargest_215 {

    public static int findKthLargest(int[] nums,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<=nums.length-1;i++){
            if(pq.size()<k){
                pq.add(nums[i]);
            }else if(pq.peek()<nums[i]){
                pq.remove();
                pq.add(nums[i]);
            }
            
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(nums, k));
    }
}
