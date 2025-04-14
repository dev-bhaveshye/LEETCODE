package LEETCODE;

public class Two_Sum_2_167 {
    public static void main(String[] args){

        int[] numbers={1,2,5,7,8,9};
        int target=15;
        int[] sol=new int[2];
        int i=0;
        int j=numbers.length-1;


        while(i<j){
            if(numbers[i]+numbers[j]==target){
                sol[0]=i+1;
                sol[1]=j+1;
                break;
            }
            else if((numbers[i]+numbers[j])>target){
                j--;
                
            }else{
                i++;
            }
            
        }
        for(int a : sol){
            System.out.println(a);
        }


    }
}
