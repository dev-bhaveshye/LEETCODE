package Capgemini;

public class Perfect_number {
    public static void main(String[] args){

        int num =6 ; 
        int sum=0;
        for( int i = 1 ; i <= num/2 ; i++ ){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum == num){
            System.out.println(true);

        }else{
            System.out.println(false);
        }
    }
}
