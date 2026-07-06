/*program sorts an array of integers based on their square values. Use same array.
i/p = [10, -7, 6, -4, 12, -15]
o/p = [-4, 6, -7, 10, 12, -15]*/

public class SortBasedOnSquares {
    public static void main(String[] args) {

        int[] arr = {10, -7, 6, -4, 12, -15};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++){
                if (arr[j] * arr[j] < arr[min] * arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
