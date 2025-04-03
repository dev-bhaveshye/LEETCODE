package LEETCODE;
public class PowerOfTwo_231{
    public static void main(String[] args){
         long num=16;
        long res=1;
        while(res<num){
            res=res*2;
        }
        System.out.println(res);
        if (res==num){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        // "Another method"


        
        // if(num<1){
        //     System.out.println("false"); 

        // }else{
        //     while(num%2==0){
        //         num=num/2;
        //     }
        // }
        // if(num==1){
        //     System.out.println("true");
        // }
    }
}