public class StringPalindrome {
    public static void main(String[] args) {
        String str = "ABA";
        //String str2 = " ";
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + "  not an palindrome");
        }
    }
}
