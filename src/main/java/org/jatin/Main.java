package org.jatin;

import java.util.ArrayList;
import java.util.Random;

public class Main {


    public static String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        int l1 = word1.length();
        int l2 = word2.length();
        StringBuilder str = new StringBuilder();
        while(i < l1 && j < l2 ){
            str.append(word1.charAt(i));
            str.append(word2.charAt(j));
            i++;
            j++;
        }

        while(i< l1){
            str.append(word1.charAt(i));
            i++;
        }
        while(j< l2){
            str.append(word2.charAt(j));
            j++;
        }
        return str.toString();
    }
    public static void main(String[] args) {
        System.out.println("The missing number is: " + mergeAlternately("abc", "pqr"));
    }
}