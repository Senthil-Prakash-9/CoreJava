import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name ");
        try {
            String name = bufferedReader.readLine();
            System.out.println("Enter your ID ");
            int id = Integer.parseInt(bufferedReader.readLine());
            System.out.println("your name is "+name+" and your ID is "+id);
        } catch (IOException e) {
            System.out.println("Failed to get inputs from user due to "+e);
        }
    }
}
