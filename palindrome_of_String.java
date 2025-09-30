package Capgemini;

public class palindrome_of_String {
    public static void main(String[] args){
        String s = "madam";
        int left = 0;
        int right = s.length()-1;
        boolean ans = true;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                ans = false;
            }
            left++;
            right--;
        }

        System.out.println(ans);
    }
    
}
