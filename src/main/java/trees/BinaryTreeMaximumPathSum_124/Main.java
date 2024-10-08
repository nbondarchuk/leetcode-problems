package trees.BinaryTreeMaximumPathSum_124;

import common.Difficulty;
import trees.TreeNode;

import static common.DifficultyLevel.HARD;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/binary-tree-maximum-path-sum">Binary Tree Maximum Path Sum</a>
 */
@Difficulty(HARD)
class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(-1), null);
        assertThat(new Solution().maxPathSum(root)).isEqualTo(2);
    }
}
