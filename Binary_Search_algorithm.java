package Capgemini;

public class Binary_Search_algorithm {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 6;
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(target == arr[mid]){
                System.out.println(mid);
                break;
            }
            if(target<arr[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }

        }

    }
    
}
