package org.jatin.arrays.oneD;

import java.util.Arrays;

public class TwoSum_II {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{-1,0} , -1)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length -1;

        while( i<j) {
            int t = target - numbers[i];
            if( t < numbers[j]){
                j--;
            }else if(t > numbers[j]){
                i++;
            }else{
                return new int[]{i+1,j+1};
            }
        }
        return new int[2];
    }
}
