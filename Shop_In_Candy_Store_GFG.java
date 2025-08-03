package DSA.HackWithInfy.Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class Shop_In_Candy_Store_GFG {
    public static void main(String[] args){

        int[] arr =  {3, 2, 1, 4, 5};
        int k = 4;

        Arrays.sort(arr);

        int min =0;
        int i =0;
        int j=arr.length-1;
        while(i<=j){
            min+=arr[i];
            i++;
            j=j-k;
        }

        ArrayList<Integer> result = new ArrayList<>();

        result.add(min);

        int max =0;

        int l =0;
        int r =arr.length-1;

        while(l<=r){
            max+=arr[r];
            l=l+k;
            r--;
        }
        result.add(max);

        for (int z : result) {
            System.out.println(z);
        }

        
    }
}
