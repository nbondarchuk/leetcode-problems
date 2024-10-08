package trees.PopulatingNextRightPointersInEachNodeII_117;

import java.util.LinkedList;
import java.util.Queue;

class Solution1 {

    private static class NodeAtLevel {

        Node node;

        int level;

        NodeAtLevel(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Queue<NodeAtLevel> queue = new LinkedList<>();
        queue.add(new NodeAtLevel(root, 1));

        while (!queue.isEmpty()) {
            NodeAtLevel n1 = queue.poll();
            if (n1.node.left != null) {
                queue.add(new NodeAtLevel(n1.node.left, n1.level + 1));
            }
            if (n1.node.right != null) {
                queue.add(new NodeAtLevel(n1.node.right, n1.level + 1));
            }

            NodeAtLevel n2 = queue.peek();
            if (n2 != null && n1.level == n2.level) {
                n1.node.next = n2.node;
            }
        }

        return root;
    }
}
