package org.jatin.twopointer;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 1) return 0;
        int i = 0;
        int j = nums.length -1;
        int counter=0;
        while(i<j){
            while(i<j && nums[i] != val) i++;
            while(i<j && nums[j] == val) j--;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            counter++;
        }
        return nums.length - counter;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1};
        int target = 1;
        int res = removeElement(arr, target);
        System.out.println(Arrays.toString(arr));
        System.out.println(res);
    }
}
