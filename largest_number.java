package Capgemini;

public class largest_number {
    public static void main(String[] args){
        int[] arr =  {1,2,3,4,9,3,5,2,4,4,7,8};
        int max = 0 ;

        for(int i = 0 ; i< arr.length; i++){
            max = Math.max(max , arr[i]);
        }

        System.out.println(max);
    }
}
