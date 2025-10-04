import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from user till user  does not press X or x

        while ( true){
            // take the operator as input

            char op = in.next().trim().charAt(0);
            if (op=='+'|| op=='-'|| op=='*'|| op=='%' || op=='/'){
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                
            }
        }
    }
}
