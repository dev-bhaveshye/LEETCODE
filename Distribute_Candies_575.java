package LEETCODE;

import java.util.HashMap;

public class Distribute_Candies_575 {
     public int distributeCandies(int[] candyType) {
        
        int count = 1;
        int even = candyType.length/2;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(candyType[0],1);


        for(int i = 1; i<= candyType.length-1;i++){
            if(candyType[i]!=candyType[i-1] && count < even && !map.containsKey(candyType[i])){
                count++;
                map.put(candyType[i],1);
            }
        }

        return count ;
    }

    public static void main (String[] args){
        int[] candyType = {1,1,2,2,3,3};

        Distribute_Candies_575 distribute = new Distribute_Candies_575();

        System.out.println(distribute.distributeCandies(candyType));
    }
}
