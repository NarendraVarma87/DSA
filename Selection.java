//import java.util.Arrays;

public class Selection {
    public static void main(String args[]) {
        int[] nums = { 2, 1, 8, 3, 5, 9 };
        selection_sort(nums);
        // System.out.println(Arrays.toString(nums));
        for (int i : nums) {
            System.out.println(i + " ");
        }
    }

    public static int[] selection_sort(int[] nums) {
        int n = nums.length; // length of nums array
        for (int i = 0; i <= n - 2; i++) {
            int minIndx = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (nums[j] < nums[minIndx]) {
                    minIndx = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[minIndx];
            nums[minIndx] = tmp;
        }
        return nums;
    }
}

/*
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
