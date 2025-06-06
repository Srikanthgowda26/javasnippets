public class ReverseSentence  {
    public static void main(String[] args) {
        String input = "We are learning Java";
        String[] Array = input.split(" ");
        for (int i = Array.length - 1; i >= 0; i--) {
            System.out.print(Array[i] + " ");
        }
    }
}
