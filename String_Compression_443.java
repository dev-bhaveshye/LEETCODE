package LEETCODE;

public class String_Compression_443 {
    public int String_Compression_443(char[] chars){
        int count =1;
        StringBuilder s = new StringBuilder();
        s.append(chars[0]);
        for(int i =1;i<=chars.length-1;i++){
            if(chars[i-1]!=chars[i]){
                if(count>1){
                    s.append(count);
                    count =1;
                }
                s.append(chars[i]);
            }else{
                count++;
            }
            
        }
        if(count>1){
            s.append(count);
        }

        for(int i =0;i<=s.length()-1;i++){
            chars[i]=s.charAt(i);
        }

        return s.length();

        
    }

    public static void main (String[] args){
        char[] chars={'a','b','b'};
        String_Compression_443 string_Compression_443 = new String_Compression_443();
        System.out.println(string_Compression_443.String_Compression_443(chars));
    }
}
