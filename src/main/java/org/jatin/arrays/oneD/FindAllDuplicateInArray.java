package org.jatin.arrays.oneD;

import java.util.*;

public class FindAllDuplicateInArray {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int idx = Math.abs(nums[i]) - 1;
//            if (nums[idx] < 0)
//                res.add(idx+1);
//
//            nums[idx] *= -1;
//        }
//
//        return res;
        int n = nums.length;
        int[] visitied = new int[n + 1];
        for (int i = 0; i < nums.length; i++) {
            visitied[nums[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (visitied[i] > 1) {
                res.add(i);
            }
        }
        return res;
    }
}
