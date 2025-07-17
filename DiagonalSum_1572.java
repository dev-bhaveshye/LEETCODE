package LEETCODE;

public class DiagonalSum_1572 {

    public static int diagonalSum(int[][] mat){
        int sum =0;
        int n = mat.length;

        for(int i=0;i<=mat.length-1;i++){
            sum+= mat[i][i];
            System.out.println(mat[i][i]);
            sum+= mat[i][n-1-i] ;
        }

        if(mat.length % 2 !=0){
            sum-= mat[n/2][n/2];
        }
        System.out.println(sum);

        return sum;
    }
    
    public static void main(String[] args){

        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
        
    }
}
