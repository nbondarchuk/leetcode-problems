package trees.RecoverBinarySearchTree_99;

import common.Difficulty;
import trees.TreeNode;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/recover-binary-search-tree">Recover Binary Search Tree</a>
 * <p>
 * You are given the root of a binary search tree (BST),
 * where the values of exactly two nodes of the tree were swapped by mistake.
 * Recover the tree without changing its structure.
 * </p>
 */
@Difficulty(MEDIUM)
public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(3, null, new TreeNode(2)), null);
        new Solution().recoverTree(root);
        System.out.println(root);
    }
}
