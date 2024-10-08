package trees.SumRootToLeafNumbers_129;

import trees.TreeNode;

class Solution {

    public int sumNumbers(TreeNode root) {
        int[] ans = new int[1];
        traverse(root, 0, ans);
        return ans[0];
    }

    private void traverse(TreeNode node, int currentSum, int[] ans) {
        currentSum = currentSum * 10 + node.val;

        if (node.left == null && node.right == null) {
            ans[0] += currentSum;
            return;
        }

        if (node.left != null) {
            traverse(node.left, currentSum, ans);
        }

        if (node.right != null) {
            traverse(node.right, currentSum, ans);
        }
    }
}