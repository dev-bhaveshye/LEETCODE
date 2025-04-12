package LEETCODE;

public class Remove_Element_27 {
    public static void main(String[] args) {
        
    
        int[] nums = {1,2,2,3,4,5};

        int val =2;
        int count=0;
        for(int num :nums){
            if(num==val){
                count++;
            }
        }
        int[] nums1= new int[nums.length-count];

        for(int i=0 , j=0;i<nums.length;i++){
            if(val!=nums[i]){
                nums1[j++]=nums[i];
            }
            
        }
        for(int a : nums1){
            System.out.print(a);
        }
        System.out.println("");
        System.out.println("Length is "+nums1.length);
    
    }
}
