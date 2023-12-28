import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 5, 6, 5, 4, 2, 8, 9, 4 };
        duplicates(nums);
    }

    public static void duplicates(int[] arr) {
        int count = 0;
        for (int i = arr.length; i > 0; i--) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count >= 2) {
                    System.out.print("Duplicate items " + arr[i]);
                }
            }
        }
    }
}
