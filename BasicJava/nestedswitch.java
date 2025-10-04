import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("vedant");
            case 2 -> System.out.println("vg");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "management" -> System.out.println("management department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("Enter correct empID");
        }
    }
}
