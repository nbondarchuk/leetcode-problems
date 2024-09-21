package graphs.FindIfPathExistsInGraph_1971;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Set<Integer> visited = new HashSet<>();

        Queue<Integer> workingQueue = new LinkedList<>();
        workingQueue.add(source);
        while (!workingQueue.isEmpty()) {
            Integer v = workingQueue.poll();
            if (v == destination) {
                return true;
            }

            if (visited.contains(v)) {
                continue;
            }

            for (int i = 0; i < edges.length; i++) {
                int[] edge = edges[i];
                if (edge[0] == v) {
                    workingQueue.add(edge[1]);
                }
                if (edge[1] == v) {
                    workingQueue.add(edge[0]);
                }
            }

            visited.add(v);
        }
        return false;
    }
}
