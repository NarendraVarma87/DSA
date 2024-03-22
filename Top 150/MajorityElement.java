/*
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:

Input: nums = [3,2,3]
Output: 3
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int majorityElement = 0;

        for (int num : nums) {
            if (count == 0) {
                majorityElement = num;
            }
            count += (num == majorityElement) ? 1 : -1;
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 3, 4, 4, 4, 3 };
        System.out.println(majorityElement(nums));
    }
}
