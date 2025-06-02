package LEETCODE;

public class lengthOfLastWord_83 {
    public static int lengthOfLastWord(String s ){
        // int count =0;
        // int index=s.length()-1;
        // for ( int i =s.length()-1;i>=0;i--){
        //     if(s.charAt(i)!=' '){
        //         index = i;
        //         break;
        //     }
        // }
        // for(int i=index;i>=0;i--){
        //     if(s.charAt(i)==' ' ){
        //         return count;
        //     }
        //     count++;
        // }

        // return count;

        //-------------------------------------------------------------------------------------------------------------

        String str = s.trim();
        int count = 0;
        for(int i=str.length()-1; i >= 0; i--) {
            char temp = str.charAt(i);
            if(temp == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s ="a";
        int result =lengthOfLastWord(s);
        System.out.println(result);
        
    }
}
