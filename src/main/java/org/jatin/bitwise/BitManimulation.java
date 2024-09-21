package org.jatin.bitwise;

import java.util.Arrays;

public class BitManimulation {

    public static String convertNtoBinary(int n) {
        String res = "";
        while(n > 0) {
            int temp = n % 2;
            n = n / 2;
            res = temp + res;
        }
        return res;
    }

    public static int convertBinaryToInt(int bin) {
        int power = 0;
        int res = 0;
        while(bin > 0) {
            int unit = bin % 10;
            res += (int) (Math.pow(2, power)*unit);
            power++;
            bin = bin/10;
        }
        return res;
    }

    public static void checkIthBit(int n, int i) {
        if( (n & (1<<i)) != 0 ) {
            System.out.println(i + " position bit is set bit.");
        } else {
            System.out.println(i + " position bit is not set bit.");
        }
    }

    public static String setSetBitOnIthPosition(int n, int i) {
        int res = ( n | (i<<1) );
        return convertNtoBinary(res);
    }

    public static int countNumberOfSetBits(int n) {
        int count = 0;
        //while( n > 0 ) {
          //  if( (n&1) != 0) {
            //    count++;
            //}
            //n = n>>1;
        //}

        while( n > 0) {
            count++;
            n = n&(n-1);
        }
        return count;
    }


    public static void main(String[] args) {
//        checkIthBit(234, 4);
//        System.out.println(setSetBitOnIthPosition(59,2));
        System.out.println(convertBinaryToInt(0101));
        System.out.println(convertNtoBinary(15));
//        System.out.println(countNumberOfSetBits(253));
        System.out.println(1^3^4^2^2);
    }
}
