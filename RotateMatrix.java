/*Rotate Image (90° Clockwise)

You are given an n × n 2D matrix representing an image. Rotate the image by 90 degrees clockwise.

You must rotate the image in place, which means you have to modify the input matrix directly. Do not allocate another 2D matrix.*/
import java.util.Arrays;

public class RotateMatrix {

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        //Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotate(matrix);

        System.out.println("Rotated Matrix:");
        printMatrix(matrix);
    }
}