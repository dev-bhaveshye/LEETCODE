package DSA.HackWithInfy.Greedy;

import java.util.Arrays;


public class Fractional_Knapsack_GFG {
    

    public static void main(String[] args){

        class Knapsack{
            int val ;
            int weight ;
            float r  ;

            public Knapsack(int val , int weight , float r ){
                this.val = val;
                this.weight = weight;
                this.r = r;
            }


        }

        int[] val = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int capacity = 50;

        Knapsack[] knapsack = new Knapsack[val.length];

        for(int i = 0; i<= val.length-1; i++ ){

            knapsack[i] = new Knapsack(val[i],weight[i] ,(float) val[i]/weight[i]);
        
        }

        Arrays.sort(knapsack , (a,b) -> Float.compare(b.r,a.r));

        for (Knapsack k : knapsack) {
            System.out.println("Value: " + k.val + ", Weight: " + k.weight + ", Ratio: " + k.r);
        }
            
        

        float profit = 0;
        for (Knapsack k : knapsack) {

            if(capacity == 0 ){
                System.out.println(profit);
                break;
            }
            if(capacity >= k.weight){
                profit +=k.val;
                capacity -=k.weight;
            }else{
                profit += (((float)capacity/k.weight)*k.val);
                capacity=0;
            }
        }
        System.out.println("Maximum Profit: " + profit);

    }

}
