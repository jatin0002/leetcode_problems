package org.jatin.arrays.oneD;

import java.util.Arrays;

public class MoveZeros {

    public static void moveZeroesTwoPointerApproch(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return;
        }

        int i = 0;
        int nonZeroIndex = 0;

        while (i != n) {
            if (nums[i] != 0) {
                if (i != nonZeroIndex) {
                    nums[nonZeroIndex] = nums[i];
                    nums[i] = 0;
                }
                nonZeroIndex++;
            }
            i++;
        }
    }

    public static void moveZeroesOnePointerApproch(int[] nums) {

        int j = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[j] = num;
                j++;
            }
        }

        while (j < nums.length) {
            nums[j++] = 0;
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 3, 0, 12};
//        moveZeroesTwoPointerApproch(arr);
        moveZeroesOnePointerApproch(arr);
        System.out.println(Arrays.toString(arr));
    }
}
