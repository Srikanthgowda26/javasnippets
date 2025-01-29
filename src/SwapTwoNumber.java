public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println("Value of a Before swaping " + a);
        System.out.println("Value of b Before swaping " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a After swaping " + a);
        System.out.println("Value of b After swaping " + b);
    }

}
