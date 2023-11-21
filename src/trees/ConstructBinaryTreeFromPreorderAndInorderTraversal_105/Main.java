package trees.ConstructBinaryTreeFromPreorderAndInorderTraversal_105;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal">Construct Binary Tree from Preorder and Inorder Traversal</a>
 * <p>
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree
 * and inorder is the inorder traversal of the same tree, construct and return the binary tree.
 * </p>
 */
@Difficulty(MEDIUM)
public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7}));
    }
}
