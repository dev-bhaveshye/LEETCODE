package LEETCODE;

public class maxAscendingSum_1800 {
    public static void main(String[] args){
        
        // int[] nums ={1,2,3,2,1,0,4,5,2,7,8};
        // int i=1;
        // int j=nums.length-1;
        // int prev=0;
        // int sum=nums[0];
        // int sum1=0;
        // while(i<j){
        //     if(nums[i-1]<nums[i]){
        //         sum+=nums[i];
        //         i++;
        //     }else if(nums[j-1]<nums[j]){
        //         sum1+=nums[j];
        //         j--;
        //     }else if(sum <sum1){
        //         sum=0;
        //         i++;
        //         j--;
        //     }else if(sum1< sum){
        //         sum1=0;
        //         i++;
        //         j--;
        //     }if(j-1==i && nums[i]<nums[j]){
        //         sum=sum+sum1;
        //         System.out.println(sum);
        //     }
        // }
        // if(sum>sum1){
        //     System.out.println(sum);

        // }else if(sum1>sum){
        //     System.out.println(sum1);
        // }else{
        //     System.out.println("both are same ");
        // }


        int[] nums ={12,17,15,13,10,11,12};
        int sum = nums[0];
        int max =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                sum+=nums[i];
                System.out.println(sum +"sum after  "+ i);
                
                         
            }else{ 
                if(max < sum){
                max = sum;
                System.out.println(max +"max after  "+ i);
                
                }
                sum=nums[i];
                System.out.println(sum +"sum after  "+ i);
            }
                
            
        }
        max =Math.max(sum,max);
        System.out.println(max);
        

    }
    
}
