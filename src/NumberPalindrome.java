public class NumberPalindrome {
    public static void main(String[] args) {
        int num = 121;
        String str = String.valueOf(num);
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("palinderome");
        } else {
            System.out.println("Not an palinderome");
        }
    }
}
