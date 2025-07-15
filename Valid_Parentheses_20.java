package LEETCODE;

import java.util.Stack;

public class Valid_Parentheses_20 {
    public static boolean isValid(String s) {
        int count = 0;
        for(char c : s.toCharArray()){
            count ++;
        }
        if(count % 2 != 0){
            return false;
        }

        Stack<Character> st = new Stack<>();
        
        for(int i =0 ; i<=count-1  ;i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{'  || ch== '['){
                st.push(ch);
            }
            else{

                if(st.isEmpty()) return false ;
                char pop = st.pop();
                
                if(ch == ')' && pop!='(') return false;
                if(ch == '}' && pop!='{') return false;
                if(ch == ']' && pop!='[') return false;
            
            }
        }
        return st.isEmpty(); 
        
    }

    public static void main(String[] args){
        String s = "({[]})";
        System.out.println(isValid(s));
    }
    
}
