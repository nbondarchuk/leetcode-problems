package trees.PathSum_112;

import trees.TreeNode;

class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return traverse(root, 0, targetSum);
    }

    private boolean traverse(TreeNode node, int sum, int targetSum) {
        if (node == null) {
            return false;
        }

        if (node.left == null && node.right == null) {
            return sum + node.val == targetSum;
        }

        boolean res = traverse(node.left, sum + node.val, targetSum);
        if (res) {
            return true;
        }
        return traverse(node.right, sum + node.val, targetSum);
    }
}
