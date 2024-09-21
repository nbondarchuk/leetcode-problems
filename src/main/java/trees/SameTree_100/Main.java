package trees.SameTree_100;

import common.Difficulty;
import trees.TreeNode;

import static common.DifficultyLevel.EASY;

/**
 * <a href="https://leetcode.com/problems/same-tree">Same Tree</a>
 * <p>
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * </p>
 * <p>
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 * </p>
 */
@Difficulty(EASY)
public class Main {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(new Solution().isSameTree(p, q));

        TreeNode p1 = new TreeNode(1, new TreeNode(2), null);
        TreeNode q1 = new TreeNode(1, null, new TreeNode(3));
        System.out.println(new Solution().isSameTree(p1, q1));
    }
}
