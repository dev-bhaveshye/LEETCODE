package DSA.HackWithInfy.Greedy;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Maximum_Meetings_in_One_Room_GFG {

    
    public static void main(String[] args){

        class Meeting{
        int start =0;
        int end =0;
        int idx =0;
        public Meeting(int start , int end , int idx){
            this.start = start;
            this.end = end ;
            this.idx = idx;
        }
    }

    int n = 10;
    int[] s = {12  ,6 ,16, 12, 6,  9, 16, 6 , 17,  5};
    int[] f = {17, 13, 16, 18, 17, 10 ,18, 12, 18, 11};

    
    Meeting[] meetings = new Meeting[n];

    for(int i = 0 ; i<n ; i++){
       meetings[i]= new Meeting(s[i], f[i], i + 1);
    }

     Arrays.sort(meetings, Comparator.comparingInt(a -> a.end));

    Integer end_value = 0;

    ArrayList<Integer> arr = new ArrayList<>() ;
    // arr.add(1);
    
    for (Meeting m : meetings) {
        if(m.start>end_value){
            arr.add(m.idx);
            end_value = m.end;
        }
    }

    for (int integer : arr) {
        System.out.println(integer);
    }
    }
    
}
