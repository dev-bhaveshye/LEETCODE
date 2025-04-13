package LEETCODE;


public class Maximum_Product_of_Two_Elements_1464 {
    public static void main(String[] args){
        int[] nums = {1,5,4,5};

        // int Result =0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         int d = (nums[i]-1) * (nums[j]-1) ;
        //         if(Result<d){
        //             Result = d;
        //         }
        //     }
        // } 
        // System.out.println(Result);
        int max=-1;
        int smax=-1;

        for ( int i =0 ; i<nums.length;i++){
            if(max<nums[i]){
                smax=max;
                max=nums[i];
                
            }else if(smax<nums[i]){
                smax=nums[i];
            }
        }
        System.out.println(smax);
        System.out.println(max);
        System.out.println((max-1)*(smax-1));

    }
}
