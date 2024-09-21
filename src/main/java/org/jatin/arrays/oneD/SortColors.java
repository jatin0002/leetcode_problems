package org.jatin.arrays.oneD;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 0, 2, 1, 1, 0};
        System.out.println(Arrays.toString(arr));
    }

    public static void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] == 2 && nums[j] != 2) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j--;
            } else if (nums[j] == 1) {

            }
        }
    }
}
