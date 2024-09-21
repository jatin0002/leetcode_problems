package org.jatin.twopointer;

public class ValidPalindrome2 {
    public static boolean validPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            int l = 0;
            int r = s.length() - 1;

            while (l < r) {
                if (i == l) {
                    l++;
                } else if (i == r) {
                    r--;
                } else if (s.charAt(l) != s.charAt(r)) {
                    break;
                } else {
                    l++;
                    r--;
                }

                if (l >= r) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "eccer";
        System.out.println(validPalindrome(s));
    }
}
