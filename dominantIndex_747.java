package LEETCODE;

public class dominantIndex_747 {
    public static void main(String[] args){
        int[] nums={0,0,3,2};
        int[] sol=new int[nums.length];
        int a=0;
        int index=0;
        
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>a){
        //         a=nums[i];
        //         index=i;

        //     }
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]*2<=a){
        //         sol[i]=1;
        //         System.out.println("sol"+"["+i+"]"+" ="+"1");
        //     }else if(nums[i]==a){
        //         System.out.println("same element occures at "+ i +" and "+i+"is 0");
        //         sol[i]=0;
        //     }else{
        //         sol[i]=-1;
        //         System.out.println("sol"+"["+i+"]"+" ="+"-1");
        //     }
        // }
        // int sum=0;
        // for(int i=0;i<sol.length;i++){
        //     if(sol[i]==0){
        //         continue;
        //     }
        //     if(sol[i]==1){
        //         sum+=1;
        //         System.out.println("sum is "+sum);
        //     }else{
        //         sum+=-1;
        //     }
        // }
        // System.out.println("sum is "+sum);
        // if(sum==sol.length-1){
        //     System.out.println(index);
        // }else{
        //     System.out.println("-1");
        // }

        // ----------------------        // ----------------------        // ----------------------
        


        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>a){
        //         a=nums[i];
        //         index=i;

        //     }
        // }
        
        //     for(int i=0;i<nums.length;i++){
        //         if(i==index){
        //             continue;
        //         }
        //         if(nums[i]*2>a){
        //             System.out.println(-1);
        //             System.out.println(nums[i]);
        //         }
        //     }
        //     System.out.println(index);
        

         // ----------------------        // ----------------------        // ----------------------
        int largest =0;
        int sec_largest=0;
        
        for(int i =0; i <nums.length;i++){
            if(nums[i]>largest){
                sec_largest=largest;
                largest=nums[i];
                index=i;
            }
            if(nums[i]>sec_largest && nums[i]<largest){
                sec_largest=nums[i];
            }

        }
        System.out.println("sec_largest "+sec_largest);
        System.out.println("largest "+largest);
        if(sec_largest*2>largest){
            System.out.println("-1");
        }else{
            System.out.println(index);
        }
        

    }
}
