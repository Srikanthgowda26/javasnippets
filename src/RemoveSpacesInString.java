public class RemoveSpacesInString {
    public static void main(String[] args) {
        String input = "Hello World From Java";

        System.out.println("Before removing spaces: " + input);

        // Remove all spaces from the string
        String result = input.replace(" ", "");

        System.out.println("After removing spaces: " + result);
    }
}
