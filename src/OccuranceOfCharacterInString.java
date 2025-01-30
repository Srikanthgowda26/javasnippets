public class OccuranceOfCharacterInString {
    public static void main(String[] args) {
        String str = "APPLES";
        char target = 'P';
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        System.out.println(target + " occurs " + count + " times in " + str);
    }

}
