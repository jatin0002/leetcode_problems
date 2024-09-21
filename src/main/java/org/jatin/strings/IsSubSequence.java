package org.jatin.strings;

public class IsSubSequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }else{
                j++;
            }
            if(i == s.length()-1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
    }
}
