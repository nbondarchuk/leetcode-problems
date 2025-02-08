package graphs.CloneGraph_133;

import common.Difficulty;

import java.util.*;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/clone-graph">Clone Graph</a>
 */
@Difficulty(MEDIUM)
class Solution {

    static class Node {

        public int val;

        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<>();
        }

        public Node(int _val, List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        return bfs(node);
    }

    private final Queue<Node> queue = new LinkedList<>();

    private final Set<Integer> discovered = new HashSet<>();

    private Node bfs(Node node) {
        queue.add(node);
        discovered.add(node.val);

        Map<Node, Node> nodeMap = new HashMap<>();
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            Node nCopy = nodeMap.get(n);
            if (nCopy == null) {
                nCopy = new Node(n.val);
                nodeMap.put(n, nCopy);
            }

            for (Node nn : n.neighbors) {
                Node nnCopy = nodeMap.get(nn);
                if (nnCopy == null) {
                    nnCopy = new Node(nn.val);
                    nodeMap.put(nn, nnCopy);
                }
                nCopy.neighbors.add(nnCopy);

                if (!discovered.contains(nn.val)) {
                    discovered.add(nn.val);
                    queue.add(nn);
                }
            }
        }

        return nodeMap.get(node);
    }

    public static void main(String[] args) {
        Node node = new Node(1, List.of(new Node(2), new Node(4)));
        new Solution().cloneGraph(node);
    }
}