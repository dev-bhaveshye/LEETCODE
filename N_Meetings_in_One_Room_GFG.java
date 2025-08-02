package DSA.HackWithInfy.Greedy;

import java.util.AbstractMap;
import java.util.Arrays;


public class N_Meetings_in_One_Room_GFG {
    public static void main(String[] args){
        int n = 6;
        int[] s = {1,2,3,0,5,8,5};
        int[] f = {2,3,4,6,7,9,9} ;


        AbstractMap.SimpleEntry<Integer, Integer>[] arr = new AbstractMap.SimpleEntry[n];

        for (int i = 0 ; i < n; i++){
            arr[i] = new AbstractMap.SimpleEntry<>(s[i],f[i]);
        }

        Arrays.sort(arr, (a, b) -> a.getValue().compareTo(b.getValue()));

        int count = 1 ;
        Integer end_time = arr[0].getValue();

        for (int i = 1 ; i < n; i++){
            if(arr[i].getKey() > end_time){
                count ++;
                end_time = arr[i].getValue();
            }
        }
        System.out.println( count);
        


    }
}
