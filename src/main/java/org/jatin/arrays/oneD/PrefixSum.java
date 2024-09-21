package org.jatin.arrays.oneD;

import java.util.Arrays;

public class PrefixSum {

    static boolean isSetBit(int n) {
        if((n & 1) != 0) return true;
        return false;
    }
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
        int count = 1;
        while(n>0) {
            if(isSetBit(n)) {
                return count;
            }
            count++;
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] prefixArr = new int[arr.length];
        prefixArr[0] = 1;

        for (int i = 1; i < prefixArr.length; i++) {
            prefixArr[i] = arr[i] + prefixArr[i-1];
        }

        System.out.println(Arrays.toString(prefixArr));
        System.out.println(getFirstSetBit(15));
    }
}
