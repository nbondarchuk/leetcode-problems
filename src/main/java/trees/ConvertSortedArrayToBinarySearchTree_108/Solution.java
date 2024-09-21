package trees.ConvertSortedArrayToBinarySearchTree_108;

import trees.TreeNode;

class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums, 0, nums.length - 1);
    }

    private TreeNode toBST(int[] nums, int start, int end) {
        if (end < start) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        if (mid > 0)
            node.left = toBST(nums, start, mid - 1);
        if (mid < nums.length - 1)
            node.right = toBST(nums, mid + 1, end);
        return node;
    }
}
