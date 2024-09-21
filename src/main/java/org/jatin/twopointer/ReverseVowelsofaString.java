package org.jatin.twopointer;

import java.util.*;

public class ReverseVowelsofaString {

    // Solution takes 24 ms

//    public static String reverseVowels(String str) {
//        String[] s = str.split("");
//        int i = 0;
//        int j = s.length - 1;
//        while (i < j) {
//            if (!isVowel(s[i])) {
//                i++;
//            } else if (!isVowel(s[j])) {
//                j--;
//            } else {
//                String temp = s[i];
//                s[i] = s[j];
//                s[j] = temp;
//                i++;
//                j--;
//            }
//        }
//        return String.join("", s);
//    }
//
//    private static boolean isVowel(String ch) {
//        return ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u") || ch.equals("A")
//                || ch.equals("E") || ch.equals("I") || ch.equals("O") || ch.equals("U");
//    }

    // Solution takes 18 ms

//    public static  String reverseVowels(String str) {
//        String[] s = str.split("");
//        List<String> l = new ArrayList<>();
//        l.add("a");
//        l.add("e");
//        l.add("i");
//        l.add("o");
//        l.add("u");
//        l.add("A");
//        l.add("E");
//        l.add("I");
//        l.add("O");
//        l.add("U");
//        Set<String> set = new HashSet<>(l);
//        int i = 0;
//        int j = s.length - 1;
//        while (i < j) {
//            if (!set.contains(s[i])) {
//                i++;
//            } else if (!set.contains(s[j])) {
//                j--;
//            } else {
//                String temp = s[i];
//                s[i] = s[j];
//                s[j] = temp;
//                i++;
//                j--;
//            }
//        }
//        return String.join("", s);
//    }

    // Solution takes 6 ms
    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u',
                'A', 'E', 'I', 'O', 'U'));
        int i = 0;
        int j = sb.length() - 1;
        while (i < j) {
            if (!set.contains(sb.charAt(i))) {
                i++;
            } else if (!set.contains(sb.charAt(j))) {
                j--;
            } else {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverseVowels(s));
    }
}
