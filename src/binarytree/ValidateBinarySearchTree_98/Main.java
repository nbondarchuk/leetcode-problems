package binarytree.ValidateBinarySearchTree_98;

import binarytree.TreeNode;

/**
 * <a href="https://leetcode.com/problems/validate-binary-search-tree/">Validate Binary Search Tree</a>
 * <br/>
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * <br/>
 * A valid BST is defined as follows:
 * <ul>
 * <li>The left subtree of a node contains only nodes with keys less than the node's key.</li>
 * <li>The right subtree of a node contains only nodes with keys greater than the node's key.</li>
 * <li>Both the left and right subtrees must also be binary search trees.</li>
 * </ul>
 */
public class Main {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(new Solution().isValidBST(tree));
    }
}
