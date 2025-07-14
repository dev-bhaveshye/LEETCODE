package LEETCODE;

import java.util.ArrayList;
import java.util.HashMap;

public class Redistribute_Characters_to_Make_All_Strings_Equal_1897 {

    public static boolean canMakeEqual(String[] words) {
        // HashMap<Character,Integer> charFreq = new HashMap<>();
        // for(String word : words){
        //     for(char ch : word.toCharArray()){
        //         charFreq.put(ch , charFreq.getOrDefault(ch, 0) + 1);
        //     }
        // }

        // int n = words.length;
        // for(int freq : charFreq.values()){
        //     if(freq % n!=0){
        //         return false;
        //     }
        // }

        // return true;


        int[] charFreq = new int[26];
        for(String word : words){
            for(char ch : word.toCharArray()){
                charFreq[ch-'a']++;
            }
        }

        int n = words.length;
        for(int freq : charFreq){
            if(freq != n){
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        String[] words = {"a","b"};
        System.out.println(canMakeEqual(words)); // Output: true
    }
}
