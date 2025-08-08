package DSA.HackWithInfy.Greedy;

import java.util.PriorityQueue;

public class Minimum_Cost_Of_Ropes_GFG {
    public static Integer minCost(int[] arr) {

        
        int minimum = 0 ; 
        
       PriorityQueue<Integer> array = new PriorityQueue<>();

       for (int i  : arr) {
        array.add(i);
       }
       
       while(array.size()>1){
           
           int first = array.poll();
           int second = array.poll();
           
           int add = first + second ;
           
           minimum+=add;

           array.add(add);
           
       }
       return minimum;
       
       
    }
    public static void main(String[] args){


        int[] arr= {4, 2, 7, 6, 9};

        System.out.println(minCost(arr));
    }        
        
    
}
