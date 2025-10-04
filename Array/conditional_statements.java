public class conditional_statements {
    public static void main(String[] args) {
        /*
        syntax of if statements:
        if (boolean expression is T or F){
            //body
        } else {
            //do this
        }
         */
//        int salary = 25400;
//        if(salary > 10000){
//            salary += 2000;
//        } else{
//            salary += 1000;
//        };

        //multiple if else statements
        int salary = 25400;
        if(salary > 20000 ){
            salary += 3000;
        } else if (salary > 10000){
            salary += 2000;
        } else{
            salary += 1000;
        };

        System.out.println(salary);
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
    }
}