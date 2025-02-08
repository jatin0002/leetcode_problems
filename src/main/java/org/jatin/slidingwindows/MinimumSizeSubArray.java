package org.jatin.slidingwindows;

public class MinimumSizeSubArray {

    public static int minSubArrayLen(int target, int[] nums) {
        int r = 0, l = 0;
        int minlen = Integer.MAX_VALUE;
        int sum = 0;

        while (r < nums.length) {
            sum += nums[r];

            while (sum >= target) {
                minlen = Math.min(minlen , r - l +1);
                sum -= nums[l];
                l++;
            }
            r++;
        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11, new int[]{1, 2, 3, 4, 5}));
    }
}
