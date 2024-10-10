package trees.FlattenBinaryTreeToLinkedList_114;

import trees.TreeNode;

class Solution2 {

    private TreeNode lastNode = new TreeNode();

    public void flatten(TreeNode root) {
        traverse(root);
    }

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }

        lastNode.left = null;
        lastNode.right = node;

        lastNode = node;

        TreeNode left = node.left;
        TreeNode right = node.right;

        traverse(left);
        traverse(right);
    }
}
