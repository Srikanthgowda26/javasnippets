public class AlternateCharacters {
    public static void main(String[] args) {
        String input = "HELLO"; // Example string
        System.out.println("Input String: " + input);

        System.out.print("Alternate Characters: ");
        for (int i = 0; i < input.length(); i += 2) {
            System.out.print(input.charAt(i));
        }
    }
}
