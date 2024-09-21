package org.jatin.arrays.oneD;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1, c = 0;
        while (i < j) {
            if (nums[j] == val) {
                j--;
                c++;
            } else if (nums[i] != val) {
                i++;
            } else {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j--;
                c++;
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(c);
        return nums.length - c;
    }
}
