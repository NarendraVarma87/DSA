import java.util.Arrays;

class Selection22 {
    public static int[] select(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 8, 9, 6, 4, 5, 1, 3, 2 };
        select(nums);
        System.out.println(Arrays.toString(nums));
    }
}