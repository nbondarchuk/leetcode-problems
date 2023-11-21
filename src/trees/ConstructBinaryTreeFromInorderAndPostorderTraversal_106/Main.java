package trees.ConstructBinaryTreeFromInorderAndPostorderTraversal_106;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal">Construct Binary Tree from Inorder and Postorder Traversal</a>
 * <p>
 * Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree
 * and postorder is the postorder traversal of the same tree, construct and return the binary tree.
 * </p>
 */
@Difficulty(MEDIUM)
public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3}));
    }
}
