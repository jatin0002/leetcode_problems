package org.jatin.dp.oneD;

import java.util.Arrays;

public class FrogJump {

    public static int minCostByMemoization(int[] height) {
        int n = height.length;
        int[] dp = new int[n];
        Arrays.fill(dp ,-1);

        return solveByMemoization(n-1, height, dp);
    }

    public static int minCostByTabulation(int[] height) {
        int n = height.length;
        int[] dp = new int[n];

        return solveByTabulation(n, height, dp);

    }

    public static int solveByMemoization(int n,int[] arr, int[] dp){
        if(n == 0){
            return 0;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int left = solveByMemoization(n-1, arr, dp) + Math.abs(arr[n] - arr[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1){
            right = solveByMemoization(n-2,arr, dp) + Math.abs(arr[n] - arr[n-2]);
        }

        dp[n] = Math.min(left,right);
        return dp[n];
    }

    public static int solveByTabulation(int n, int[] arr, int[] dp){
        for (int i = 1; i <= n-1; i++) {
            int fs = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i>1){
                ss = dp[i-2] + Math.abs(arr[i] - arr[i-2]);
            }
            dp[i] = Math.min(fs,ss);
        }

        return dp[n-1];
    }

    public static int solveButWithSpaceOptimization(int[] arr){
        int prev1 = 0;
        int prev2 = 0;

        for (int i = 1; i < arr.length-1; i++) {
            int fs = prev1 + Math.abs(arr[i] - arr[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i>1){
                ss = prev2 + Math.abs(arr[i] - arr[i-2]);
            }
            prev1 = Math.min(fs, ss);
            prev2 = prev1;
        }

        return prev1;
    }

    public static void main(String[] args) {
        int[] height = new int[]{10, 30, 40, 20, 50};
        System.out.println(minCostByMemoization(height));
        System.out.println(minCostByTabulation(height));
        System.out.println(solveButWithSpaceOptimization(height));
    }
}
