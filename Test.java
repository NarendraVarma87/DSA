
public class Test {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 5, 4, 2, 8, 6, 9, 4 };
        duplicates(nums);
    }

    public static void duplicates(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
