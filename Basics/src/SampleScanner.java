import java.util.Scanner;

public class SampleScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name ");
        String name = sc.next();
        System.out.println("Enter your ID ");
        int id = sc.nextInt();
        System.out.println("your name is "+name+" and your ID is "+id);
    }
}
