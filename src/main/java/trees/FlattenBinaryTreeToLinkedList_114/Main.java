package trees.FlattenBinaryTreeToLinkedList_114;

import common.Difficulty;
import common.Topics;
import trees.TreeNode;

import static common.DifficultyLevel.MEDIUM;
import static common.Topic.*;

/**
 * <a href="https://leetcode.com/problems/flatten-binary-tree-to-linked-list">Flatten Binary Tree to Linked List</a>
 */
@Difficulty(MEDIUM)
@Topics({
        DFS,
        TREE,
        STACK,
        LINKED_LIST,
        BINARY_TREE
})
public class Main {

    public static void main(String[] args) {
        TreeNode leftSubTree = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode rightSubTree = new TreeNode(5, null, new TreeNode(6));
        TreeNode root = new TreeNode(1, leftSubTree, rightSubTree);

        new Solution().flatten(root);

        System.out.println(root);
    }
}
