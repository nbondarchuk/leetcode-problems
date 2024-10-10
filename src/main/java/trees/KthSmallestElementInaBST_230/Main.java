package trees.KthSmallestElementInaBST_230;

import common.Difficulty;
import trees.TreeNode;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/kth-smallest-element-in-a-bst">Kth Smallest Element in a BST</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
        assertThat(new Solution().kthSmallest(root, 1)).isEqualTo(1);
    }
}
