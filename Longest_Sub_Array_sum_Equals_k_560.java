package DSA.HackWithInfy.Hashing_SlidingWindow;
import java.util.HashMap;
public class Longest_Sub_Array_sum_Equals_k_560 {
    public static void main(String[] args){
         int[] array = {4,3,7,-7};
		int k = 3;
		int sum =0;
		int longest = 0;
		HashMap<Integer , Integer> map = new HashMap<>();
		for(int i = 0 ; i  <= array.length-1 ; i++){
			sum+= array[i];
			if(sum==k){
				longest = Math.max(i ,longest);
			}
			if(map.containsKey(sum-k)){
				longest = Math.max(i-map.get(sum-k) , longest);
			}
			else{
				map.put( sum , i );
			}
		}
		
		System.out.println(longest);
    }
}
