package org.jatin.arrays.oneD;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,3,4}));


        String s="the sky is blue";

        List<String> list = Arrays.stream(s.split(" ")).filter(it -> !it.isEmpty()).toList();
        String[] arr = new String[list.size()];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = list.get(i);
        }

        int i=0, j=arr.length-1;
        while(i<j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

     StringBuilder st = new StringBuilder();
     st.append(arr[0]).append(" ");
        for (int k = 1; k < arr.length; k++) {
            st.append(arr[i]).append(" ");
        }

        System.out.println(st.toString().trim());
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 0);
            }
        }
        int max_count = 0;
        int val = nums[0];

        for (int num : nums) {
            if (max_count > map.get(num)) {
                val = num;
                max_count++;
            }
        }

        return val;

    }
}
