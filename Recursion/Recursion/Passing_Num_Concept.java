package Vedant.Recursion;

public class Passing_Num_Concept {
    public static void main(String[] args) {
        Concept(5);
    }
    static void Concept(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //Concept(n--);
        Concept(--n);

        //n-- vs --n
        //n-- pass the value of n first and then subtract
        //but in case of --n it will subtract first then pass the value of n
    }

}
