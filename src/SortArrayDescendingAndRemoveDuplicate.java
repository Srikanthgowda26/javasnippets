import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class SortArrayDescendingAndRemoveDuplicate {
    public static void main(String[] args) {
        // Example array with duplicate values
        Integer[] numbers = {3, 8, 1, 5, 2, 8, 3};

        // Remove duplicates using a LinkedHashSet
        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>(Arrays.asList(numbers));
        Integer[] uniqueNumbers = uniqueSet.toArray(new Integer[0]);

        // Sort the array in descending order
        Arrays.sort(uniqueNumbers, Collections.reverseOrder());

        // Print the sorted array without duplicates
        System.out.println("Array sorted in descending order without duplicates: " + Arrays.toString(uniqueNumbers));

        // Print the value at index 2
        if (uniqueNumbers.length > 2) {
            System.out.println("Value at index 2: " + uniqueNumbers[2]);
        } else {
            System.out.println("Index 2 does not exist.");
        }
    }
}
