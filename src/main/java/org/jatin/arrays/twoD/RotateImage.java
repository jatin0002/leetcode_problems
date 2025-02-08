package org.jatin.arrays.twoD;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotateImage(matrix);

        System.out.println(Arrays.deepToString(matrix));
    }

    private static void rotateImage(int[][] matrix) {
        int rowL = matrix.length;
        int colL = matrix.length;

        for (int i = 0; i < rowL; i++) {
                int temp = matrix[i][colL-1-i];
                matrix[i][colL-1-i] = matrix[i][i];
                matrix[i][i] = temp;
        }

        for (int i = 0; i < rowL; i++) {
                int temp = matrix[rowL - 1 - i][colL - 1 - i];
                matrix[rowL - 1 - i][colL - 1 - i] = matrix[i][i];
                matrix[i][i] = temp;
        }



    }
}
