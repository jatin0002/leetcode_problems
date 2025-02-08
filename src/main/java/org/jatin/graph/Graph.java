package org.jatin.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {

    public static void dfs(int[][] adj, int u, boolean[] visited, List<Integer> res) {
        if (visited[u]) {
            return;
        }

        visited[u] = true;
        res.add(u);

        for (int v : adj[u]) {
            if (!visited[v]) {
                dfs(adj, v, visited, res);
            }
        }

    }


    public static void bfs(int[][] adj, int u, boolean[] visited, List<Integer> res) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(u);
        visited[u] = true;
        res.add(u);

        while (!queue.isEmpty()) {
            int k = queue.poll();
            for (int v : adj[k]) {
                if (!visited[v]) {
                    queue.offer(v);
                    visited[v] = true;
                    res.add(v);
                }
            }

        }
    }

    public static void main(String[] args) {
        boolean[] visited = new boolean[5];
        int[][] adj = new int[][]{{2, 3, 1}, {0}, {0, 4}, {0}, {2}};
        int u = 1;
        List<Integer> res = new ArrayList<>();
        dfs(adj, u, visited, res);
        System.out.println(res);
        res.clear();

        visited = new boolean[5];
        bfs(adj, u, visited, res);
        System.out.println(res);
    }
}
