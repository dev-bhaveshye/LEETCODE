package LEETCODE;

import java.util.HashMap;

public class findLucky_1394 {
    public static void main(String[] args) throws NullPointerException{
        int[] arr = {2,2,4,4,4,4,3,3,3,5,5,5,5,5};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])== true){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i], 1);
            }
            
        }
        int ans =-1;

        for(int key :hm.keySet()){
            if(hm.get(key)==key){
                ans = Math.max(ans,key);
            }

        }
        System.out.println(ans);
        
        

        
    }
}