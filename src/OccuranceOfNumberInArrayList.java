import java.lang.reflect.Array;

public class OccuranceOfNumberInArrayList {
    public static void main(String[] args) {
        int[] Array = {1,2,3,2,4,2,5};
        int target = 2;
        int count = 0;

        for (int i :Array) {
            if (i == target) {
                count++;
            }
        }
        System.out.println(target + " occurs " + count + " times");
    }

}
