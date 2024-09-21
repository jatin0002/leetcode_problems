package org.jatin.slidingwindows;

import java.util.Arrays;

public class MaximumAverageSubArrayI {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1};
        int k = 1;

//        System.out.println(findMaxAverage(nums,k));
        System.out.println(Arrays.toString(solve(nums)));
    }

    public static int[] solve(int[] A) {
        int i=0;
        int j=A.length-1;

        while(i<=j){
            if(A[i] == 0){
                i++;
            }else if(A[j] == 1){
                j--;
            }else{
                int t = A[i];
                A[i] = A[j];
                A[j] = t;
                i++;
                j--;
            }
        }
        return A;
    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int max= 0;
        int l=0;
        for (int i = 0; i < k; i++) {
           sum += nums[i];
        }
        max = sum;

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[l] + nums[i];
            l++;
            max = Math.max(sum , max);
        }

        return (double) max /k ;
    }
}
