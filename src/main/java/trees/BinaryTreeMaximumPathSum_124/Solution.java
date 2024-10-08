package trees.BinaryTreeMaximumPathSum_124;

import trees.TreeNode;

class Solution {

    private int maxSum;

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        traverse(root);
        return maxSum;
    }

    private int traverse(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = Math.max(0, traverse(node.left));
        int right = Math.max(0, traverse(node.right));

        maxSum = Math.max(maxSum, left + right + node.val);

        return Math.max(left, right) + node.val;
    }
}
