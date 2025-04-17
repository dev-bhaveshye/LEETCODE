package LEETCODE;

public class Binary_Search_704 {
    public static void main(String[] args){
        
        int[] nums={4,98,110,179,448,654};
        int start=0;
        int end =nums.length-1;
        int target =654;
        int mid=0;
    while(start<=end){
         mid = start+(end - start )/2;
         System.out.println("mid = "+ start+" "+"+"+ end+" - "+ start);
         System.out.println("mid is "+ nums[mid]);
        if (nums[mid]==target){
            System.out.println(mid);
            break;
        } else if (target < nums[mid]){
            end = mid-1;
            
        }else{
            start =mid+1;
            
        }
    
        
    }
    if(nums[mid]!=target){
        System.out.println("-1");
    }

    }
}
