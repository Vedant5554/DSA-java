//https://leetcode.com/problems/valid-perfect-square/
//367. Valid Perfect Square
package BS;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        ValidPerfectSquare calculator = new ValidPerfectSquare();
        int num = 16;
        boolean root = calculator.isPerfectSquare(num);
        System.out.println(root);
    }

    public boolean isPerfectSquare(int num) {
        if(num == 0|| num ==1){
            return true;
        }
        int s = 0;
        int e = num/2;
        int ans =0;

        while(s<=e){
            int mid = s+(e-s)/2;
            long square = (long)mid*mid;

            if(square==num){
                return true;
            }else if(square<num){
                s = mid+1;
            }else{
                e = mid-1;
            }

        }
        return false;
    }
}
