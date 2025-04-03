package LEETCODE;

public class Palindrome_9 {
    public static void main(String[] args) {
        int originalnum= 123 ;
        int num=originalnum;
        int lastdigit=0;
        int reversed =0;
        if(num<0){
            System.out.println("not Palindrome");
        }
        while(num>0){
            lastdigit=num%10;
            reversed=reversed*10+lastdigit;
            num=num/10;

        }
        System.out.println(reversed);
        if(originalnum==reversed){
            System.out.println("Palindrone");
        }else{
            System.out.println("not palindrone");
        }



    }

    
   
}
