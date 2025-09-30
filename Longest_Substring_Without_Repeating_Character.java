package Capgemini;
import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Character {
    
    public static void main(String[] args){
        String s = "abcabcdefgh";

        HashMap<Character , Integer> map = new HashMap<>();

        // int left = 0 ; 
        int right = 0 ;

        int index = 0;
        int count = 0;
        int curr = 0;

        while(right!=s.length()){
            if(map.containsKey(s.charAt(right))){
                right = map.get(s.charAt(right));
                count=1;
                curr =1;
                map.clear();
            }
                map.put(s.charAt(right),right);
                curr++;
                count = Math.max(curr , count);
                
            

            right++;
        }
        System.out.println(count);
    }
}
