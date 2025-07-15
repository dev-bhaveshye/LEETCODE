package LEETCODE;

import java.util.ArrayList;

public class Valid_Anagram_242 {
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        
        int[] list1 = new int[26];
        int[] list2 = new int[26];
       

        for(int i = 0; i <= s.length()-1 ; i++){
            list1[s.charAt(i)-'a']++;
            list2[t.charAt(i)-'a']++;

        }

        for(int i= 0; i<= list1.length-1;i++){
            System.out.println(list1[i] + "  " + list2[i]);
            if(list1[i]!=list2[i]){
                return false;
            }
        }
        return true ; 
    }
    
    public static void main (String[] args){
        String s = "aacc", t = "ccac";
        System.out.println(isAnagram(s,t));
    }
}
