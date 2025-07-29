package DSA.HackWithInfy.Hashing_SlidingWindow;
import java.lang.Math;
import java.util.HashMap;

public class Longest_SubArray_Sum_Exact_0{
    public static void main(String[] args){
		
		/* 
		int[] array = {1,-1,3,2,-2,-3,3,-3};
		
		int max = 0;
	
		
		for(int i =0; i <= array.length-1; i++){
            int calc = 0;
			for(int j =i; j <=array.length-1;j++){
			
			    
                calc = calc + array[j];
			    if(calc == 0){
                    int length = j-i+1;
			        max = Math.max(max,length);
			
			    }
		    }
        }
        System.out.println(max);
		*/
// ---------------------------------------------------------------------------------------------------------------

//  longest subsequence with sum exact 0

		int[] array = {4,3,7,5,-5,-7,2,9,-4};
		int sum =0;
		int longest = 0;
		HashMap<Integer , Integer> map = new HashMap<>();
		for(int i = 0 ; i  <= array.length-1 ; i++){
			sum+= array[i];
			if(sum==0){
				longest = Math.max(i +1,longest);
			}
			if(map.containsKey(sum)){
				longest = Math.max(i-map.get(sum) , longest);
			}
			else{
				map.put( sum , i );
			}
		}
		
		System.out.println(longest);
    }
}
