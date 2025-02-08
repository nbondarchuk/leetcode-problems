package graphs.CourseSchedule_207;

import common.Difficulty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/course-schedule">Course Schedule</a>
 */
@Difficulty(MEDIUM)
class Solution {

    class Graph {

        private final int numVertexes;

        private final boolean directed;

        private final List<Integer>[] edges;

        Graph(int numVertexes) {
            this(numVertexes, false);
        }

        Graph(int numVertexes, boolean directed) {
            this.directed = directed;
            this.numVertexes = numVertexes;
            this.edges = new List[numVertexes + 1];
        }

        void addEdge(int x, int y) {
            addEdge(x, y, directed);
        }

        List<Integer> getEdges(int v) {
            return edges[v] != null ? List.copyOf(edges[v]) : Collections.emptyList();
        }

        private void addEdge(int x, int y, boolean directed) {
            if (edges[x] == null) {
                edges[x] = new ArrayList<>();
            }
            edges[x].add(y);

            if (!directed) {
                addEdge(y, x, true);
            }
        }
    }

    enum EdgeType {

        TREE, BACK, CROSS_OR_FORWARD
    }

    class Topsort {

        private int[] parent;

        private boolean[] processed;

        private boolean[] discovered;

        void sort(Graph g) {
            initSort(g);
            for (int i = 1; i <= g.numVertexes; i++) {
                if (!discovered[i]) {
                    dfs(g, i);
                }
            }
        }

        private void initSort(Graph g) {
            parent = new int[g.numVertexes + 1];
            processed = new boolean[g.numVertexes + 1];
            discovered = new boolean[g.numVertexes + 1];
        }

        private void dfs(Graph g, int v) {
            discovered[v] = true;
            processVertexEarly(v);

            for (Integer i : g.getEdges(v)) {
                if (!discovered[i]) {
                    parent[i] = v;
                    processEdge(v, i);
                    dfs(g, i);
                } else if (!processed[i] && parent[v] != i || g.directed) {
                    processEdge(v, i);
                }
            }

            processed[v] = true;
            processVertexLate(v);
        }

        private void processEdge(int x, int y) {
            EdgeType edgeType = getEdgeType(x, y);
            if (edgeType == EdgeType.BACK) {
                throw new IllegalStateException();
            }
        }

        private void processVertexLate(int v) {
        }

        private void processVertexEarly(int v) {
        }

        private EdgeType getEdgeType(int x, int y) {
            if (parent[y] == x) {
                return EdgeType.TREE;
            } else if (discovered[y] && !processed[y]) {
                return EdgeType.BACK;
            }
            return EdgeType.CROSS_OR_FORWARD;
        }
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Graph g = new Graph(numCourses, true);
        for (int i = 0; i < prerequisites.length; i++) {
            g.addEdge(prerequisites[i][1] + 1, prerequisites[i][0] + 1);
        }
        try {
            new Topsort().sort(g);
            return true;
        } catch (IllegalStateException e) {
            return false;
        }
    }
}
