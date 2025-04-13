package LEETCODE;

import java.math.BigInteger;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Add_to_Array_Form_989 {
    public static void main(String[] args){
       
        int k=1;
        int[] arr1={9};

        // StringBuilder num = new StringBuilder();
        // for(int i =0;i<arr1.length;i++){
        //     num.append(arr1[i]);
        // }

        // BigInteger BigNum = new BigInteger(num.toString());
        // BigInteger BigResult = (BigNum.add(BigInteger.valueOf(k)));

        // System.out.print(BigResult);
        // System.out.println("");
    
        // List<Integer> arr = new ArrayList<>();
        // for (char c : String.valueOf(BigResult).toCharArray()) {
        //     arr.add(c - '0');  // convert char digit to int digit
        // }

        // arr.forEach(digit -> System.out.print(digit + " "));

        // -----------------------------------------------------------------------------------

        int p = arr1.length-1;
        List<Integer>Result=new ArrayList<>();
        int carry =0;
        while(p>=0 || k>0){
            int numval=0;
            if(p>=0){
                numval=arr1[p];
            }
            int Result1 = k%10;
            int digit=(numval+Result1+carry);
            int d= digit%10;
            Result.add(d);
            k=k/10;
            p--;
            carry=digit/10;
            
        }
        if(carry>0){
            Result.add(carry);
        }
        Collections.reverse(Result);
        Result.forEach(e->System.out.print(e+","));

    }
}
