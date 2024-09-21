package trees.BinaryTreeLevelOrderTraversalII_107;

import common.Difficulty;
import common.Topics;
import trees.TreeNode;

import static common.DifficultyLevel.MEDIUM;
import static common.Topic.*;

/**
 * <a href="https://leetcode.com/problems/binary-tree-level-order-traversal-ii">Binary Tree Level Order Traversal II</a>
 */
@Topics({
        BFS,
        TREE,
        BINARY_TREE
})
@Difficulty(MEDIUM)
public class Main {

    public static void main(String[] args) {
        TreeNode leftSubTree = new TreeNode(9);
        TreeNode rightSubTree = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, leftSubTree, rightSubTree);

        System.out.println(new Solution().levelOrderBottom(root));
    }
}
