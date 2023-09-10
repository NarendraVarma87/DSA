import java.util.*;

class Insertion {
    public static void insert(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > current) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 45, 2, 6, 7, 56, 87, -2, 6 };
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }
}