package org.jatin.arrays.oneD;

import java.util.Arrays;

public class PrefixProduct {
    public static int[] prefixProduct(int[] nums){
        int[] prefixProd = new int[nums.length];
        prefixProd[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixProd[i] = nums[i] * prefixProd[i-1];
        }
        return prefixProd;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[] result = prefixProduct(nums);

        System.out.println(Arrays.toString(result));
    }
}
