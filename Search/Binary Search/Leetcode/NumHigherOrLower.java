package BS;
//374. Guess Number Higher or Lower
//https://leetcode.com/problems/guess-number-higher-or-lower/description/
public class NumHigherOrLower {
    private int pick = 6;

    public static void main(String[] args) {

        NumHigherOrLower calculator = new NumHigherOrLower();
        int number = 10;
        int root = calculator.guessNumber(number);
        System.out.println(root);
    }

    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private int guess(int num) {
        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        } else {
            return 0;
        }
    }
}
