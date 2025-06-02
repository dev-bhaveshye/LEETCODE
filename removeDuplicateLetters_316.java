package LEETCODE;
import java.util.Stack;

public class removeDuplicateLetters_316 {
    public static String StringremoveDuplicateLetters_316(String s){
        int[] lastindex = new int[25];
        boolean[] bool = new boolean[25];
        
        for(int i=0;i<=s.length()-1;i++){
            char c = s.charAt(i);
            int idx = (int) (c-'a');
            lastindex[idx]=i;
        }
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder("");

        for(int i=0;i<=s.length()-1;i++){
            char c = s.charAt(i);
            int idx = (int) (c-'a');
            if(bool[idx]==false){
                while(stack.size()>0 && stack.peek()>c && lastindex[(int)stack.peek()-'a']>i){
                    
                    bool[(int)stack.peek()-'a']=false;
                    stack.pop();
                }
                stack.push(c);
                bool[idx]=true;
                
            }
    
        }
        while(stack.size()>0){
            str.append(stack.pop());
        }
        return str.reverse().toString();  
    }
    
    public static void main(String[] args) {
        String s = "bcabc";
        String st =  StringremoveDuplicateLetters_316(s);
        System.out.println(st);
    }
}
