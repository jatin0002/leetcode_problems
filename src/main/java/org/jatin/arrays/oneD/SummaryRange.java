package org.jatin.arrays.oneD;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};

        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        str.append(nums[0]);
        int temp = nums[0];
        for (int i = 1; i < 4; i++) {

            temp = temp ^ nums[i];
        }
        System.out.println(temp);
        return res;
    }
}
