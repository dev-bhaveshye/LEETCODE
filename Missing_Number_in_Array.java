package Capgemini;

public class Missing_Number_in_Array {
    public static void main(String[] args){
        // int[] arr = {1,2,3,4,5,6,7,9};

        // int n = arr.length+1;

        // int total = n*(n+1)/2;

        // int arr_sum = 0;

        // for(int a : arr){
        //     arr_sum+=a;
        // }
        
        // System.out.println(total - arr_sum );

        int[] arr = {1,2,3,4,5,6,7,9};

        int n = arr.length+1;

        int total = 0;
        for(int i = 0 ; i<=n ; i++){
            total^=i;
        }

        int arr_sum = 0;

        for(int a : arr){
            arr_sum^=a;
        }
        
        System.out.println(total ^ arr_sum );
    }

}
