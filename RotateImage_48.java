package LEETCODE;

import java.util.Arrays;

public class RotateImage_48{

    public static int[][] rotateImage(int[][] matrix){

        // int n= matrix.length;
        // int[][] rotate = new int[n][n];
        

        // for(int i=0 ; i<=n-1;i++){
        //     for(int j=0;j<=n-1;j++){

        //         rotate[j][n-1-i] = matrix[i][j];

        //     }
        // }

        // return rotate;

        // ----------------------------------------------------------------------------------------

        // above solution used another 2d matrix which is not allowed !
        // int n= matrix.length;
        // int[][] rotate = new int[n][n];

        // for (int i =0;i<=n-1;i++){
        //     for(int j =0 ; j<= n-1 ;j++){
        //         rotate[i][j] = matrix[j][i];
        //     }

        // }

        // for (int i =0;i<=n-1;i++){
        //     for(int j =0 ; j<= n-1 ;j++){
        //         matrix[i][j] = rotate[i][n-j-1];
        //     }

        // }
        // return matrix;

        // ---------------------------------------------------------------------------------------------------

        int n= matrix.length;

        for (int i =0;i<=n-1;i++){
            for(int j =i ; j<= n-1 ;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i] = temp;
            }

        }

        for (int i =0;i<=n-1;i++){
            for(int j =0 ; j< n/2 ;j++){
                int temp  = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }

        }
        return matrix;

    }


    public static void main(String[] args){

        int[][] matrix  = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] result = rotateImage(matrix);

        System.out.println(Arrays.deepToString(result));

    }
}