package org.jatin.arrays.oneD;

import java.util.Arrays;

public class SuffixProduct {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[] result = suffixProduct(nums);

        System.out.println(Arrays.toString(result));
    }

    private static int[] suffixProduct(int[] nums) {
        int[] suffixProd = new int[nums.length];
        int n = nums.length;
        suffixProd[n-1] = nums[n-1];

        for (int i = n-2; i >= 0; i--) {
            suffixProd[i] = nums[i] * suffixProd[i+1];
        }
        return suffixProd;
    }
}
