package trees.BinaryTreeRightSideView_199;

import trees.TreeNode;

import java.util.*;

class Solution1 {

    private static class NodeAtLevel {

        private final int level;

        private final TreeNode node;

        NodeAtLevel(int level, TreeNode node) {
            this.level = level;
            this.node = node;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Queue<NodeAtLevel> queue = new LinkedList<>();

        if (root != null) {
            queue.add(new NodeAtLevel(1, root));
        }

        NodeAtLevel nodeAtLevel;
        while ((nodeAtLevel = queue.poll()) != null) {
            int level = nodeAtLevel.level;
            TreeNode node = nodeAtLevel.node;
            map.put(level, node.val);
            if (node.left != null) {
                queue.add(new NodeAtLevel(level + 1, node.left));
            }
            if (node.right != null) {
                queue.add(new NodeAtLevel(level + 1, node.right));
            }
        }

        return new ArrayList<>(map.values());
    }
}
