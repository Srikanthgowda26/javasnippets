import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {6, 7, 0, 5, 3, 0};

        // Sort the array
        Arrays.sort(arr);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
