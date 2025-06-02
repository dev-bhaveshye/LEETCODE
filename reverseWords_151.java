package LEETCODE;
public class reverseWords_151 {
    public String reverseWords_151(String s){
        String str=s.trim();
        String[] words = str.split("\\s+");
        System.out.println(str);

        StringBuilder result = new StringBuilder("");
        
        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]);

            if(i!=0) result.append(" ");
        }
        
        return result.toString();
        
    }
    public static void main(String[] args) {
        String s = "   a good   example";
        reverseWords_151 reverse = new reverseWords_151();
        System.out.println(reverse.reverseWords_151(s));


    }
}

