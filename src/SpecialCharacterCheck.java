public class SpecialCharacterCheck {
    public static void main(String[] args) {
        String input = "Hello@World!"; // Replace with your input string

        // Check if the string contains special characters
        String specialChars = ".*[^a-zA-Z0-9 ].*";
        if (input.matches(specialChars)) {
            System.out.println("The string contains special characters.");
        } else {
            System.out.println("The string does not contain special characters.");
        }
    }
}
