package LEETCODE;

import java.util.Stack;

public class minAddToMakeValid_921 {
    public static int minAddToMakeValid(String s) {
        

        // Stack<Character> st = new Stack<>();
        // int step =0;

        // for(char c : s.toCharArray()){
        //     if(c=='('){
        //         st.push(c);
        //     }else{

        //         if(st.isEmpty()== true && c==')'){
        //             step++;
        //         }else{
        //             st.pop();
        //         }

        //     }
        // }
        // return step+st.size() ; 


        int result =0;
        int balance =0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                balance++;
            }if(c == ')'){
                if(balance <= 0){
                    result++;
                }else{
                    balance--;
                }
            }
        }

        result = result + balance;
        return result;
    }

    public static void main(String[] args){
        String s ="()))((";
        System.out.println(minAddToMakeValid(s));
    }
    
}
