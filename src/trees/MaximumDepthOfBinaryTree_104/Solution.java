package trees.MaximumDepthOfBinaryTree_104;

import trees.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        AtomicInteger maxDepth = new AtomicInteger();
        traverse(root, maxDepth, 1);
        return maxDepth.get();
    }

    private void traverse(TreeNode root, AtomicInteger maxDepth, int depth) {
        if (depth > maxDepth.get()) {
            maxDepth.set(depth);
        }
        if (root.left != null) {
            traverse(root.left, maxDepth, depth + 1);
        }
        if (root.right != null) {
            traverse(root.right, maxDepth, depth + 1);
        }
    }
}
