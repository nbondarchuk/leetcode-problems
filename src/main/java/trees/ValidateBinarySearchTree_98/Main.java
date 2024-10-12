package trees.ValidateBinarySearchTree_98;

import common.Difficulty;
import trees.TreeNode;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/validate-binary-search-tree">Validate Binary Search Tree</a>
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
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertThat(new Solution().isValidBST(tree)).isTrue();
    }
}
