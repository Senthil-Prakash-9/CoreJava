import java.util.*;
import java.util.stream.Collectors;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of inputs ");
        int count = sc.nextInt();
        int i = 0;
        int n[] = new int[count];
        while (i < count) {
            System.out.println("Enter your number");
            n[i] = sc.nextInt();
            i = i + 1;
        }
        System.out.println("The largest number is " + Arrays.stream(n).max().getAsInt());
        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.stream(n).boxed().collect(Collectors.toList()));
        System.out.println("Max number from collection is " + Collections.max(integerList));
    }
}
