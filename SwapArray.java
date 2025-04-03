package DSA;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int temp;
        temp = arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
        for (int i = 0;i<=arr.length-1;i++){
           System.out.print(arr[i]);
        }
        
        
    }
   
}
