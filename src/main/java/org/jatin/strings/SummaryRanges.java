package org.jatin.strings;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        List<String> res = summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        System.out.println(res);
    }

    public static List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        int start = 0;

        List<String> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i < n && nums[i] == nums[i - 1] + 1) {
                continue;
            }

            if (start == nums[i - 1]) {
                res.add(String.valueOf(start));
            } else {
                res.add(start + "->" + nums[i-1]);
            }

            if (i < n) {
                start = nums[i];
            }
        }
        return res;
    }
}
