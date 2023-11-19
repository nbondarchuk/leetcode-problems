package trees.SameTree_100;

import trees.TreeNode;

class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return compare(p, q);
    }

    private boolean compare(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        boolean same = compare(p.left, q.left);
        if (!same) {
            return false;
        }
        return compare(p.right, q.right);
    }
}
