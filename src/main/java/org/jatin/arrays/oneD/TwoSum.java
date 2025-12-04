package org.jatin.arrays.oneD;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Given an array of integers nums and an integer target,
    // return indices of the two numbers such that they add up to target.


    // TC in LC: 2ms due to HashMap
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int tar = target - nums[i];
            if (map.containsKey(tar)) {
                int keyIndx = map.get(tar);
                return new int[]{keyIndx, i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[2];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 3};
        int target = 6;

        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

}
