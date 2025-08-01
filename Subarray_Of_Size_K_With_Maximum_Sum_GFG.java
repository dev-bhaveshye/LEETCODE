package DSA.HackWithInfy.Sliding_Window;

public class Subarray_Of_Size_K_With_Maximum_Sum_GFG {

    public static void main(String[] args){

        // int[] nums = {500, 200, 300, 400};

        // int k =1;
        // int i =0;
        // int j =1;
        // int load = 0;
        // int max_load = 0;
        // load = nums[i];

        // if(nums.length == k){
        //     for (int n : nums) {
        //         max_load+=n;
        //     }
        // }
        // while(j<=nums.length-1){
        //     if ( (j-i) == k ){
        //         max_load = Math.max(load , max_load);
        //         load += nums[j];
        //         load -=nums[i];
        //         max_load = Math.max(load , max_load);
        //         i++;
        //         j++;
        //     }
        //     else{

        //         load += nums[j];
        //         j++;


        //     }
        //     System.out.println(max_load);
        // }

        //  this is also good but we are writing to many conditions to handle cases , but we can do by 
        // 1st create windo of size k , means add first k elements , and then start a loop which starts from i and add i element and substract i-k;

         
        int[] nums = {500, 200, 300, 400};

        int k =4;
        int load = 0;
        int max_load = 0;

        for(int i =0; i <k;i++){
            load+=nums[i];
        }

        max_load=Math.max(load,max_load);

        for(int i =k ; i< nums.length;i++){
            load+=nums[i];
            load-=nums[i-k];
            max_load = Math.max(load , max_load);
        }

        System.out.println(max_load);

        





    }
    
}
