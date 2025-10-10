package Vedant.Recursion;

public class Reverse_num {
    static int sum = 0;//will be covered in oops
    static void reverse(int n){
        if (n == 0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        reverse(n/10);

    }
    static int reverse2(int n){
       //sometimes you might need additional variable in the argument
       //in that case make another function
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem* (int)(Math.pow(10,digits-1)) +helper(n/10,digits);
    }

    public static void main(String[] args) {
        reverse(56);
        System.out.println(sum);
        System.out.println(reverse2(1234));
    }

}
