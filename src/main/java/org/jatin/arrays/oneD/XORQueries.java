package org.jatin.arrays.oneD;

import java.util.Arrays;

public class XORQueries {

    public static int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;

        // Prefix Array
        int[] prefixArr = new int[n];
        prefixArr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixArr[i] = prefixArr[i - 1] ^ arr[i];
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            if (l > 0) {
                res[i] = prefixArr[r] ^ prefixArr[l - 1];
            } else {
                res[i] = prefixArr[r];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{16};
        int[][] queries = new int[][]{{0, 0}, {0, 0}, {0, 0}};
        System.out.println(Arrays.toString(xorQueries(arr, queries)));
    }
}
