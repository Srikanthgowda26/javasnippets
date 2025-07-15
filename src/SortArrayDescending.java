import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {
    public static void main(String[] args) {
        Integer[] numbers = {3, 8, 1, 5, 2};

        // Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // Sort the array
        //Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Array sorted in descending order: " + Arrays.toString(numbers));

        // Print the value at index 2
        System.out.println("Value at index 2: " + numbers[0]);
    }
}
