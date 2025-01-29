public class SwapString {
    public static void main(String[] args) {
        String Str1 = "HELLO";
        String Str2 = "WORLD";

        System.out.println("Before Swapping String1 = " + Str1);
        System.out.println("Before Swapping String2 = " + Str2);

        Str1 = Str1 + Str2;
        Str2 = Str1.substring(0, Str1.length() - Str2.length());
        Str1 = Str1.substring(Str2.length());

        System.out.println("After Swapping String1 = " + Str1);
        System.out.println("After Swapping String2 = " + Str2);
    }
}
