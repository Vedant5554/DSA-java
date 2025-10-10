package Vedant.Recursion;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = product(55);
        System.out.println(ans);
    }

    static int product(int n){
        if(n%10 == n){
            return n;
        }
//        if(n == 0){
//            return 0; this thing will give problem when n is a single digit number it will return 0 so product will be 0 only
//        }
        return (n%10) * product(n/10);
    }
}
