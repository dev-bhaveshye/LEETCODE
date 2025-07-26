package LEETCODE;

import java.util.Arrays;

public class Spiral_matrix_59 {
    
    public static int[][] generateMatrix(int n) {
        int top= 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        
        int[][] matrix = new int[n][n];
        int count = 1;
        
        while(top<=bottom && left<=right){
            for(int i = left ; i <= right;i++){
                matrix[top][i] = count++;
            }
            top++;

            for(int i = top ; i<=bottom;i++){
                matrix[i][right] = count++;
            }
            right--;

            for(int i = right; i >= left ; i--){
                matrix[bottom][i]  = count++;
            }
            bottom--;

            for(int i = bottom ; i >= top ; i--){
                matrix[i][left] = count++;
            }
            left++;

        }

        return matrix;
        
    }

    public static void main(String[] args){
        int n = 2;
        int[][] result = generateMatrix(n);
        System.out.println(Arrays.deepToString(result));
    }
}

