package org.jatin.arrays.twoD;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] result = rotateImage(matrix);
    }

    private static int[][] rotateImage(int[][] matrix) {
        int n = matrix.length;
        int m = matrix.length;
        int[][] transpose = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

            }
        }

        return transpose;
    }
}
