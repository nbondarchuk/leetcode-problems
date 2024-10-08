package trees.InvertBinaryTree_226;

import common.Difficulty;
import trees.TreeNode;

import static common.DifficultyLevel.EASY;

/**
 * <a href="https://leetcode.com/problems/invert-binary-tree">Invert Binary Tree</a>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)));
        System.out.println(new Solution().invertTree(root));
    }
}
