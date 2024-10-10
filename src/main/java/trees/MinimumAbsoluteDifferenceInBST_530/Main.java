package trees.MinimumAbsoluteDifferenceInBST_530;

import common.Difficulty;
import trees.TreeNode;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/minimum-absolute-difference-in-bst">Minimum Absolute Difference in BST</a>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6));
        assertThat(new Solution().getMinimumDifference(root)).isEqualTo(1);

    }
}
