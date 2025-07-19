public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for centering
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print numbers from 1 to i with space
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println(); // Move to next line
        }
    }
}
