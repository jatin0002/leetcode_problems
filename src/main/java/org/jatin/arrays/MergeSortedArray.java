package org.jatin.arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
        int m = 3;

        int[] nums2 = new int[]{1, 2, 3};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0)
            return;

        int i = 0, j = 0;
        while (i < m) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                i++;
            }
        }
        while (j < n) {
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }
}
