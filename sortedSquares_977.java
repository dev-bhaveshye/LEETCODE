package LEETCODE;

public class sortedSquares_977{
    public static void main(String[] args) {
        int[] nums={-4,-1,3,4,5};

        // for(int i =0;i<nums.length;i++){
        //     nums[i]=nums[i]*nums[i];
        //     System.out.print(nums[i]+",");
        // }
        // System.out.println("");
        // for(int i =0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]<nums[i]){
        //             int temp = nums[j];
        //             nums[j]=nums[i];
        //             nums[i]=temp;
                    
        //         }
        //     }
        // }
        // System.out.println("");
        // for(int i =0;i<nums.length;i++){
            
        //     System.out.print(nums[i]+",");
        // }

        // ------------------------------------------------------------------------------------------------------------
        int i=0;
        int j=nums.length-1;
        int ptr=nums.length-1;
        int[] sol = new int[nums.length];
        
        while(i<=j){
            int start = nums[i]* nums[i];
            int end = nums[j]*nums[j];

            if(start>end){
                sol[ptr]=start;
                
                i++;
            }else{
                sol[ptr]=end;
                j--;
                
            }
            ptr--;
        }
            
        
        for(int a:sol){
            System.out.print(a+",");
        }
    }
}