public class MiddleCharacter {
    public static void main(String[] args) {
        // Input string
        String input = "helloo";

        // Get the middle character(s)
        int length = input.length();
        int middleIndex = length / 2;

        String middle;
        if (length % 2 == 0) {
            // For even length, two middle characters
            middle = input.substring(middleIndex - 1, middleIndex + 1);
        } else {
            // For odd length, one middle character
            middle = String.valueOf(input.charAt(middleIndex));
        }

        // Print the result
        System.out.println("Input String: " + input);
        System.out.println("Middle Character(s): " + middle);
    }
}
