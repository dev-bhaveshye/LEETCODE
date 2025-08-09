package LEETCODE;

public class Majority_Element_169 {
    public static void main(String[] args){

        int[] nums = {3,2,3};


        int vote = 1;
        int candidate  = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i]==candidate){
                vote++;
            }else{
                if(nums[i]!= candidate && vote!=0){
                    vote--;
                }else{
                    vote++;
                    candidate = nums[i];
                }
            }
        }
         System.out.println(candidate);

    
    }
}
