package org.jatin.strings;

public class FindheFirstOccurance {
    public static int strStr(String haystack1, String needle1) {
        int len = haystack1.length();
        int len1 = needle1.length();  // 5 -> 4

        if (len < len1) {
            return -1;
        }

        if(len == len1 && haystack1.equals(needle1)){
            return 0;
        }

        int index = -1;
        int l = 0, r = 0;

        char[] haystack = haystack1.toCharArray(); // a,b,c
        char[] needle = needle1.toCharArray();     // c

        while (r < len && l <= len1) {
            if (haystack[r] == needle[l]) {
                if (index == -1) {
                    index = r;
                }
                l++;
            } else {
                index = -1;
                l = 0;
            }
            r++;
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println(strStr("abc", "c"));
//        System.out.println(strStr("leetcodeleeto", "leeto"));
//        System.out.println(strStr("leetcode", "leeto"));
//        System.out.println(strStr("sadbutsad", "sad"));
    }
}
