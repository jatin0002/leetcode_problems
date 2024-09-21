package org.jatin.dp.oneD.fibonacchi;

import java.util.Arrays;

public class FibonacchiMemoization {

    private static int fibonacchi(int n, int[] dp) {
        if(n<=1) return n;

        if(dp[n] != -1) return dp[n];

        return dp[n] = fibonacchi(n-1, dp) + fibonacchi(n-2, dp);
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int res = fibonacchi(n, dp);
        System.out.println(res);
    }
}
