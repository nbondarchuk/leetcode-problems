package trees.BinaryTreeRightSideView_199;

import common.Difficulty;
import trees.TreeNode;

import java.util.List;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/binary-tree-right-side-view">Binary Tree Right Side View</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)));

        assertThat(new Solution1().rightSideView(root)).isEqualTo(List.of(1, 3, 4));
        assertThat(new Solution2().rightSideView(root)).isEqualTo(List.of(1, 3, 4));
    }
}
