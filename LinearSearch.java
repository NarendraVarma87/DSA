class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 12, 16, 18, 22, 24, 28, 36, 42 };
        int target = 42;
        System.out.println(linearSearch(arr, target));
    }
}