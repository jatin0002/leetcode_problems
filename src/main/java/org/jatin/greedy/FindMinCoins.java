package org.jatin.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FindMinCoins {

//    Given a value of V Rs and an infinite supply of each of the denominations {1, 2, 5, 10, 20, 50, 100, 500, 1000}
//    valued coins/notes, The task is to find the minimum number of coins and/or notes needed to make the change?

    static Integer[] deno = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
    static int  n = deno.length;

    // Approch
    // first sort the deno array in decreasing order
    // create one result  array
    // Finde the largest deno that is smaller then remainning amount and keep adding deno while the remaining amount is zero

    public static ArrayList<Integer> findMinCoins(int V, Integer[] deno) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(deno, Collections.reverseOrder());

        for (int i = 0; i < deno.length; i++) {
            if(V >= deno[i]){
                V -= deno[i];
                res.add(deno[i]);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int V = 121;
        ArrayList<Integer> res = findMinCoins(V, deno);
        System.out.println(res);
    }
}
