import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        boolean skip = false;
        Scanner sc = new Scanner(System.in);
        while (!skip) {
            try {
                System.out.println("Enter your number ");
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    System.out.println("It's a even number");
                } else {
                    System.out.println("It's a odd number");
                }
                System.out.println("Do you want to continue: Y/N");
                String userOption = sc.next();
                if (userOption.equalsIgnoreCase("y")) {
                    skip = false;
                } else if (userOption.equalsIgnoreCase("n")) {
                    skip = true;
                } else {
                    System.out.println("You selected wrong input, Please re-run the program");
                    skip = true;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input");
                skip = true;
            }
        }
    }
}
