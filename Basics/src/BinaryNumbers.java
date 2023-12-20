public class BinaryNumbers {

    public static void main(String[] args) {
        String x = "10";
        String y = "01";

        //adding two binary numbers
        int a = Integer.parseInt(x,2);
        int b = Integer.parseInt(y,2);
        int c = a+b;
        String result = Integer.toBinaryString(c);
        System.out.println("Then result is "+result);
        String x1 = "011011";
        String y1 = "1010111";
        int a1 = Integer.parseInt(x1,2);
        int b1 = Integer.parseInt(y1,2);
        int c1 = a1+b1;

        String result1 = Integer.toBinaryString(c1);
        System.out.println("The result is "+result1);

    }
}
