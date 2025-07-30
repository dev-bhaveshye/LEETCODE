package DSA.HackWithInfy.Hashing_SlidingWindow;
import java.util.HashMap;
public class SubArray_Sum_Equals_k_560 {
    public static void main (String[] args){
       
        int[] array = {0,0,0,0,0,0,0,0,0,0};
		int k = 0;
		int sum =0;
		int count = 0;
       
		HashMap<Integer , Integer> map = new HashMap<>();
         map.put(0,1);
		for(int i = 0 ; i  <= array.length-1 ; i++){
			sum += array[i];
			
			if(map.containsKey(sum-k)){
				count+= map.get(sum-k);
                System.out.println(" count " + count + " at " + i);
			}
	        	
            map.put( sum , map.getOrDefault(sum,0) +1);
			
		}
		System.out.println(count);
    
    }
}
