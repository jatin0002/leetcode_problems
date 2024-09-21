package org.jatin.dp.oneD.fibonacchi;

public class FibonacchiConstatntSpace {

    public static void main(String[] args) {
        int n = 8;
        int prev = 1;
        int prev2 = 0;

        for (int i = 2; i <=n ; i++) {
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }

        System.out.println(prev);
    }

}
