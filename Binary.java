class Binary {
    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (target > nums[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 8, 12, 45 };
        int target = 45;
        System.out.println(binarySearch(arr, target));
    }
}

/*
 * class Binary {
 * public static void main(String[] args) {
 * int[] arr = { 2, 4, 6, 8, 12, 16, 24, 36 };
 * int start = 0;
 * int end = arr.length - 1;
 * int target = 26;
 * while (start <= end) {
 * int mid = start + (end - start) / 2;
 * if (arr[mid] == target) {
 * System.out.println(mid);
 * break;
 * } else if (target > arr[mid]) {
 * start = mid + 1;
 * } else if (target < arr[mid]) {
 * end = mid - 1;
 * }
 * }
 * System.out.println("not found");
 * }
 * }
 */