package org.jatin.arrays.twoD;

import java.util.Arrays;

public class SetZeros {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        setZeros(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void setZeros(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[] rows = new int[row];
        int[] cols = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0)
                    rows[i] = 1;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0)
                    cols[j] = 1;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rows[i] == 1 || cols[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
