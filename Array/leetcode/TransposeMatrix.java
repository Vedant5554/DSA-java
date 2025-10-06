//https://leetcode.com/problems/transpose-matrix/
//867. Transpose Matrix
import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        TransposeMatrix calculator = new TransposeMatrix();
        int[][] transpose= calculator.transpose(mat);

        System.out.println(Arrays.deepToString(transpose)); //object[] a
    }

    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] newArray = new int[m][n];
        for(int row = 0 ; row < n ;row++){
            for(int col = 0 ; col < m ;col++){
                newArray[col][row] = matrix[row][col];
            }
        }
        return newArray;
    }
}
