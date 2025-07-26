package LEETCODE;

public class SearchMatrix_74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        
        // int m = matrix.length;
        // int n = matrix[0].length;

        // int right = (m*n)-1;
        // int left =0;
       
        // while (left<= right){
        //     int mid = (left + right)/2 ;

        //     int row = mid/n;
        //     int col = mid%n;
        //     int midvalue = matrix[row][col];

        //     if(midvalue == target){
        //         return true;
        //     }
        //     else if (target < midvalue){
        //         right = mid - 1;
        //     }else if(target > midvalue){
        //         left = mid+1;
        //     }

        // }
        // return false;



       // ___________________________________________________________________________________________________________________
    //    ANOTHER METHDO

        int row = 0;
        int col = matrix[0].length-1;

        while(row<matrix.length && col>=0){

            if(matrix[row][col]==target){
                return true;
            }else if(target>matrix[row][col]){
                row++;
            }else if (target <matrix[row][col] ){
                col--;
            }   
        }
        return false;
    }

    public static void main(String[] args){

        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 60;
        System.out.println(searchMatrix(matrix , target));
    }
}
