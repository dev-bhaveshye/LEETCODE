package Capgemini;

import java.util.HashMap;

public class Count_Vowels {
    public static void main (String[] args){
        String s = "lala";
        s = s.toLowerCase();
        int count = 0 ;
        HashMap<Character , Integer> map = new HashMap<>(); 
        map.put('a',0);
        map.put('e',0);
        map.put('i',0);
        map.put('o',0);
        map.put('u',0);

        for(int i = 0 ; i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }

        System.out.println(map);
    }
}
