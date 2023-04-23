package trees.ConvertSortedArrayToBinarySearchTree_108;

import trees.TreeNode;

public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = bst(nums, 0, mid);
        if (mid < nums.length - 1) {
            root.right = bst(nums, mid + 1, nums.length);
        }
        return root;
    }

    private TreeNode bst(int[] nums, int left, int right) {
        if (right <= left) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = bst(nums, left, mid);
        if (mid < right - 1) {
            node.right = bst(nums, mid + 1, right);
        }
        return node;
    }
}
