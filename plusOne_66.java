package LEETCODE;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;


public class plusOne_66 {

    public static String plusOne(int[] digits){
        // String str="";
        // for(int i =0 ; i<=digits.length-1;i++){
        //     str+=digits[i];
        // }
        // BigInteger num = new BigInteger(str);
        // num = num.add(BigInteger.ONE);
        // str = num.toString();
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // for(int i =0;i<=str.length()-1;i++){
        //     arr.add(str.charAt(i)-'0');
        // }
        // int[] result = new int[arr.size()];
        // for (int i = 0;i<=arr.size()-1;i++) {
        //     result[i]=arr.get(i);
        // }
       
        // return result.toString(); 
        // very poor approach 
        //-----------------------------------------------------------------------

        
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]=digits[digits.length-1]+1;
            return Arrays.toString(digits);
        }
        digits[digits.length-1]=0;
        for(int i=digits.length-2;i>=0;i--){
            if(digits[i]!=9){
                digits[i]=digits[i]+1;
                return Arrays.toString(digits);
            }else{
                digits[i]=0;
            }
        }
        int[] result = new int[digits.length+1];
        result[0]=1;
        
        return Arrays.toString(digits);
    }
    public static void main(String[] args) {
        int[] digits={1,2,3,9};
        System.out.println(plusOne(digits));
    }
}
