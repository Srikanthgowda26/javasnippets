public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        String result = "";

        for (char c : input.toCharArray()) {
            if (result.indexOf(c) == -1) { // Check if character is already in result
                result += c;
            }
        }

        System.out.println("Original String: " + input);
        System.out.println("String without duplicates: " + result);
    }
}
