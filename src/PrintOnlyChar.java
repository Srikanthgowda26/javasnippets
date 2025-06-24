public class PrintOnlyChar {
    public static void main(String[] args) {
        java.lang.String s = ("A1B2C3D4");
        java.lang.String s1 = s.replaceAll("\\d", "");
        System.out.println(s1);
    }
}
