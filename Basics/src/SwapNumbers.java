public class SwapNumbers {
    public static void main(String[] args) {
        int x = 9;
        int y = 3;
        int temp =x;
        x = y;
        y = temp;
        System.out.println("Number after swapping is "+x+" and "+y);
        swapUsingArithmeticOperator(x,y);
    }

    public static void swapUsingArithmeticOperator(int x, int y){
        x = (x+y)-(y=x);
        System.out.println("Number after swapping using arithmetic operator is "+x+" and "+y);
    }
}
