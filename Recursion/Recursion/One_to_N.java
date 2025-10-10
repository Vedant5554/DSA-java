package Vedant.Recursion;

public class One_to_N {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        fun(n - 1);
        System.out.println(n);
    }
}


