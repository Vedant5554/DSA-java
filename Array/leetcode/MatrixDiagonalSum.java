//https://leetcode.com/problems/matrix-diagonal-sum/
//1572. Matrix Diagonal Sum

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        MatrixDiagonalSum calculator = new MatrixDiagonalSum();
        int diagonalSum= calculator.diagonalSum(mat);

        System.out.println(diagonalSum);
    }


    public int diagonalSum(int[][] mat) {
        int ans = 0;
        int n = mat.length;
        for(int row = 0 ; row<n;row++){
            for(int col = 0 ; col <n;col++){
                if(row == col || (row + col)== n-1 ){
                    ans+=mat[row][col];
                }
            }
        }
        return ans;
    }
}
