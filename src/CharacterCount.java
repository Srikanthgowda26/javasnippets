public class CharacterCount {
    public static void main(String[] args) {
        String input = "helloworld";
        int[] counts = new int[256]; // Array to store counts for all ASCII characters

        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            counts[c]++;
        }

        // Print character counts
        System.out.println("Character counts:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((char) i + ": " + counts[i]);
            }
        }
    }
}
