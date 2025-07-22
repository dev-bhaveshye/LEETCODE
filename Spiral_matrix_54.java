package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Spiral_matrix_54 {
    public static List<Integer> spiralOrder(int[][] n) {
        int right= n[0].length-1;
        int left =0;
        int top =0;
        int bottom =n.length-1;
        

        List<Integer> result = new ArrayList();
        
        while(top<=bottom && left<=right){
            for( int i =left ; i<=right;i++){
            result.add(n[top][i]);
            }
            top++;

            for( int i =top ; i<=bottom;i++){
                result.add(n[i][right]);
            }
            right--;

            if (top <= bottom) {
                for(int i = right;i>=left;i--){
                    result.add(n[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for(int i=bottom;i>=top;i--){
                    result.add(n[i][left]);
                }
                left++;
            }
        }

        return result;
        
    }

    public static void main(String[] args){
        int[][] n = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(n));
    }
}
