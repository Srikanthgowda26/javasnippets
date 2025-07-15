public class ReverseUsingStringBuffer {
    public static void main(String[] args) {
        String str = "HELLO";

        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);
    }
}
