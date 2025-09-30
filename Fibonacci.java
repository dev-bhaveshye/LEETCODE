package Capgemini;

public class Fibonacci {
    public static void main(String[] args){
        int a = 0;
        int b = 1;

        int num = 10 ; 
        // int count = 0 ;
        System.out.println(a);
        System.out.println(b);
        int sum = a+b;
        while(sum<= num){
            System.out.println(sum);
            a = b;
            b = sum;
            sum = a+b;
            
            // count++ ; 
        }
    }
}
