public class CaseConverter {
    public static void main(String[] args) {
        String input = "Hello World 123!";
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch); // keep digits and symbols as is
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Converted: " + result.toString());

    }
}
