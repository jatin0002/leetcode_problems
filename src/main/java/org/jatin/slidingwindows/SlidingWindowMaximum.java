package org.jatin.slidingwindows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ll = new ArrayList<>();
        int l = 0;
        int r = k-1;
        int n = nums.length;

        while (r < n) {
            int i = l;
            int max = Integer.MIN_VALUE;
            while (i <= r) {
                max = Math.max(nums[i], max);
                i++;
            }
            ll.add(max);
            l++;
            r++;
        }

        return ll.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
