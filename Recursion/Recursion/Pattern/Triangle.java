
package Vedant.Recursion.Pattern;

public class Triangle {
    public static void main(String[] args) {
        // * * * *
        // * * *
        // * *
        // *
        triangle1(4, 0);
        triangle2(4, 0);
    }

    static void triangle1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* "); // Prints the star and a space without a newline
            triangle1(r, c + 1);
        } else {
            System.out.println(); // Prints a newline to move to the next row
            triangle1(r - 1, 0);
        }
    }

    static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c + 1);
            System.out.print("*"); // Prints the star and a space without a newline
        } else {
            triangle2(r - 1, 0);
            System.out.println(); // Prints a newline to move to the next row
        }
    }
}
