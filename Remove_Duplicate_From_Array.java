package Capgemini;

import java.util.Arrays;
import java.util.HashSet;

public class Remove_Duplicate_From_Array {
    public static void main(String[] args){
        
        int[] arr = {1,2,3,4,5,6,7,8,8};

        HashSet<Integer> set = new HashSet <>();
        
        for(int i = 0 ; i < arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println("duplicate number is "+ arr[i]);
            }else{
                set.add(arr[i]);
            }

        }

        Integer[] uniqueArr = set.toArray(new Integer[0]);
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));
        // System.out.println("non duplicate arr is :" + set);

    }
}
