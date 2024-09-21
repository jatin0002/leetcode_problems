package org.jatin.twopointer;

import java.util.*;
import java.util.stream.Stream;

public class ThreeSum {

    // return all the triplets arr[i], arr[j], arr[k]
    // such that i!=j, j!=k, k!=i and arr[i] + arr[j] + arr[k] = 0

    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        int n = nums.length - 1;
        Arrays.sort(nums); // nLog(n)

        for (int k = 0; k < n; k++) {
            int i = k + 1;
            int j = n;
            int target = -nums[k];

            while (i < j) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    i++;
                    j--;
                } else {
                    if (target < nums[i]) {
                        j--;
                    } else {
                        i++;
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}
