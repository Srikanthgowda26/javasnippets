import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {
    public static void main(String[] args) {
        // Block 1: Input and preparation
        String input = "hello world"; // Input string
        input = input.replaceAll(" ", ""); // Remove spaces
        Map<Character, Integer> hm = new HashMap<>(); // Create a map for character counts

        // Block 2: Counting occurrences
        for (char c : input.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1); // Update count
        }

        // Print character occurrences
        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue()); // Print each character and count
        }

        // Block 3: Find and print the first non-repeating character
        for (char c : input.toCharArray()) {
            if (hm.get(c) == 1) { // Check if the character count is 1
                System.out.println("First non-repeating character: " + c);
                break; // Exit the loop once the first non-repeating character is found
            }
        }
    }
}
