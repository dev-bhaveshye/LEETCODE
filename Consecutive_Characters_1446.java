package LEETCODE;

public class Consecutive_Characters_1446 {
    public static int maxPower(String s) {
        int count =1;
        int maximum =1;
        for(int i = 1;i <=s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i-1) ){
                count++;
                maximum = Math.max(maximum , count);
            }else{
                count =1;
            }
            
        }
        return maximum;
    }
    public static void main(String[] args){
        String  s = "tourist";
        System.out.println(maxPower(s));


    }
}
