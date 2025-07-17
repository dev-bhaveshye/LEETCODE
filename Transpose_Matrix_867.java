package LEETCODE;

import java.util.Arrays;

public class Transpose_Matrix_867 {

    public static String transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposed = new int[cols][rows];
        
        for(int i=0; i<=rows-1;i++){
            for( int j =0; j<=cols-1;j++){
                transposed[j][i] = matrix[i][j];

            }
            
        }
        return Arrays.deepToString(transposed);

    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6}};
        System.out.println(transpose(matrix));
    }
}
