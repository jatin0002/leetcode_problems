package org.jatin.arrays.oneD;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int indx = Math.abs(nums[i]) - 1;
            if (nums[indx] < 0)
                continue;

            nums[indx] *= -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
