package trees.KthSmallestElementInaBST_230;

import trees.TreeNode;

class Solution {

    int c = 0;

    int ans = -1;

    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return ans;
    }

    void traverse(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        traverse(root.left, k);

        c++;
        if (c == k) {
            ans = root.val;
            return;
        }

        traverse(root.right, k);
    }
}
