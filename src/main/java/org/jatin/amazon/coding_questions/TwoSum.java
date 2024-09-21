package org.jatin.amazon.coding_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int target = 10;
        int[] arr = new int[]{5,7,2,8,4,3};
        ArrayList<Integer []> res = twoSum(target, arr);
        for(Integer[] r : res){
            System.out.println(Arrays.toString(r));
        }
            }

    private static ArrayList<Integer []> twoSum(int target, int[] arr) {
        ArrayList<Integer [] > res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(i,arr[i]);
        }
        for (int j : arr) {
            if (map.containsValue(target - j)) {
                res.add(new Integer[]{j, target - j});
            }
        }

        return res;
    }
}
