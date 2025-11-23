package Capgemini;
import java.util.*;
public class HackWithInfi_Interview_Question {
    public static void main(String[] args){
        String str = "01010101";
        int n = 8;

        List<List<Integer>> list  = new ArrayList<>();
        int result = 0;

        list.add(Arrays.asList(1,2,3));
        list.add(Arrays.asList(1,2,5));
        list.add((Arrays.asList(1,2,6)));
        

        for (int i = 0 ; i < list.size() ; i++){
            List<Integer> sublist = list.get(i);

            if(str.charAt(sublist.get(0))== '1' || str.charAt(sublist.get(1))=='1' ){
                result+=sublist.get(2);
            }

          
        }
        System.out.println(result);
    }
}
