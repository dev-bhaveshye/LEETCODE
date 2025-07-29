package DSA.HackWithInfy.Hashing_SlidingWindow;

import java.util.HashMap;

public class lengthOfLongestSubstring_3 {
    public static void main(String[] args){
        String s = "abba";

        HashMap<Character , Integer> map = new HashMap<>();
        int maxCount = 0;
        int count = 0;

        for(int i =0;i<= s.length()-1;i++){
            if(  map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= i - count){
                
                maxCount = Math.max(count , maxCount);
                count=i - map.get(s.charAt(i));
                map.put(s.charAt(i) , i);
                    
            }else{
                map.put(s.charAt(i) , i);
                count++;
            }
        }
        maxCount = Math.max(count , maxCount);
        System.out.println(maxCount);
    }
}
