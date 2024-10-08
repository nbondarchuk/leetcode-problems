package trees.SumRootToLeafNumbers_129;

import common.Difficulty;
import trees.TreeNode;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertThat(new Solution().sumNumbers(root)).isEqualTo(25);
    }
}
