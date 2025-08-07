package DSA.HackWithInfy.Greedy;

public class Reverse_Words_GFG {


     public String reverseWords(String s) {
        // Code here
        String str = s.trim().replaceAll("^\\.+|\\.+$", "");
        
        String[] words = str.split("\\.+");
        
        StringBuilder reverse  = new StringBuilder("");
        
        for (int i = words.length-1 ; i>=0 ; i--){
            
            reverse.append(words[i]);
            if(i!=0){
                reverse.append(".");
            }
        }
        
        return reverse.toString();
        
    }



    public static void main(String[] args){

        String s = ".....the.....hello...byyy....bhavesh......";

        Reverse_Words_GFG reverse = new Reverse_Words_GFG();

        System.out.println(reverse.reverseWords(s));


    }
    
    
}
