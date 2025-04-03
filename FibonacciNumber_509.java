package LEETCODE;



public class FibonacciNumber_509{
    public static void main(String[] args){
        int FirstTerm=0;
        int SecondTerm=1;
        int n=6;

        for( int i=1;i<=n;i++){
            int ThirdTerm=FirstTerm+SecondTerm;
            FirstTerm=SecondTerm;
            SecondTerm=ThirdTerm;
        }
        System.out.println(FirstTerm);


        
    }

        
      
        
}