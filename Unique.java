public class Unique {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 3, 2, 2, 9, 7, 4, 1, 1 };

        // duplicates
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt == 1)
                System.out.print(arr[i] + " ");
        }

    }
}
