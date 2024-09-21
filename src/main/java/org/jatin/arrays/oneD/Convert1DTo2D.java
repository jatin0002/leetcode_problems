package org.jatin.arrays.oneD;

import java.util.Arrays;

public class Convert1DTo2D {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        int row = 1;
        int col = 3;
        System.out.println(Arrays.deepToString(construct2DArray(arr, row,col)));
    }

    public static int[][] construct2DArray(int[] arr, int m, int n) {
        if (arr.length != m * n)
            return new int[0][0];
        int k = 0;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = arr[k++];
            }
        }
        return res;
    }
}
