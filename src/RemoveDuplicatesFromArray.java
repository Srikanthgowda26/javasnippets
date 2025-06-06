import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Integer[] inputArray = {1, 2, 3, 4, 1, 2};
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer num : inputArray) {
            if (!result.contains(num)) result.add(num);
        }

        System.out.println("Array without duplicates: " + result);
    }
}
