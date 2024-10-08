package trees.PathSum_112;

import common.Difficulty;
import trees.TreeNode;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/path-sum">Path Sum</a>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)));

        assertThat(new Solution().hasPathSum(root, 8)).isTrue();
        assertThat(new Solution().hasPathSum(root, 10)).isFalse();
    }
}
