package LEETCODE;

public class productExceptSelf_238 {
    public static void main(String[] args){
        // int[] nums = {4,3,1,2};
        // int[] sol = new int[nums.length];

        // int i=0;
        // int j=0;
        
        // int sum=1;
        // while(i<nums.length){
        //     if(j==i){
        //         j++;
        //     }if(j>nums.length-1){
        //         sol[i]=sum;
        //         j=0;
        //         i++;
        //         sum=1;
        //     }    
        //     sum=sum*nums[j];
        //     j++;
        // }
        // for(int a:sol){
        //     System.out.println(a);
        // }

        // int[] nums = {4,3,1,2,1};
        // int[] sol = new int[nums.length];
        // int i=0;
        // int temp = 0;
        // int temp2 =nums.length-1;
        // int j=nums.length-1;
        // int sum=1;
        // int sum2=1;
        // while(i<=j){
            
        //     if(temp ==i){
        //         temp++;
        //     }if(temp>nums.length-1){
        //         sol[i]=sum;
        //         temp=0;
        //         sum=1;
        //         i++;
        //     }    
        //     sum=sum*nums[temp];
        //     temp++;

        //     if(temp2 ==j){
        //         temp2--;
        //     }if(temp2<0){
        //         sol[j]=sum2;
        //         temp2=nums.length-1;
        //         sum2=1;
        //         j--;
        //     }    
        //     sum2=sum2*nums[temp2];
        //     temp2--;
        // }
        // for(int a:sol){
        //     System.out.println(a);
        // }

        //-------------------------ABOVE APPROACH IS CORRECT BUT GIVING O(n^2)---------------------------------------------------------------


        int[] nums = {4,3,1,2};
        int[] postfix=new int[nums.length];
        int prod = 1;
        for(int i=nums.length-1;i>=0;i--){
            prod = prod * nums[i];
            postfix[i]=prod;
           
        }
        
        int prefix=1;
        int[] sol = new int[nums.length];

        for(int i=0;i<nums.length-1;i++){
            int val = prefix*postfix[i+1];
            sol[i]=val;
            prefix=prefix*nums[i];
        }
        sol[nums.length-1]=prefix;
        for(int a:sol){
            System.out.println(a);
        }


        



    }
}
