package trees.PopulatingNextRightPointersInEachNodeII_117;

import java.util.LinkedList;
import java.util.Queue;

class Solution2 {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node n1 = queue.poll();
                if (n1.left != null) {
                    queue.add(n1.left);
                }
                if (n1.right != null) {
                    queue.add(n1.right);
                }

                if (i < levelSize - 1) {
                    n1.next = queue.peek();
                }
            }
        }

        return root;
    }
}
