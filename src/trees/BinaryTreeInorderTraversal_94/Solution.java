package trees.BinaryTreeInorderTraversal_94;

import trees.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/editorial/">Solution</a>
 */
public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private void traverse(TreeNode root, List<Integer> list) {
        if (root.left != null) {
            traverse(root.left, list);
        }
        list.add(root.val);
        if (root.right != null) {
            traverse(root.right, list);
        }
    }
}
