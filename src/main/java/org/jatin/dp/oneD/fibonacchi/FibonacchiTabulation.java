package org.jatin.dp.oneD.fibonacchi;

import java.util.Arrays;

public class FibonacchiTabulation {

    private static int fibo(int n, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 8;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int res = fibo(n, dp);
        System.out.println(res);
    }
}
