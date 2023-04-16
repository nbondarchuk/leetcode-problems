package trees.BinaryTreeInorderTraversal_94;

import trees.TreeNode;

/**
 * <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/description/">Binary Tree Inorder Traversal</a>
 */
public class Main {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(new Solution().inorderTraversal(tree));
    }
}
