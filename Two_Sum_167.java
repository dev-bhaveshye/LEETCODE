package DSA.HackWithInfy.Hashing_SlidingWindow;

public class Two_Sum_167 {
    public static void main(String[] args){

        int[] array = {2,7,11,15};
        int target = 9;

        int[] result = new int[2];
        int i=0;
        int j = array.length-1;

        while(i<j){
            if(array[j]>target){
                j--;
            }else if(array[j]<target && array[j]+array[i] == target){
                result[0] = i+1;
                result[1] = j+1;

                System.out.println(result[0] + " " + result[1]);
            }else{
                i++;
            }

        }
    }
}
