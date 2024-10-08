package trees.BinarySearchTreeIterator_173;

import common.Difficulty;
import trees.TreeNode;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/binary-search-tree-iterator">Binary Search Tree Iterator</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(7,
                new TreeNode(3), new TreeNode(15, new TreeNode(9), new TreeNode(20)));

        check(new BSTIterator1(root));
        check(new BSTIterator2(root));
    }

    private static void check(BSTIterator iterator) {
        assertThat(iterator.next()).isEqualTo(3);
        assertThat(iterator.next()).isEqualTo(7);
        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo(9);
        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo(15);
        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo(20);
        assertThat(iterator.hasNext()).isFalse();
    }
}
