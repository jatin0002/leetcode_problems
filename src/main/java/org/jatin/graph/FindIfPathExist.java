package org.jatin.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindIfPathExist {

    public static boolean validPath(int n, int[][] adj, int u, int d, boolean[] visited) {
//        if(visited[])
        return true;
    }

    public static void main(String[] args) {
        int[][] adj = new int[][]{{0, 1}, {1, 2}, {2, 0}};
        int n = adj.length;
        boolean[] visited = new boolean[n];
        int u = 0;
        int d = 2;
        System.out.println(validPath(n, adj, u, d, visited));


        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());


        q.add(2);
        q.add(7);
        q.add(4);
        q.add(1);
        q.add(8);
        q.add(1);





        System.out.println(q.size());

    }
}
