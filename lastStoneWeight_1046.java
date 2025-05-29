package LEETCODE;

import java.util.PriorityQueue;

public class lastStoneWeight_1046 {

    public int lastStoneWeight(int[] nums){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (Integer n : nums) {
            pq.add(n);
        }
        int a=0;
        int b=0;

        while(!pq.isEmpty()){
            a=pq.poll();
            if(!pq.isEmpty()){
                b=pq.poll();
                int result = a-b;
                pq.add(result);
                a=0;
                b=0;
            }
        }

        return a;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,4,1,8,1};
        lastStoneWeight_1046 stone = new lastStoneWeight_1046();
        System.out.println(stone.lastStoneWeight(nums));
        
    }
}
