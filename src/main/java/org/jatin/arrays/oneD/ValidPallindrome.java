package org.jatin.arrays.oneD;

public class ValidPallindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {

        if (s.length() == 1) {
            return true;
        }

        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (!Character.isLetter(arr[i])) {
                i++;
            } else if (!Character.isLetter(arr[j])) {
                j--;
            } else {
                char c1 = Character.toLowerCase(arr[i]);
                char c2 = Character.toLowerCase(arr[j]);
                if (c1 != c2) {
                    return false;
                }
                i++;
                j--;


            }
        }
        return true;
    }
}
