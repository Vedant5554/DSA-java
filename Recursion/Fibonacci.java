public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibo(4);
        int num = fiboFormula(50);
        System.out.println(num);
        System.out.println(ans);
    }

    static int fiboFormula(int n){
        return (int)(Math.pow(((1 + Math.sqrt(5)) /2),n));
    }

    static int fibo(int n){
        //base condition
        if(n < 2){
            return n;
        }
        return fibo(n-1)+fibo(n-2); //this is not tail recursion

    }
}
