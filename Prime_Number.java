package Capgemini;

public class Prime_Number {

    static boolean isPrime(int num){
        for(int i = 2 ; i<=num/2;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
    //     int num = 100;  // 3 , 5 

    //     boolean ans = true;

    //     for( int i = 2 ; i <= num/2 ; i++){
    //         if(num%i==0){
    //             ans = false;
    //             System.out.println("divisible by "+ i);
    //         }
    //     }

    //     System.out.println(ans);


        int num = 50 ; 
        int count = 0;
        int i = 2;
    while(count != num){
        if(isPrime(i)){
            System.out.println(i);
            count++;
        }
        i++;
    }

    }
    


}
