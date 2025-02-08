package org.jatin.slidingwindows;

public class LengthOfLongestSubstring {
    // Brute force approch
//    public static int lengthOfLongestSubstring(String s) {
//
//        int n = s.length();
//        int len = 0;
//        int maxLen = 0;
//
//        for (int i = 0; i < n; i++) {
//            int[] hash = new int[256];
//            for (int j = i; j < n; j++) {
//                if (hash[s.charAt(j)] == 1)
//                    break;
//
//                len = j - i + 1;
//                maxLen = Math.max(len, maxLen);
//                hash[s.charAt(j)] = 1;
//            }
//        }
//
//        return maxLen;
//    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;

        return maxLen;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }
}
