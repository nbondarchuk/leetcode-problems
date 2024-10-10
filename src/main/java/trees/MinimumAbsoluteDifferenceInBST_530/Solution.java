package trees.MinimumAbsoluteDifferenceInBST_530;

import trees.TreeNode;

class Solution {

    private int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        traverse(root);
        return min;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            min = Math.min(min, Math.abs(root.val - findMax(root.left)));
            traverse(root.left);
        }

        if (root.right != null) {
            min = Math.min(min, Math.abs(root.val - findMin(root.right)));
            traverse(root.right);
        }
    }

    private int findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    private int findMax(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }
}