package trees.RecoverBinarySearchTree_99;

import trees.TreeNode;

class Solution {

    private TreeNode first, second, prev = null;

    public void recoverTree(TreeNode root) {
        inorder(root);

        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);

        if (prev != null && root.val < prev.val) {
            if (first == null) {
                first = prev;
            }
            second = root;
        }
        prev = root;

        inorder(root.right);
    }
}
