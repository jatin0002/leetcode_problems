package org.jatin.dp.oneD.fibonacchi;

public class FibonacchiNormal {

    private static int fibonacchi(int n) {
        if( n <= 1) return n;

        return fibonacchi(n-1) + fibonacchi(n-2);
    }

    public static void main(String[] args) {
        int res = fibonacchi(8);
        System.out.println(res);
    }
}
