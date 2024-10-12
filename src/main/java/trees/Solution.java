package trees;

class Solution {

    public boolean isValidBST(TreeNode root) {
        return isValid(root.left, null, 2) && isValid(root.right, 2, null);
    }

    private boolean isValid(TreeNode node, Integer min, Integer max) {
        if (node == null) return true;
        if (min != null && node.val <= min) {
            return false;
        }
        if (max != null && node.val >= max) {
            return false;
        }
        return isValid(node.left, max, node.val) && isValid(node.right, node.val, min);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(1), null);
        new Solution().isValidBST(root);
    }
}