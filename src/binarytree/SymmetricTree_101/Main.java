package binarytree.SymmetricTree_101;

import binarytree.TreeNode;

/**
 * <a href="https://leetcode.com/problems/symmetric-tree/description/">Symmetric Tree</a>
 */
public class Main {

    public static void main(String[] args) {
        TreeNode leftSubTree = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode rightSubTree = new TreeNode(2, new TreeNode(4), new TreeNode(3));

        TreeNode tree = new TreeNode(1, leftSubTree, rightSubTree);
        System.out.println(new RecursiveSolution().isSymmetric(tree));
        System.out.println(new IterativeSolution().isSymmetric(tree));


        leftSubTree = new TreeNode(2, null, new TreeNode(3));
        rightSubTree = new TreeNode(2, null, new TreeNode(3));

        tree = new TreeNode(1, leftSubTree, rightSubTree);
        System.out.println(new RecursiveSolution().isSymmetric(tree));
        System.out.println(new IterativeSolution().isSymmetric(tree));
    }
}
