package org.jatin.twopointer;

public class ResverseOnlyLetters {

    public static String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while (i < j) {
            if (!Character.isLetter(s.charAt(i))) {
                i++;
            } else if (!Character.isLetter(s.charAt(j))) {
                j--;
            } else {
                char ch = s.charAt(i);
                sb.setCharAt(i , s.charAt(j));
                sb.setCharAt(j , ch);
                i++;
                j--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String  s = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(s));
    }
}
