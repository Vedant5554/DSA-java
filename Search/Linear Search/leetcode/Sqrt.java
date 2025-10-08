//https://leetcode.com/problems/sqrtx/description/
//69. Sqrt(x)
public class Sqrt {
    public static void main(String[] args) {
        Sqrt calculator = new Sqrt();
        int number = 16;
        int root = calculator.mySqrt(number);
        System.out.println(root);
    }

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        long r = x; // Start with an initial guess

        // Iteratively improve the guess until r*r <= x
        while (r * r > x) {
            r = (r + x / r) / 2;
        }

        return (int) r;
    }
}
